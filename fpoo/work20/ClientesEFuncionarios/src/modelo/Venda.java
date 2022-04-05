package modelo;

import java.util.ArrayList;

public class Venda {
	
	private int codCliente;
	private int codFunc;
	private double valor;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}

	public Venda(int codCliente, int codFunc, double valor) {
		this.codCliente = codCliente;
		this.codFunc = codFunc;
		this.valor = valor;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString(ArrayList<Funcionario> funcionarios, ArrayList<Cliente> clientes) {
		String nomeFunc = "";
		String nomeCliente = "";
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getMatricula() == codFunc) {
				nomeFunc = funcionario.getNome();
			}
		}
		
		for (Cliente cliente : clientes) {
			if (cliente.getId() == codCliente) {
				nomeCliente = cliente.getNome();
			}
		}
		
		return nomeFunc + "\t" + nomeCliente + "\t" + valor;
	}
}
