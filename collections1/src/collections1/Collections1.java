/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


/**
 *
 * @author User
 */
public class Collections1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LinkedList l = new LinkedList();
// add elements to the linked list
    l.add(new Person("Rahim",10));
    l.add(new Person("Karim",30));
    l.add(new Person("Amit",15));
    
    Collections.reverse(l);
    Iterator itr = l.iterator();
    while(itr.hasNext()) {
    Object element = itr.next();
    System.out.println(element + "\n");
    }
    System.out.println();
    
    
    }
    
}
