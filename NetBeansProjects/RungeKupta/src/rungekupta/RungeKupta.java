/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rungekupta;

import com.sun.swing.internal.plaf.metal.resources.metal;

/**
 *
 * @author Kawaii
 */
public class RungeKupta {

    double xo;
    double xf;
    double yo;
    double uo;
    double h;
    int numIteraciones;
    DoubleFunction func;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getUo() {
        return uo;
    }

    public void setUo(double uo) {
        this.uo = uo;
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getYo() {
        return yo;
    }

    public void setYo(double yo) {
        this.yo = yo;
    }

    public RungeKupta(double xo, double yo, double uo, double h, double xf, DoubleFunction func) {
        this.xo = xo;
        this.yo = yo;
        this.uo = uo;
        this.h = h;
        this.xf = xf;
        this.numIteraciones = (int) Math.round((xf - xo) / h);
        this.numIteraciones += 1;
        this.func = func;
    }

    public double calcularAprox() {
        double[] xi = new double[(int) numIteraciones];
        double[] fx = new double[(int) numIteraciones];
        double[] m1 = new double[(int) numIteraciones];
        double[] m2 = new double[(int) numIteraciones];
        double[] m3 = new double[(int) numIteraciones];
        double[] m4 = new double[(int) numIteraciones];
        double[] k1 = new double[(int) numIteraciones];
        double[] k2 = new double[(int) numIteraciones];
        double[] k3 = new double[(int) numIteraciones];
        double[] k4 = new double[(int) numIteraciones];
        double[] yi = new double[(int) numIteraciones];
        double[] ui = new double[(int) numIteraciones];
        xi = llenarxi(xo, xf, h);
        System.out.println("Xi: " + xo + "  ui:  " + uo + "  yi: " + yo);
        for (int i = 0; i < numIteraciones; i++) {

            if (i == 0) {
                ui[0] = uo;
                yi[0] = yo;
            }
            System.out.println("\nXn: " + xi[i] + "  un:  " + ui[i] + "  yn: " + yi[i]);
            fx[i] = calcularfx(xi[i], yi[i], ui[i], func);
            System.out.println(fx[i]);
            System.out.println(Math.tanh(xi[i])-ui[i]);
//            System.out.println(Math.tanh(xi[i])-(ui[i]));
            m1[i] = func.m1(h, ui[i]);
            k1[i] = h * fx[i];
            m2[i] = func.m23(h, ui[i], k1[i]);
            k2[i] = h * func.apply(xi[i], yi[i], ui[i]);
            m3[i] = func.m23(h, ui[i], k2[i]);
            k3[i] = h * func.apply(xi[i] + (((double)1/(double)2) * h), yi[i] + (((double)1/(double)2) * m2[i]), ui[i] + ((0.5) * k2[i]));
            m4[i] = func.m4(h, ui[i], k3[i]);
            k4[i] = h * func.apply(xi[i] + h, yi[i] + m3[i], ui[i] + k3[i]);
            if (i != (numIteraciones - 1)) {
//                System.out.println("asdd");
                yi[i + 1] = yi[i] + (((double)1/(double)6)*(m1[i]+(2*m2[i])+(2*m3[i])+m4[i]));
                ui[i + 1] = ui[i] + (((double)1/(double)6)*(k1[i]+(2*k2[i])+(2*k3[i])+k4[i]));
            }
            System.out.println(i + "   " + numIteraciones);
        }
        System.out.println("   " + numIteraciones);
        return yi[yi.length - 1];
    };

    public double[] llenarxi(double x0, double xf, double h) {
        double[] aux1 = new double[(int) numIteraciones];
        int i = 0;
        for (double j = x0; j <= (xf + h); j += h) {
            if (i == 0) {
                aux1[i] = j;
            } else {
                aux1[i] = j;
            }
            i++;
        }
        return aux1;
    }

    ;

    public double calcularfx(double x, double y, double z, DoubleFunction func) {
        return func.apply(x, y, z);
    }
;
}
