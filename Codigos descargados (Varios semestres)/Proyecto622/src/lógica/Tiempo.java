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
        this.s++;
        if(this.s==60){
            this.s=00;
            this.m++;
            if(this.m==60){
                this.m=00;
                this.h++;
                if(h==24){
                    this.h=00;
                    this.m=00;
                    this.s=00;
                }
            }
        }    
    }
    
    public Tiempo restarTiempo(Tiempo obj2) {
        Tiempo aux = new Tiempo();
        aux.h=obj2.getH()-this.h;
        aux.m=obj2.getM()-this.h;
        aux.s=obj2.getS()-this.h;
        return aux;
    } 
    
    
}
