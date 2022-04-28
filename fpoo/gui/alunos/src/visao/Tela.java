package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private static final long serialVersionUID = 1L;
	//Atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, nota1, nota2, nota3;
	private JButton cadastrar;
	
	Tela(){
		//Propriedades B�sicas
		setTitle("Cadastrar Aluno");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		//Conte�dos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		nome = new JTextField();
		nome.setBounds(120,20,200,30);
		rotulo2 = new JLabel("Notas:");
		rotulo2.setBounds(20,60,100,20);
		nota1 = new JTextField();
		nota1.setBounds(120,60,58,30);
		nota2 = new JTextField();
		nota2.setBounds(186,60,58,30);
		nota3 = new JTextField();
		nota3.setBounds(252,60,58,30);
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(120,100,200,30);
		
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nota1);
		painel.add(nota2);
		painel.add(nota3);
		painel.add(cadastrar);
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);
	}

}