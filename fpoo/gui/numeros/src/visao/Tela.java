package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame{
	private static Random r = new Random();
	private static final long serialVersionUID = 1L;
	//Atributos da tela
	private JPanel painel;
	private JLabel rotulo1;
	private JTextField gerar;
	private JButton btnGerar;
	
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
		gerar = new JTextField();
		gerar.setBounds(100,70,180,80);
		gerar.setEditable(false);
		
		btnGerar = new JButton("Gerar Numeros");
		btnGerar.setBounds(120,20,200,30);
		btnGerar.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 10; i++) {
					gerar.setText(gerar.getText()+ " " + r.nextInt(100));
				}
            }
		});
		
		painel.add(rotulo1);
		painel.add(gerar);
		painel.add(btnGerar);
		
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);
	}

}