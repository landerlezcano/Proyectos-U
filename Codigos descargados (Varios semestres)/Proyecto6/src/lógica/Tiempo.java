/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class Tiempo {
    private int h,m,s;

    public Tiempo() {
    }

    public Tiempo(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return " "+this.h+":"+this.m+":"+this.s+" ";
    }

    
    
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    public void sumarSegundo(){
        s++;
        if(s==60){
            s=00;
            m++;
            if(m==60){
                m=00;
                h++;
                if(h==24){
                    h=00;
                    m=00;
                    s=00;
                }
            }
        }    
    }
    
    public Tiempo restarTiempo(Tiempo obj1) {
        Tiempo aux = new Tiempo(0,0,0);
        aux.setH(Math.abs(this.h-obj1.getH()));
        aux.setM(Math.abs(this.m-obj1.getM()));
        aux.setS(Math.abs(this.s-obj1.getS()));
        return aux;
    } 
    
    
}
