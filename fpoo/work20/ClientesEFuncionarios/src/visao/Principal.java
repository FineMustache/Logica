package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Funcionario;
import modelo.Venda;

public class Principal {
	private static Scanner s = new Scanner(System.in);
	private static ArrayList<Venda> vendas = new ArrayList();
	private static ArrayList<Cliente> clientes = new ArrayList();
	private static ArrayList<Funcionario> funcionarios = new ArrayList();
	private static int session = 0;
	public static void main(String[] args) throws ParseException {
		
		int menu = 0;
		
		funcionarios.add(new Funcionario(1, 0, "admin", "0", new SimpleDateFormat("dd/MM/yy").parse("01/01/01"), "1234"));
		
		while (menu != 8) {
			while (session == 0) {
				System.out.println("Digite o Login do Funcionário (matrícula)");
				int login = s.nextInt();
				
				System.out.println("Digite a Senha do Funcionário");
				String senha = s.next();
				
				for (Funcionario funcionario : funcionarios) {
					if(funcionario.getMatricula() == login && funcionario.validaSenha(senha)) {
						session = funcionario.getMatricula();
						System.out.println("Bem vindo, " + funcionario.getNome());
						break;
					}
				}
				
				if (session == 0) {
					System.out.println("Credenciais inválidas");
				}
			}
			System.out.println("Selecione uma Opção");
			System.out.println("1 - Cadastrar Funcionário\n2 - Cadastrar Cliente\n3 - Listar Funcionários\n4 - Listar Clientes\n5 - Cadastrar Venda\n6 - Listar Vendas\n7 - Encerrar Sessão\n8 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrarFuncionario();
				break;
				
			case 2:
				cadastrarCliente();
				break;
				
			case 3:
				listarFuncionarios();
				break;
				
			case 4:
				listarClientes();
				break;
				
				
			case 5:
				cadastrarVenda();
				break;
				
			case 6:
				listarVendas();
				break;
				
			case 7:
				encerrarSessao();
				break;
			case 8:
				System.out.println("Tchau");
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}

	}
	
	public static void cadastrarFuncionario() throws ParseException {
		int matricula = funcionarios.size() + 1;
		
		System.out.println("\nDigite o nome do Funcionário");
		String nome = s.next();
		
		System.out.println("\nDigite o telefone do Funcionário");
		String telefone = s.next();
		
		System.out.println("Digite a data de nascimento do Funcionário");
		Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(s.next());
		
		System.out.println("Digite o valor da comissão atual do Funcionário");
		double comissao = s.nextDouble();
		
		System.out.println("Digite a senha do Funcionário");
		String senha = s.next();
		
		funcionarios.add(new Funcionario(matricula, comissao, nome, telefone, nascimento, senha));
	}
	
	public static void cadastrarCliente() throws ParseException {
		int id = clientes.size() + 1;
		
		System.out.println("\nDigite o nome do Cliente");
		String nome = s.next();
		
		System.out.println("\nDigite o telefone do Cliente");
		String telefone = s.next();
		
		System.out.println("Digite a data de nascimento do Cliente");
		Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(s.next());
		
		System.out.println("Digite o valor do credito limite do Cliente");
		double creditoLimite = s.nextDouble();
		
		clientes.add(new Cliente(id, creditoLimite, nome, telefone, nascimento));
	}
	
	public static void listarFuncionarios() {
		if (funcionarios.size() < 1) {
			System.out.println("Nenhum funcionário cadastrado");
		} else {
			System.out.println("Matrícula\tNome\tTelefone\tNascimento\tComissão");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.toString());
			}
		}
		
	}
	
	public static void listarClientes() {
		if (clientes.size() < 1) {
			System.out.println("Nenhum clientes cadastrado");
		} else {
			System.out.println("ID\tNome\tTelefone\tNascimento\tCredito Limite");
			for (Cliente cliente : clientes) {
				System.out.println(cliente.toString());
			}
		}
		
	}
	
	public static void cadastrarVenda() {
		boolean repetir = true;
		int codCliente;

		do {
			
			System.out.println("Digite o ID do Cliente que realizou a compra");
			codCliente = s.nextInt();
			
			for (Cliente cliente : clientes) {
				if(codCliente == cliente.getId()) {
					repetir = false;
					System.out.println("Cliente: " + cliente.getNome());
				}
			}
			
			if(repetir) {
				System.out.println("Cliente não encontrado");
			}
			
		}while(repetir);
		
		System.out.println("Digite o valor da venda");
		double valor = s.nextDouble();
		
		vendas.add(new Venda(codCliente, session, valor));
		
		for (Cliente cliente : clientes) {
			if (cliente.getId() == codCliente && cliente.getCreditoLimite() > 0) {
				if (cliente.getCreditoLimite() < valor) {
					cliente.setCreditoLimite(0);
				} else {
					cliente.setCreditoLimite(cliente.getCreditoLimite() - valor);
				}
			}
		}
		
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getMatricula() == session) {
				funcionario.setComissao(funcionario.getComissao() + valor * 0.1);
			}
		}
	}
	
	public static void listarVendas() {
		if (vendas.size() < 1) {
			System.out.println("Nenhuma venda cadastrada");
		} else {
			System.out.println("Func\tCliente\tValor");
			for (Venda venda : vendas) {
				System.out.println(venda.toString(funcionarios, clientes));
			}
		}
	}
	
	public static void encerrarSessao() {
		
		int resp = 0;
		
		while (resp != 1 && resp != 2) {
			System.out.println("Deseja mesmo encerrar a sessão?\n1 - Sim, encerrar sessão\n2 - Não, ficar conectado");
			resp = s.nextInt();
			switch (resp) {
			case 1:
				session = 0;
				break;
			
			case 2:
				System.out.println("Logoff cancelado");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

}
