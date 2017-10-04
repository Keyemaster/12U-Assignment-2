/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.Scanner;

/**
 *
 * @author keyew7019
 */
public class A2Q2 {
    
     public int digitalSum(int n){
        
        if(n <= 9){
            return n;
        }else{
            return n % 10 + digitalSum(n / 10);
        }
        
    }
    
    public int digitalRoot(int n){
        
        if(digitalSum(n) <= 9){
            return n;
        }else{
            
            return digitalSum(n) % 10 + digitalRoot(digitalSum(n) / 10);
            
        }
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        A2Q2 test = new A2Q2();
        // enter in number
        System.out.println("Please enter number ");
        int n = in.nextInt();
        int number1 = test.digitalSum(n);
        int number2 = test.digitalRoot(n);
        System.out.println("digitalRoot(" + n + ") -> " + number1 + " -> " + number2);
        
        
        
    }
}
