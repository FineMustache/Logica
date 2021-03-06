package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import controle.ProdProcess;

public class VendaTableModel extends AbstractTableModel {

    //aqui transformei em coluna cada propriedade de Funcionario
    //que eu quero que seja exibida na tabela  
    private String colunas[] = {"ID", "ID Produto", "Quantidade", "Preço Total", "Pagamento"};
    private ArrayList<Venda> vendas = new ArrayList<>(Arrays.asList(new Venda(-1, -1, 0, 0.00, "Dinheiro")));
    private final int COLUNA_ID = 0;
    private final int COLUNA_IDPRODUTO = 1;
    private final int COLUNA_QUANTIDADE = 2;
    private final int COLUNA_PTOTAL = 3;
    private final int COLUNA_PAGAMENTO = 4;

    public VendaTableModel(ArrayList<Venda> venda) {
        this.vendas = venda;
    }

    //retorna se a c�lula � edit�vel ou n�o
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    //retorna o total de itens(que virar�o linhas) da nossa lista
    @Override
    public int getRowCount() {
    	return vendas.size();
    }
    //retorna o total de colunas da tabela
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    //retorna o nome da coluna de acordo com seu indice
    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    //determina o tipo de dado da coluna conforme seu indice
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_ID:
                return Integer.class;
            case COLUNA_IDPRODUTO:
                return Integer.class;
            case COLUNA_QUANTIDADE:
                return Integer.class;
            case COLUNA_PTOTAL:
                return Double.class;
            case COLUNA_PAGAMENTO:
            	return String.class;
            default:
                return String.class;
        }
    }

    //preenche cada c�lula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    	Venda venda = this.vendas.get(rowIndex);

        switch (columnIndex) {
	        case COLUNA_ID:
	            return venda.getId();
	        case COLUNA_IDPRODUTO:
	            return venda.getIdProd();
	        case COLUNA_QUANTIDADE:
	            return venda.getQtde();
	        case COLUNA_PTOTAL:
	            return venda.getpTotal();
	        case COLUNA_PAGAMENTO:
	        	return venda.getPag();
	        }
        return null;
    }
    //altera o valor do objeto de acordo com a c�lula editada
    //e notifica a altera��o da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo m�todo � do tipo Object
        //mas como nossa tabela � de funcion�rios, � seguro(e at� recomend�vel) fazer o cast de suas propriedades
        Venda venda = this.vendas.get(rowIndex);
        //de acordo com a coluna, ele preenche a c�lula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
        case COLUNA_ID:
        	venda.setId(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_IDPRODUTO:
        	venda.setIdProd(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_QUANTIDADE:
        	venda.setQtde(Integer.parseInt(String.valueOf(aValue)));
            break;
        case COLUNA_PTOTAL:
        	venda.setpTotal(Double.parseDouble(String.valueOf(aValue).replace(",", ".")));
            break;
        case COLUNA_PAGAMENTO:
        	System.out.println(String.valueOf(aValue));
        	venda.setPag(String.valueOf(aValue));
            break;
        }
        //este m�todo � que notifica a tabela que houve altera��o de dados
        fireTableDataChanged();
    }
    
    public void refresh() {
    	fireTableDataChanged();
    }
}