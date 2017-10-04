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
public class A2Q1 {

    public int digitalSum(int n){
        
        if(n <= 9){
            return n;
        }else{
       
            
            return n % 10 + digitalSum(n / 10);
            
        }
        
        
    }
    
        
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        A2Q1 test = new A2Q1();
        // enter in number
        System.out.println("Please enter number ");
        int n = in.nextInt();
        int number1 = test.digitalSum(n);
        System.out.println("digitalSum(" + n + ") -> " + number1);
        
        
        
        
    }

    int digitalRoot(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}