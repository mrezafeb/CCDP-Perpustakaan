/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author reza
 */
class ListIterator implements Iterator<String>{
    private String[] list;
    private int size;
    private int currentIndex = 0;
    
    ListIterator(String[] list, int size){
        this.list = list;
        this.size = size;
    }
    
    @Override
    public boolean hasNext(){
        return size > currentIndex;
    }
    
    @Override
    public String next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return list[currentIndex++];
    }
    
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
   
}
