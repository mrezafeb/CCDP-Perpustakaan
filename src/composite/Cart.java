/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author reza
 */
class Cart implements buku{
    private List<buku> bukuList = new ArrayList<>();
    
    @Override
    public void showbukuDetail(){
        for (buku buku : bukuList){
            buku.showbukuDetail();
        }
    } 
    void addToCart(buku buku){
        bukuList.add(buku);
    }
    
    void removeFromCart(buku buku){
        bukuList.remove(buku);
    }
}
