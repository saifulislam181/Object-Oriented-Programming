/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Collections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashMap hm = new HashMap();
       int product_id;
       String name;
       double price;
       char grade;
     System.out.println("Enter the total number of products");
     int n=in.nextInt();
     for(int i=0;i<n;i++){
         System.out.print("Product Id: ");
         product_id=in.nextInt();
         System.out.print("Product Name:");
         name=in.next();
         System.out.print("Price: ");
         price=in.nextDouble();
         System.out.print("Grade: ");
         grade=in.next().charAt(0);
         hm.put(product_id,new Product(name,price,grade));
         
     }
    Set set = hm.entrySet();
// Get an iterator
    Iterator i = set.iterator();
// Display elements
Object o;
System.out.println("product Information");
    while(i.hasNext()) {
    Map.Entry me = (Map.Entry)i.next();
    product_id=(int)me.getKey();
    o=me.getValue();
    
    System.out.print("Product Id" +me.getKey() + "\n ");
    System.out.println(o);
    }
   /*

    o = hm.get(100);
    Product p=(Product)o;
    hm.put(100, new Product(p.name,p.price+1000,p.grade));
   
    o=hm.get(100);
    System.out.println(o);*/
}

        // TODO code application logic here
    }
    

