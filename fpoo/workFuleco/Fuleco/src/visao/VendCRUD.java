package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controle.ProdProcess;
import controle.VendProcess;
import modelo.Produto;
import modelo.Venda;
import modelo.VendaTableModel;

public class VendCRUD extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VendaTableModel model;

	public VendCRUD() {
		model = new VendaTableModel(VendProcess.vendas);
		initComponents();
	}

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		tfId = new javax.swing.JTextField();
		tfId.setEnabled(false);
		tfId.setText("" + (VendProcess.vendas.get(VendProcess.vendas.size() - 1).getId() + 1));
		tfIdProd = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		tfQtde = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		tfPTotal = new javax.swing.JTextField();
		tfPTotal.setEnabled(false);
		jLabel5 = new javax.swing.JLabel();
		cbPag = new javax.swing.JComboBox<>();
		jPanel2 = new javax.swing.JPanel();
		btnCadastrar = new javax.swing.JButton();
		btnBuscar = new javax.swing.JButton();
		btnAlterar = new javax.swing.JButton();
		btnAlterar.setEnabled(false);
		btnExcluir = new javax.swing.JButton();
		btnExcluir.setEnabled(false);
		btnVoltar = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(model);
		jScrollPane1.setViewportView(jTable1);

		jLabel1.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel1.setText("ID");

		tfId.setFont(new java.awt.Font("sansserif", 0, 14));

		tfIdProd.setFont(new java.awt.Font("sansserif", 0, 14));

		jLabel2.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel2.setText("ID Produto");

		tfQtde.setFont(new java.awt.Font("sansserif", 0, 14));

		jLabel3.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel3.setText("Quantidade");

		jLabel4.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel4.setText("Pre?o Total");

		tfPTotal.setFont(new java.awt.Font("sansserif", 0, 14));

		jLabel5.setFont(new java.awt.Font("sansserif", 0, 14));
		jLabel5.setText("Pagamento");

		cbPag.setFont(new java.awt.Font("sansserif", 0, 14));
		cbPag.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cr?dito", "Debito", "Pix" }));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(89, 89, 89).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(18, 18, 18)
								.addComponent(tfId))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(18, 18, 18)
								.addComponent(tfIdProd))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(18, 18, 18)
								.addComponent(tfQtde))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(18, 18, 18)
								.addComponent(tfPTotal))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5).addGap(18, 18, 18)
								.addComponent(cbPag, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(100, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfIdProd, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(tfQtde, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(tfPTotal, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(cbPag, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnCadastrar.setFont(new java.awt.Font("sansserif", 0, 14));
		btnCadastrar.setText("Cadastrar");
		btnCadastrar.setMaximumSize(new java.awt.Dimension(93, 25));
		btnCadastrar.setMinimumSize(new java.awt.Dimension(93, 25));
		btnCadastrar.setPreferredSize(new java.awt.Dimension(93, 25));

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
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap(64, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(49, 49, 49)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE)));

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Pedrecity Solutions - All Rights Reserved ? 2022");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(jScrollPane1))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7)
						.addContainerGap()));

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

		tfQtde.getDocument().addDocumentListener(new DocumentListener() {
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
					int qtde = Integer.parseInt(tfQtde.getText().replace(",", "."));
					double custo = 0d;
					for (Produto p : ProdProcess.produtos) {
						if(tfIdProd.getText() != null && Integer.parseInt(tfIdProd.getText()) == p.getId()) {
							custo = p.getpVenda() * qtde;
						} else {
							tfPTotal.setText("Calculando...");
						}
					}

					tfPTotal.setText(String.format("%.2f", custo));

				} catch (Exception e) {
					if (tfQtde.getText().length() == 0) {
						tfPTotal.setText("");
					} else {
						tfPTotal.setText("Calculando...");
					}

				}

			}
		});
	}
	
	
	private int getIndPag(String pag) {
		switch (pag) {
		case "Dinheiro":
			return 0;
			
		case "Cr?dito":
			return 1;
			
		case "D?bito":
			return 2;
			
		case "Pix":
			return 3;
			
		default:
			return -1;
		}
	}

	private void voltar() throws IOException {
		TelaInicial formTI = new TelaInicial();
		formTI.setVisible(true);
		this.setVisible(false);
	}
	
	private void cadastrar() {
		if (tfIdProd.getText().length() != 0 || tfQtde.getText().length() != 0 || tfPTotal.getText().length() != 0) {
			String venda = "";
			for (Produto p : ProdProcess.produtos) {
				if(Integer.parseInt(tfIdProd.getText()) == p.getId()) {
					venda = p.getNome();
				}
			}
			
			if (JOptionPane.showConfirmDialog(this, "Deseja mesmo cadastrar a venda do produto " + venda + "?") == 0) {
				VendProcess.vendas.add(new Venda(VendProcess.vendas.get(VendProcess.vendas.size() - 1).getId() + 1, Integer.parseInt(tfIdProd.getText()), Integer.parseInt(tfQtde.getText()), Double.parseDouble(tfPTotal.getText().replace(",", ".")), cbPag.getSelectedItem().toString()));
				model.refresh();
				jTable1.setModel(model = new VendaTableModel(VendProcess.vendas));
				VendProcess.salvar();
				
				resetInputs();
			} else {
				JOptionPane.showMessageDialog(this, "Cadastro Cancelado");
			}
			
		}
	}

	private void buscar() {
		String text = JOptionPane.showInputDialog(this, "Digite o ID do produto a ser buscado");

		try {
			int id = Integer.parseInt(text);

			for (Venda v : VendProcess.vendas) {
				if (id == v.getId()) {
					tfId.setText("" + id);
					tfIdProd.setText("" + v.getIdProd());
					tfQtde.setText(String.format("" + v.getQtde()));
					tfPTotal.setText(String.format("%.2f", v.getpTotal()));
					cbPag.setSelectedIndex(getIndPag(v.getPag()));

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
		if (tfIdProd.getText().length() != 0 || tfQtde.getText().length() != 0 || tfPTotal.getText().length() != 0) {

			int indice = -1;

			for (Venda v : VendProcess.vendas) {
				if (Integer.parseInt(tfId.getText()) == v.getId()) {
					indice = VendProcess.vendas.indexOf(v);
				}
			}

			VendProcess.vendas.get(indice).setIdProd(Integer.parseInt(tfIdProd.getText()));
			VendProcess.vendas.get(indice).setQtde(Integer.parseInt(tfQtde.getText()));
			VendProcess.vendas.get(indice).setpTotal(Double.parseDouble(tfPTotal.getText().replace(",", ".")));
			VendProcess.vendas.get(indice).setPag(cbPag.getSelectedItem().toString());

			VendProcess.salvar();
			model.refresh();
			jTable1.setModel(model = new VendaTableModel(VendProcess.vendas));

			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnExcluir.setEnabled(false);

			resetInputs();
		}
	}

	private void excluir() {
		if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja EXCLUIR essa Venda?") == 0) {
			Venda vendaTemp = null;
			for (Venda v : VendProcess.vendas) {
				if (v.getId() == Integer.parseInt(tfId.getText())) {
					vendaTemp = v;
				}
			}
			VendProcess.vendas.remove(VendProcess.vendas.indexOf(vendaTemp));

			VendProcess.salvar();
			resetInputs();

			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnExcluir.setEnabled(false);
			model.refresh();
			jTable1.setModel(model = new VendaTableModel(VendProcess.vendas));
		}
	}

	private void resetInputs() {
		tfIdProd.setText("");
		tfQtde.setText("");
		tfPTotal.setText("");
		cbPag.setSelectedIndex(0);

		tfId.setText("" + (VendProcess.vendas.get(VendProcess.vendas.size() - 1).getId() + 1));
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
			java.util.logging.Logger.getLogger(VendCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VendCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VendCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VendCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VendCRUD().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCadastrar;
	private javax.swing.JButton btnBuscar;
	private javax.swing.JButton btnAlterar;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JComboBox<String> cbPag;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField tfId;
	private javax.swing.JTextField tfIdProd;
	private javax.swing.JTextField tfQtde;
	private javax.swing.JTextField tfPTotal;
}