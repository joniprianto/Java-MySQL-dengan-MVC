/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelMahasiswa extends AbstractTableModel{

    List<Mahasiswa> lstMhs;
    
    public TabelModelMahasiswa(List<Mahasiswa> lstMhs){
        this.lstMhs = lstMhs;
    }
    
    @Override
    public int getRowCount() {
        return this.lstMhs.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 :
                return "NIM";
            case 1 :
                return "Nama";
            case 2 :
                return "Kelas";
            case 3 :
                return "Prodi";
            default : 
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return lstMhs.get(rowIndex).getNim();
            case 1 :
                return lstMhs.get(rowIndex).getNama();
            case 2 :
                return lstMhs.get(rowIndex).getKelas();
            case 3 :
                return lstMhs.get(rowIndex).getProdi();
            default : 
                return null;
        }
    }
    
}
