/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author keyew7019
 */
public class A2Q7 {
    
    public boolean isPalindrome(String s, int length) {
        if (s.length() == 0||s.length() == 1) {
            return true;
        }else
            
            if (s.charAt(0) == s.charAt(length -1)) {
                String ns = s.substring(1, length-1);
                return isPalindrome(ns,ns.length());
            }
        return false;
        }
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A2Q7 test = new A2Q7();
        
        System.out.println(test.isPalindrome("racecer", 7));
        
    }
}
