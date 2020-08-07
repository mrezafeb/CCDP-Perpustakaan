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
public class PinjamBukuFactory implements PerpusAbstractFactory{
    private String namaBuku;
    private String jenisBuku;
    
    PinjamBukuFactory(String namaBuku, String jenisBuku){
        this.namaBuku = namaBuku;
        this.jenisBuku = jenisBuku;
    }
    
    @Override
    public Perpus createPerpus(){
        return new PinjamBuku(namaBuku, jenisBuku);
    }

    @Override
    public Perpus2 createPerpus2() {
        return new PengembalianBuku(namaBuku, jenisBuku);
    }
}
