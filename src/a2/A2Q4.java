/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author keyew7019
 */
public class A2Q4 {

    public int hailstone(int n){
        
        // BASE CASE
        if(n == 0 || n == 1){
            return 1;
        }
        if(n % 2 == 0){
            System.out.println(n);
            return hailstone(n / 2);
        }else{
            System.out.println(n);
            return hailstone(3 * n + 1);
        }
        
        
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A2Q4 test = new A2Q4();
        
        int number1 = test.hailstone(12);
        System.out.println("hailstone(12) -> " + number1);
        
        
        
    }
}
