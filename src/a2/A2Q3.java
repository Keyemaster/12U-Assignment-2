/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author keyew7019
 */
public class A2Q3 {
    
    
    public int triangle(int n){
        
        // BASE CASE
        if(n == 0){
            return 0;
        }else{
            return triangle(n-1) + n;
        }
        
        
        
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A2Q3 test = new A2Q3();
        
        int number1 = test.triangle(0);
        System.out.println("triangle(0) -> " + number1);
        int number2 = test.triangle(1);
        System.out.println("triangle(1) -> " + number2);
        int number3 = test.triangle(2);
        System.out.println("triangle(2) -> " + number3);
        int number4 = test.triangle(3);
        System.out.println("triangle(3) -> " + number4);
        int number5 = test.triangle(12);
        System.out.println("triangle(12) -> " + number5);
        
    }
}
