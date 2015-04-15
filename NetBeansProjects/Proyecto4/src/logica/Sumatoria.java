/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Sumatoria {
    private int numUnos;

    public Sumatoria(int n) {
        this.numUnos = n;
    }

    public Sumatoria() {
    
    }

    public int getN() {
        return numUnos;
    }

    public void setN(int n) {
        this.numUnos = n;
    }
    
    
    public String generarSerie(){
        String cadena ="";
        int acum = 0;
        if(!(this.numUnos<=1)){
            if(this.numUnos==1){
                cadena = "1=1";
            }else{
                acum++;
                cadena="1";
                for(int i=0;i<this.numUnos-1;i++){
                    cadena+="+1";
                    acum++;
                }
                cadena+="="+acum;
            }
        }
        return cadena;
    }
}
