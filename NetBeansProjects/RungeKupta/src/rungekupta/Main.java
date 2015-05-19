/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rungekupta;

/**
 *
 * @author Kawaii
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RungeKupta obj1 = new RungeKupta((double)0, (double)0, (double)-1, (double)0.05, (double)1.45, new DoubleFunction() {
            @Override
            public double apply(double x, double y, double z) {
                return Math.tanh(x)-(-z);
            }
        });
        System.out.println(obj1.calcularAprox());
    }

}
