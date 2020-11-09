/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDIKA
 */
public class CobaStackStatis {
    public static void main(String[] args) {
        Stack S = new Stack();
        
        S.createEmpty();
        S.printStack();
        
        System.out.println("=================================");
        
        S.push("14822", "Shinta", 72.43 );
        S.push("14823", "Dewi", 62.21 );
        S.push("1424", "Dita", 89.45 );
        
        S.printStack();
        
        System.out.println("=================================");
        
        S.pop();
        S.pop();
        S.printStack();
        
        System.out.println("=================================");
        
    }
}
