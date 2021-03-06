package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import controle.ProdProcess;

public class ProdTableModel extends AbstractTableModel {

    //aqui transformei em coluna cada propriedade de Funcionario
    //que eu quero que seja exibida na tabela  
    private String colunas[] = {"ID", "Nome", "Preço de Custo", "Preço de Venda", "Lucro", "Estoque"};
    private ArrayList<Produto> produtos = new ArrayList<>(Arrays.asList(new Produto(-1, "4 reais de mussarela", 0.00, 0.00, 0.00, "0")));
    private final int COLUNA_ID = 0;
    private final int COLUNA_NOME = 1;
    private final int COLUNA_PCUSTO = 2;
    private final int COLUNA_PVENDA = 3;
    private final int COLUNA_LUCRO = 4;
    private final int COLUNA_ESTOQUE = 5;

    public ProdTableModel(ArrayList<Produto> prod) {
        this.produtos = prod;
    }

    //retorna se a c�lula � edit�vel ou n�o
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    //retorna o total de itens(que virar�o linhas) da nossa lista
    @Override
    public int getRowCount() {
    	return produtos.size();
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
            case COLUNA_NOME:
                return String.class;
            case COLUNA_PCUSTO:
                return Double.class;
            case COLUNA_PVENDA:
                return Double.class;
            case COLUNA_LUCRO:
            	return Double.class;
            case COLUNA_ESTOQUE:
            	return Integer.class;
            default:
                return String.class;
        }
    }

    //preenche cada c�lula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prod = this.produtos.get(rowIndex);

        switch (columnIndex) {
	        case COLUNA_ID:
	            return prod.getId();
	        case COLUNA_NOME:
	            return prod.getNome();
	        case COLUNA_PCUSTO:
	            return prod.getpCusto();
	        case COLUNA_PVENDA:
	            return prod.getpVenda();
	        case COLUNA_LUCRO:
	        	return prod.getLucro();
	        case COLUNA_ESTOQUE:
	        	return prod.getEstoque();
	        }
        return null;
    }
    //altera o valor do objeto de acordo com a c�lula editada
    //e notifica a altera��o da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo m�todo � do tipo Object
        //mas como nossa tabela � de funcion�rios, � seguro(e at� recomend�vel) fazer o cast de suas propriedades
        Produto prod = this.produtos.get(rowIndex);
        //de acordo com a coluna, ele preenche a c�lula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
        case COLUNA_ID:
        	prod.setId(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_NOME:
        	prod.setNome(String.valueOf(aValue));
            break;
        case COLUNA_PCUSTO:
        	prod.setpVenda(Double.parseDouble(String.valueOf(aValue).replace(",", ".")));
            break;
        case COLUNA_PVENDA:
        	prod.setpCusto(Double.parseDouble(String.valueOf(aValue).replace(",", ".")));
            break;
        case COLUNA_LUCRO:
        	prod.setLucro(Double.parseDouble(String.valueOf(aValue).replace(",", ".")));
            break;
        case COLUNA_ESTOQUE:
        	prod.setEstoque(aValue.toString());
            break;
        }
        //este m�todo � que notifica a tabela que houve altera��o de dados
        fireTableDataChanged();
    }
    
    public void refresh() {
    	fireTableDataChanged();
    }
}