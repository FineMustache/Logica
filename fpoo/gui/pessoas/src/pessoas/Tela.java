package pessoas;

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
	private JTextField nome, nasc;
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
		rotulo2 = new JLabel("Ano de Nasc:");
		rotulo2.setBounds(20,60,100,20);
		nasc = new JTextField();
		nasc.setBounds(120,60,200,30);
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(120,100,200,30);
		
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nasc);
		painel.add(cadastrar);
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);
	}

}