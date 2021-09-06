/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fridge;

/**
 *
 * @author odyss
 */
public abstract class Product {
    
    private int iD;
    private String name;

    
    public Product(int iD, String name){
        this.iD = iD;
        this.name = name;
    }  
    
    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" + "iD=" + iD + ", name=" + name + '}';
    }
        
    
    
}
