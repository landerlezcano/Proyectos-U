/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author estudiante
 */
public class fecha  {
    private int dia,mes,año;

    public fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

     public fecha() {
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String edad(){
        Calendar fech = new GregorianCalendar();
    
     int años = fech.get(Calendar.YEAR);
     int meses = fech.get(Calendar.MONTH)+1;
     int dias = fech.get(Calendar.DAY_OF_MONTH);
        int a = años-año-1;
        int m = meses-mes;
        int d = dias-dia;
        if(m==0) {
            if(d==0){
                a++;
            }else if(d>0){
                a++;
                }else if(d<0){
                  
                }
            }else if(m<0){
                
            }else if(m>0){
                a++;
            }
        return  "\nUsted tiene " + a + " años";
    }

    @Override
    public String toString() {
     Calendar fech = new GregorianCalendar();
    
     int años = fech.get(Calendar.YEAR);
     int meses = fech.get(Calendar.MONTH)+1;
     int dias = fech.get(Calendar.DAY_OF_MONTH);
        int a = años-año-1;
        int m = meses-mes;
        int d = dias-dia;
        if(m==0) {
            if(d==0){
                a++;
            }else if(d>0){
                a++;
                }else if(d<0){
                  
                }
            }else if(m<0){
                
            }else if(m>0){
                a++;
            }
            
        return  dia + 
                "/" + mes + 
                "/" + año ;
    }
      

    
}
