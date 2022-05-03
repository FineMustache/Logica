package pessoas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private static final long serialVersionUID = 1L;
	//Atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome;
	private JFormattedTextField nasc;
	private JButton cadastrar;
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
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
		nasc = new JFormattedTextField(format);
		nasc.setBounds(120,60,200,30);
		nasc.setColumns(10);
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(120,100,200,30);
		
		cadastrar.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				int now = Calendar.getInstance().get(Calendar.YEAR);
				
//				int idade = now - Integer.parseInt(nasc.getValue().toString());
//				mostrarIdade(idade);
				
				System.out.println(format.format(nasc.getValue()));
            }
		});
		
		
		
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
	
	private void mostrarIdade(int idade) {
		

		JOptionPane.showOptionDialog(
		                           null
		                         , Integer.toString(idade)         // Mensagem
		                         , "Idade"              // Titulo
		                         , JOptionPane.YES_NO_OPTION  
		                         , JOptionPane.PLAIN_MESSAGE                               
		                         , null // Icone. Você pode usar uma imagem se quiser, basta carrega-la e passar como referência
		                         , null 
		                         , "OK"    // Label do botão Default
		                       );
	}

}