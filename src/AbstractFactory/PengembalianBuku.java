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

public class PengembalianBuku extends Perpus2{
    private String namaBuku;
    private String jenisBuku;
    
    PengembalianBuku(String namaBuku, String jenisBuku){
        this.namaBuku = namaBuku;
        this.jenisBuku = jenisBuku;
    }
    
    @Override
    String getnamaBuku() {
        return this.namaBuku;
    }

    @Override
    String getjenisBuku() {
        return this.jenisBuku;
    }
}
