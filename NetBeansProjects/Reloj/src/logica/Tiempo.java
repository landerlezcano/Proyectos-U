/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import static java.lang.Math.abs;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
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
    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setS(int s) {
        this.s = s;
    }
    @Override
    public String toString() {
        return " "+this.h+":"+this.m+":"+this.s+" ";
    }
    public void sumarSegundo(){
         s++;
        if(s==60){
            m++;
            s=0;
            if(m==60){
               h++;
               m=0;
               if(h==24){
                   h=0;
               }
            }
        } 
    }  
    public Tiempo restarTiempo(Tiempo obj1){
        Tiempo aux=new Tiempo();
        aux.setH(abs(this.h-obj1.getH()));
        aux.m=abs(this.m-obj1.m);
        aux.s=abs(this.s-obj1.s);
        
        return(aux);
    }
}
