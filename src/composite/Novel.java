/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author reza
 */
class Novel implements buku{
    private String Namabuku;
    private int price;
    
    public Novel(String Namabuku, int price){
        this.Namabuku = Namabuku;
        this.price = price;
    }
    
    @Override
    public void showbukuDetail(){
        System.out.println(Namabuku+" Rp."+price);
    }
}
