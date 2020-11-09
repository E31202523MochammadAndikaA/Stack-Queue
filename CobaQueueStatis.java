/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/** 
 *
 * @author ANDIKA
 */
public class CobaQueueStatis {
  public static void main(String[] args){
            Queue Q = new Queue();
            Q.createEmpty();
            Q.printQueue();
            
            System.out.println("====================");
            
            Q.add("E31202536", "Fadil", 98);
            Q.add("E31201951", "Mashita", 99);
            Q.add("E31202278", "Chaidar", 99);
            
            Q.printQueue();
            System.out.println("====================");
            Q.del();
            Q.del();
            System.out.println("====================");       
    }        
}