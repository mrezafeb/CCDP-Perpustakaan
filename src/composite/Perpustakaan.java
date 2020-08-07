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
public class Perpustakaan {
    public static void main(String[]args){
        Komik komik1 = new Komik("One Piece", 10000);
        Komik komik2 = new Komik("Detective Conan", 7000);
        
        Cart komikCart = new Cart();
        komikCart.addToCart(komik1);
        komikCart.addToCart(komik2);
        
        Novel novel1 = new Novel("Ayat Ayat Cinta", 15000);
        Novel novel2 = new Novel("Habibie dan Ainun", 20000);
        
        Cart novelCart = new Cart();
        novelCart.addToCart(novel1);
        novelCart.addToCart(novel2);
        
        Cart shopCart = new Cart();
        shopCart.addToCart(komikCart);
        shopCart.addToCart(novelCart);
        shopCart.showbukuDetail();
    } 
}
