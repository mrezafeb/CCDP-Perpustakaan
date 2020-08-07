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
public class PerpusDemo {
    public static void main(String[]args){
        PinjamBukuFactory pinjamBukuFactory = new PinjamBukuFactory("Naruto","Komik") {};
        
        Perpus pinjamBuku = PerpusFactory.getnamaBuku(pinjamBukuFactory);
        System.out.println(pinjamBuku);
        
        PengembalianBukuFactory pengembalianBukuFactory = new PengembalianBukuFactory("Naruto","Komik"){};
        
        Perpus2 pengembalianBuku = perpus2Factory.getnamaBuku(pengembalianBukuFactory);
        System.out.println(pengembalianBuku);       
    }
}
