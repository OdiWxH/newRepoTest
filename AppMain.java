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
public class AppMain {

    public static void main(String[] args) {

        FridgeApp myFridge = new FridgeApp();
        FridgeApp myFridge2 = new FridgeApp();


        /*       Vegs veg1 = new Vegs(1, "Orange");
        Vegs veg2 = new Vegs(1, "Apple");
        Vegs veg3 = new Vegs(1, "Banana");

        myFridge.fillFridge(veg1); // myFridge einai to course gia mena
        myFridge.fillFridge(veg2);
        myFridge.fillFridge(veg3); // we can do it with for 
         */
        for (int i = 0; i < 5; i++) {
            String temp = "Veg " + i;
            String temp2 = "Meat " + i;
            myFridge.fillFridge(new Vegs(i, temp));
            myFridge2.fillFridge(new Meat(i, temp2));
        }

        // can mke to mudels and then call them
        for (int i = 5; i <= 10; i++) {
             String temp = "Veg " + i;
            String temp2 = "Meat " + i;
            myFridge.fillFridge(new Vegs(i, temp));
            myFridge2.fillFridge(new Meat(i, temp2));
        }

        myFridge.listProducts();
        myFridge2.listProducts();

        // fill fridge with products
        //list products
    }
}


/* Many times promt input
public class Sol{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

       while(sc.hasNextLine()){

           System.out.println(sc.nextLine());
       }

    }
}

OR
 
Scanner  in    = new Scanner(System.in);

System.out.printf("xxxxxxxxxxxxxxx ");        
String[] input = new String[in.nextInt()];

for (int i = 0; i < input.length; i++) {
    input[i] = in.nextLine();
}

for (String s : input) {
    System.out.println(s);
}


*/ 