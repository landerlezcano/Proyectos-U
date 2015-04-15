/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Persona {
    
    private int edad;
    private int añoNac;
    private int mesNac;
    private int díaNac;

    public Persona() {
    }

    public Persona(int añoNac, int mesNac, int díaNac) {
        this.añoNac = añoNac;
        this.mesNac = mesNac;
        this.díaNac = díaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(int añoNac) {
        this.añoNac = añoNac;
    }

    public int getMesNac() {
        return mesNac;
    }

    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }

    public int getDíaNac() {
        return díaNac;
    }

    public void setDíaNac(int díaNac) {
        this.díaNac = díaNac;
    }
        
    public void calcularEdad(){
        Calendar fecha = Calendar.getInstance();
        System.out.println(fecha.get(Calendar.YEAR));
        this.edad = fecha.get(Calendar.YEAR)-this.añoNac-1;
        if(fecha.get(Calendar.MONTH)+1 ==this.mesNac){
            if(fecha.get(Calendar.DATE)>=this.díaNac){
                this.edad++;
            }
        }else{
            if(fecha.get(Calendar.MONTH)+1 >=this.mesNac){
                this.edad++;
            }
        }
    }
    
    public Boolean mayorEdad(){
        if(edad>=18){
            return true;
        }else{
            return false;
        }
    }
}
