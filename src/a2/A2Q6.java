/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author keyew7019
 */
public class A2Q6 {

    public String convert(int n, int b) {
        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        int c = n / b;
        int r = n % b;
        // BASE CASE
        if (c == 0) {
            return Integer.toString(r);
        } else {
            if (r >= 10) {
                int f = r % 10;
                String h = letters[f];
                return convert(c, b) + h;
            }

            return convert(c, b) + Integer.toString(r);
        }




    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        A2Q6 test = new A2Q6();

        System.out.println(test.convert(1000, 2));
        System.out.println("");

    }
}
