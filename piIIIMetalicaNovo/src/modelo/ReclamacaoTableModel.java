/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a_nin
 */
public class ReclamacaoTableModel extends AbstractTableModel{

    private List<ArquivoReclamacao> dados = new ArrayList<>();
    private String[] colunas = {"ID","Data","Ano","Mes","CanalEntrada","Condicao","GrupoEcoNorm","Tipo","Servico","Modalidade","Motivo","UF","QtdeSolic"};
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getDataExtracao();
            case 2:
                return dados.get(linha).getAno(); 
            case 3:
                return dados.get(linha).getMes();
            case 4:
                return dados.get(linha).getCanalEntrada();
            case 5:
                return dados.get(linha).getCondicao();
            case 6:
                return dados.get(linha).getGrupoEconNorm();
            case 7:
                return dados.get(linha).getTipo();
            case 8:
                return dados.get(linha).getServico();
            case 9:
                return dados.get(linha).getModalidade();
            case 10:
                return dados.get(linha).getModalidade();
            case 11:
                return dados.get(linha).getUF();
            case 12:
                return dados.get(linha).getQtdeSolic();
        }
        return null;
    }
    
    
    //Metodos
    
    public void addRow(ArquivoReclamacao dados){
        this.dados.add(dados);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
        
    }
    
    
    
}
