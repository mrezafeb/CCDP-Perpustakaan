/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author reza
 */
public abstract class Perpus {
    abstract String getnamaBuku();
    abstract String getjenisBuku();
   
    @Override
    public String toString(){
        return "Peminjaman Buku "+this.getnamaBuku()+" jenis " +this.getjenisBuku();
    }
}

   