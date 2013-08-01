/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai;


import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gustavo_monteiro
 */
public class MarcaTabelModel extends AbstractTableModel {
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    
    private List<Marca> linhas;
    
    private String[] colunas = {"Id", "Nome"};
    
    /*
     * Retorna a quantidade de linhas da tabela
     */
    
    public int getRowCount() {
        return linhas.size();
      
    }
    
    /*
     * Retorna a quantidade de colunas
     */

    
    public int getColumnCount() {
        return colunas.length;
    }

    /*
     * Retorna os dados do objeto da linha
     */
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pegar o conteúdo da linha
        Marca m = linhas.get(row);
        
        if(columnIndex == COL_ID){
            return m.getId();
        }else(COL_NOME == COL_NOME){
        return m.getNome();
    }
        
    }
    
}
