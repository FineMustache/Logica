package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controle.ProdProcess;
import modelo.ProdTableModel;
import modelo.Produto;

public class ProdCRUD extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProdTableModel model;

	public ProdCRUD() {
		model = new ProdTableModel(ProdProcess.produtos);
		initComponents();
	}

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		tfId = new javax.swing.JTextField();
		tfId.setText("" + (ProdProcess.produtos.get(ProdProcess.produtos.size() - 1).getId() + 1));
		tfId.setEnabled(false);
		tfNome = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		tfPCusto = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		tfPVenda = new javax.swing.JTextField();
		tfPVenda.setEnabled(false);
		jLabel4 = new javax.swing.JLabel();
		tfLucro = new javax.swing.JTextField();
		tfLucro.setEnabled(false);
		jLabel5 = new javax.swing.JLabel();
		tfEstoque = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		btnCadastrar = new javax.swing.JButton();
		btnBuscar = new javax.swing.JButton();
		btnAlterar = new javax.swing.JButton();
		btnAlterar.setEnabled(false);
		btnExcluir = new javax.swing.JButton();
		btnExcluir.setEnabled(false);
		btnVoltar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(model);
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel1.setText("ID");

		jLabel2.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel2.setText("Nome");

		jLabel3.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel3.setText("Pre?o de Custo");

		jLabel4.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel4.setText("Pre?o de Venda");

		jLabel5.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel5.setText("Lucro");

		jLabel6.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel6.setText("Estoque");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(tfLucro, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
										.addComponent(tfPVenda)
										.addComponent(tfEstoque, javax.swing.GroupLayout.Alignment.LEADING)))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(22, 22, 22)
								.addComponent(tfPCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(jLabel1))
								.addGap(18, 18, 18).addGroup(
										jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, 255,
														Short.MAX_VALUE)
												.addComponent(tfNome))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(19, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(tfPCusto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(tfPVenda, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(tfLucro, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Pedrecity Solutions - All Rights Reserved ? 2022");

		btnCadastrar.setFont(new java.awt.Font("sansserif", 0, 14));
		btnCadastrar.setText("Cadastrar");

		btnBuscar.setFont(new java.awt.Font("sansserif", 0, 14));
		btnBuscar.setText("Buscar");

		btnAlterar.setFont(new java.awt.Font("sansserif", 0, 14));
		btnAlterar.setText("Alterar");

		btnExcluir.setFont(new java.awt.Font("sansserif", 0, 14));
		btnExcluir.setText("Deletar");

		btnVoltar.setFont(new java.awt.Font("sansserif", 0, 14));
		btnVoltar.setText("Voltar");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(89, 89, 89)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(94, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jPanel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(18, 18, 18).addComponent(jLabel7).addContainerGap()));

		pack();

		btnVoltar.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					voltar();
				} catch (IOException e1) {
					System.out.println(e.toString());
				}
			}
		});

		btnCadastrar.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});

		btnBuscar.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});

		btnAlterar.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				alterar();
			}
		});

		btnExcluir.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				excluir();
			}
		});

		tfPCusto.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

				try {
					double custo = Double.parseDouble(tfPCusto.getText().replace(",", "."));

					tfPVenda.setText(String.format("%.2f", custo + (custo * 20 / 100)));
					tfLucro.setText(String.format("%.2f", custo * 20 / 100));

				} catch (Exception e) {
					if (tfPCusto.getText().length() == 0) {
						tfPVenda.setText("");
						tfLucro.setText("");
					} else {
						tfPVenda.setText("Calculando...");
						tfLucro.setText("Calculando...");
					}

				}

			}
		});
	}

	private void voltar() throws IOException {
		TelaInicial formTI = new TelaInicial();
		formTI.setVisible(true);
		this.setVisible(false);
	}

	private void cadastrar() {
		if (tfNome.getText().length() != 0 || tfPCusto.getText().length() != 0 || tfPVenda.getText().length() != 0
				|| tfLucro.getText().length() != 0 || tfEstoque.getText().length() != 0) {
			ProdProcess.produtos.add(new Produto(ProdProcess.produtos.get(ProdProcess.produtos.size() - 1).getId() + 1,
					tfNome.getText(), Double.parseDouble(tfPCusto.getText().replace(",", ".")),
					Double.parseDouble(tfPVenda.getText().replace(",", ".")),
					Double.parseDouble(tfLucro.getText().replace(",", ".")), tfEstoque.getText()));
			ProdProcess.salvar();
			model.refresh();
			jTable1.setModel(model = new ProdTableModel(ProdProcess.produtos));

			resetInputs();
		}
	}

	private void buscar() {
		String text = JOptionPane.showInputDialog(this, "Digite o ID do produto a ser buscado");

		try {
			int id = Integer.parseInt(text);

			for (Produto p : ProdProcess.produtos) {
				if (id == p.getId()) {
					tfId.setText("" + id);
					tfNome.setText(p.getNome());
					tfPCusto.setText(String.format("%.2f", p.getpCusto()));
					tfPVenda.setText(String.format("%.2f", p.getpVenda()));
					tfLucro.setText(String.format("%.2f", p.getLucro()));
					tfEstoque.setText(p.getEstoque());

					btnCadastrar.setEnabled(false);
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "ID inv?lido!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void alterar() {
		if (tfNome.getText().length() != 0 || tfPCusto.getText().length() != 0 || tfPVenda.getText().length() != 0
				|| tfLucro.getText().length() != 0 || tfEstoque.getText().length() != 0) {

			int indice = -1;

			for (Produto p : ProdProcess.produtos) {
				if (Integer.parseInt(tfId.getText()) == p.getId()) {
					indice = ProdProcess.produtos.indexOf(p);
				}
			}

			ProdProcess.produtos.get(indice).setNome(tfNome.getText());
			ProdProcess.produtos.get(indice).setpCusto(Double.parseDouble(tfPCusto.getText().replace(",", ".")));
			ProdProcess.produtos.get(indice).setpVenda(Double.parseDouble(tfPVenda.getText().replace(",", ".")));
			ProdProcess.produtos.get(indice).setLucro(Double.parseDouble(tfLucro.getText().replace(",", ".")));
			ProdProcess.produtos.get(indice).setEstoque(tfEstoque.getText());

			ProdProcess.salvar();
			model.refresh();
			jTable1.setModel(model = new ProdTableModel(ProdProcess.produtos));

			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnExcluir.setEnabled(false);

			resetInputs();
		}
	}

	private void excluir() {
		if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja EXCLUIR esse Produto?") == 0) {
			Produto prodTemp = null;
			for (Produto p : ProdProcess.produtos) {
				if (p.getId() == Integer.parseInt(tfId.getText())) {
					prodTemp = p;
				}
			}

			ProdProcess.produtos.remove(ProdProcess.produtos.indexOf(prodTemp));

			ProdProcess.salvar();
			resetInputs();

			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnExcluir.setEnabled(false);
			model.refresh();
			jTable1.setModel(model = new ProdTableModel(ProdProcess.produtos));
		}
	}

	private void resetInputs() {
		tfNome.setText("");
		tfPCusto.setText("");
		tfPVenda.setText("");
		tfLucro.setText("");
		tfEstoque.setText("");

		tfId.setText("" + (ProdProcess.produtos.get(ProdProcess.produtos.size() - 1).getId() + 1));
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ProdCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ProdCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ProdCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ProdCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new ProdCRUD().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCadastrar;
	private javax.swing.JButton btnBuscar;
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField tfId;
	private javax.swing.JTextField tfNome;
	private javax.swing.JTextField tfPCusto;
	private javax.swing.JTextField tfPVenda;
	private javax.swing.JTextField tfLucro;
	private javax.swing.JTextField tfEstoque;
}
