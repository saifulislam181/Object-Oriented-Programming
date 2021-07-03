/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections1;

/**
 *
 * @author User
 */
class Person {
    private String name;    
    private int NID;
    Person(String name, int NID) {
    this.name=name;
    this.NID=NID;
    }
    public String toString() {
    return "person name "+this.name + "\tNID " + Integer.toString(this.NID);
    }

  
    
}
