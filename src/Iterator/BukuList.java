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
public class BukuList implements Iterable<String>{
    private static final int MAX_SIZE = 4;
    private int length = 0;
    private String [] list; 
    BukuList(){
        list = new String [MAX_SIZE];
    }
    public void addBuku(String bukuName){
        if(length >= MAX_SIZE){
            System.out.println("Slot buku sudah penuh");
        }else{
            list[length++]= bukuName;
        }
    }
    @Override
    public Iterator<String> iterator(){
        return new ListIterator(list, length);
    }
}
