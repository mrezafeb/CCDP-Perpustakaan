/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Iterator;


/**
 *
 * @author reza
 */
public class Demo {
    public static void main(String[] args){
        BukuList bukuList = new BukuList();
        
        bukuList.addBuku("Harry Potter");
        bukuList.addBuku("Laskar Pelangi");
        bukuList.addBuku("Perahu Kertas");
        bukuList.addBuku("Supernova");
        
        Iterator<String> iterator = bukuList.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
