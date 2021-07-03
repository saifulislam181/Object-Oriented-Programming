/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections2;

/**
 *
 * @author User
 */
public class Product {
    public String name;
    public double price;
    public char grade;
    public Product(){
        
    }
    public Product(String name, double price, char grade){
        this.name=name;
        this.price=price;
        this.grade=grade;
    }
    public String toString(){
        return "Product name "+this.name+" price"+Double.toString(price)+ "GRADE "+this.grade+"\n";
    }
    
}
