package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import controle.PetProcess;

public class PetsTableModel extends AbstractTableModel {

    //aqui transformei em coluna cada propriedade de Funcionario
    //que eu quero que seja exibida na tabela  
    private String colunas[] = {"ID", "Espécie", "Nome", "Raça", "Peso", "Idade", "Dono", "Telefone"};
    private ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(new Pet(-1, "4 reais de mussarela", "Naldo", "Tirolez", 1, "30/04/2022", "Guilherme", "(19)98452-6978")));
    private final int COLUNA_ID = 0;
    private final int COLUNA_ESPECIE = 1;
    private final int COLUNA_NOME = 2;
    private final int COLUNA_RACA = 3;
    private final int COLUNA_PESO = 4;
    private final int COLUNA_IDADE = 5;
    private final int COLUNA_DONO = 6;
    private final int COLUNA_TELEFONE = 7;

    public PetsTableModel(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    //retorna se a célula é editável ou não
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    //retorna o total de itens(que virarão linhas) da nossa lista
    @Override
    public int getRowCount() {
    	return pets.size();
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
            case COLUNA_ESPECIE:
                return String.class;
            case COLUNA_NOME:
                return String.class;
            case COLUNA_RACA:
                return String.class;
            case COLUNA_PESO:
            	return Float.class;
            case COLUNA_IDADE:
            	return Integer.class;
            case COLUNA_DONO:
            	return String.class;
            case COLUNA_TELEFONE:
            	return String.class;
            default:
                return String.class;
        }
    }

    //preenche cada célula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pet pet = this.pets.get(rowIndex);

        switch (columnIndex) {
	        case COLUNA_ID:
	            return pet.getId();
	        case COLUNA_ESPECIE:
	            return pet.getEspecie();
	        case COLUNA_NOME:
	            return pet.getNomePet();
	        case COLUNA_RACA:
	            return pet.getRaca();
	        case COLUNA_PESO:
	        	return pet.getPeso();
	        case COLUNA_IDADE:
	        	return pet.obterIdade();
	        case COLUNA_DONO:
	        	return pet.getNomeDono();
	        case COLUNA_TELEFONE:
	        	return pet.getTelefone();
	        }
        return null;
    }
    //altera o valor do objeto de acordo com a célula editada
    //e notifica a alteração da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo método é do tipo Object
        //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
        Pet pet = this.pets.get(rowIndex);
        //de acordo com a coluna, ele preenche a célula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
        case COLUNA_ID:
        	pet.setId(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_ESPECIE:
        	pet.setEspecie(String.valueOf(aValue));
            break;
        case COLUNA_NOME:
        	pet.setNomePet(String.valueOf(aValue));
            break;
        case COLUNA_RACA:
        	pet.setRaca(String.valueOf(aValue));
            break;
        case COLUNA_PESO:
        	pet.setPeso((float) aValue);
            break;
        case COLUNA_IDADE:
//        	pet.setNascimento(String.valueOf(aValue));
            break;
        case COLUNA_DONO:
        	pet.setNomeDono(String.valueOf(aValue));
            break;
        case COLUNA_TELEFONE:
        	pet.setTelefone(String.valueOf(aValue));
            break;
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }
    
    public void refresh() {
    	fireTableDataChanged();
    }
}