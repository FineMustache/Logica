package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ManutencaoTableModel extends AbstractTableModel {

    //aqui transformei em coluna cada propriedade de Funcionario
    //que eu quero que seja exibida na tabela  
    private String colunas[] = {"ID", "Data", "Equipamento", "Custo da Hora", "Tempo Gasto", "Total"};
    private ArrayList<Manutencao> manutencoes = new ArrayList<>(Arrays.asList(new Manutencao(-1, new Date(), "Tirolez", 0d, 0d)));
    private final int COLUNA_ID = 0;
    private final int COLUNA_DATA = 1;
    private final int COLUNA_EQUIPAMENTO = 2;
    private final int COLUNA_CUSTO = 3;
    private final int COLUNA_TEMPO = 4;
    private final int COLUNA_TOTAL = 5;

    public ManutencaoTableModel(ArrayList<Manutencao> manutencao) {
        this.manutencoes = manutencao;
    }

    //retorna se a c�lula � edit�vel ou n�o
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    //retorna o total de itens(que virar�o linhas) da nossa lista
    @Override
    public int getRowCount() {
    	return manutencoes.size();
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
            case COLUNA_DATA:
                return String.class;
            case COLUNA_EQUIPAMENTO:
                return String.class;
            case COLUNA_CUSTO:
                return Double.class;
            case COLUNA_TEMPO:
            	return Double.class;
            case COLUNA_TOTAL:
            	return Double.class;
            default:
                return String.class;
        }
    }

    //preenche cada c�lula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Manutencao manutencao = this.manutencoes.get(rowIndex);

        switch (columnIndex) {
	        case COLUNA_ID:
	            return manutencao.getId();
	        case COLUNA_DATA:
	            return new SimpleDateFormat("dd/MM/yyyy").format(manutencao.getData());
	        case COLUNA_EQUIPAMENTO:
	            return manutencao.getEquipamento();
	        case COLUNA_CUSTO:
	            return manutencao.getCustoHora();
	        case COLUNA_TEMPO:
	        	return manutencao.getTempoGasto();
	        case COLUNA_TOTAL:
	        	return manutencao.getTotal();
	        }
        return null;
    }
    //altera o valor do objeto de acordo com a c�lula editada
    //e notifica a altera��o da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo m�todo � do tipo Object
        //mas como nossa tabela � de funcion�rios, � seguro(e at� recomend�vel) fazer o cast de suas propriedades
        Manutencao manutencao = this.manutencoes.get(rowIndex);
        //de acordo com a coluna, ele preenche a c�lula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
        case COLUNA_ID:
        	manutencao.setId(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_DATA:
        	try {
				manutencao.setData(new SimpleDateFormat("dd/MM/yyyy").parse(String.valueOf(aValue)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
            break;
        case COLUNA_EQUIPAMENTO:
        	manutencao.setEquipamento(String.valueOf(aValue));
            break;
        case COLUNA_CUSTO:
        	manutencao.setCustoHora(Double.parseDouble(String.valueOf(aValue)));
            break;
        case COLUNA_TEMPO:
        	manutencao.setTempoGasto(Double.parseDouble(String.valueOf(aValue)));
            break;
        }
        //este m�todo � que notifica a tabela que houve altera��o de dados
        fireTableDataChanged();
    }
    
    public void refresh() {
    	fireTableDataChanged();
    }
}