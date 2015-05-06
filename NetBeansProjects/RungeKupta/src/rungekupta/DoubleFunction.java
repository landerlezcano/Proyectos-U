/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rungekupta;

/**
 *
 * @author Kawaii
 */
public abstract class DoubleFunction {
    public abstract double apply(double x,double y,double z);

    public double m1(double h, double un){
        return h*un;
    }
    public double m23(double h, double un, double k){
        return h*((un)+(((double)1/(double)2)*k));
    }
    public double m4(double h, double un, double k){
        return h*(un+k);
    }
}
