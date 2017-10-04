/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author keyew7019
 */
public class A2Q5 {

    public void  binaryConvert(int n){
        
        // BASE CASE
        if(n == 0){
            
            n = n / 2; 
        }
        else if(n % 2 == 0){
            binaryConvert(n/2);
            System.out.print(0);
        }else{
            binaryConvert(n/2);
            System.out.print(1);
        }
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A2Q5 test = new A2Q5();
        
        test.binaryConvert(13);
        System.out.println("");
        
        
    }
}
