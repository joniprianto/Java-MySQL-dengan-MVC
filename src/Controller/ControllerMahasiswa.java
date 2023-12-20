/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMahasiswa;
import DAOInterface.IDAOMahasiswa;
import Model.Mahasiswa;
import Model.TabelModelMahasiswa;
import View.FormMhs;
import java.util.List;

public class ControllerMahasiswa {
    FormMhs frmMahasiswa;
    IDAOMahasiswa iMahasiswa;
    List<Mahasiswa> lstMahasiswa;
    
    public ControllerMahasiswa(FormMhs frmMahasiswa){
        this.frmMahasiswa = frmMahasiswa;
        iMahasiswa = new DAOMahasiswa();
    }
    
    public void isiTabel(){
        lstMahasiswa = iMahasiswa.getAll();
        TabelModelMahasiswa tabelMhs = new TabelModelMahasiswa(lstMahasiswa);
        frmMahasiswa.getTabelData().setModel(tabelMhs);
    }
    
    public void insert (){
        Mahasiswa b = new Mahasiswa();
        b.setNim(frmMahasiswa.gettxtNim().getText());
        b.setNama(frmMahasiswa.gettxtNama().getText());
        b.setKelas(frmMahasiswa.gettxtKelas().getText());
        b.setProdi(frmMahasiswa.gettxtProdi().getText());
        iMahasiswa.insert(b);
    }
    
    public void reset (){
        frmMahasiswa.gettxtNim().setText("");
        frmMahasiswa.gettxtNama().setText("");
        frmMahasiswa.gettxtKelas().setText("");
        frmMahasiswa.gettxtProdi().setText("");
    }
    
    public void isiField(int row){
        frmMahasiswa.gettxtNim().setText(lstMahasiswa.get(row).getNim().toString());
        frmMahasiswa.gettxtNama().setText(lstMahasiswa.get(row).getNama().toString());
        frmMahasiswa.gettxtKelas().setText(lstMahasiswa.get(row).getKelas().toString());
        frmMahasiswa.gettxtProdi().setText(lstMahasiswa.get(row).getProdi().toString());
    }
    
    public void update(){
        Mahasiswa b =new Mahasiswa();
        b.setNama(frmMahasiswa.gettxtNama().getText());
        b.setKelas(frmMahasiswa.gettxtKelas().getText());
        b.setProdi(frmMahasiswa.gettxtProdi().getText());
        b.setNim(frmMahasiswa.gettxtNim().getText());
        iMahasiswa.update(b);
    }
    
    public void delete(){
        Mahasiswa b = new Mahasiswa();
        b.setNim(frmMahasiswa.gettxtNim().getText());
        iMahasiswa.delete(frmMahasiswa.gettxtNim().getText());
    }
}
