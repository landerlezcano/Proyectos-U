/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author estudiante
 */
public class Fecha extends Persona{
    private int años,mes,dia;

    public Fecha(int años, int mes, int dia, String Id, String Nombre, String Tel, double sueldo) {
        super(Id, Nombre, Tel, sueldo);
        this.años = años;
        this.mes = mes;
        this.dia = dia;
    }

     public Fecha() {
        super();
        this.años = 0;
        this.mes = 0;
        this.dia = 0;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public String bonificacion(){
        Calendar f=new GregorianCalendar();
        
        int a=f.get(Calendar.YEAR);
        int m=f.get(Calendar.MONTH)+1;
        int d=f.get(Calendar.DAY_OF_MONTH);
        
        int b,c,g;
        double z = 0;
        b=a-años;
        c=m-mes;
        g=d-dia;
        if(b>=3){
            if(c>=0){
                if(g>=0){
                   z=this.getSueldo()*0.5;
                }
            }
            else if(g<0){
                z=0;
            }
        }
        
        return "\nBonificacion = "+ z;
    }

    @Override
    public String toString() {
        return "\nIdentificacion=" + this.getId() + 
               "\nNombre=" + this.getNombre() + 
               "\nTelefono=" + this.getTel()+ 
               "\nSueldo=" + sueldo +
                "\nAños=" + años + 
                "\nMes=" + mes + 
                "\nDia=" + dia+this.bonificacion();
    }

    
    
}
