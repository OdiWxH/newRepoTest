/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fridge;

import java.util.ArrayList;

/**
 *
 * @author odyss
 */
public class FridgeApp {
//Has-a Product
    
    ArrayList<Product> myProductList = new ArrayList();
    
    public ArrayList<Product> fillFridge(Product prod){
       myProductList.add(prod);
       return myProductList;
    }
            
            
            
    public void listProducts(){
       for(Product prod: myProductList){
           System.out.println(prod);
       }
    }        
            
    
}
