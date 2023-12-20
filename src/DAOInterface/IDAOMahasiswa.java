/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.Mahasiswa;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public interface IDAOMahasiswa {
    public List<Mahasiswa> getAll();
    public void insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(String nim);    
}
