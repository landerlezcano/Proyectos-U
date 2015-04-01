/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yair
 */
public class ValidacionDatos {

    public ValidacionDatos() {
    }
    
    public Boolean validarNombre(String nombre){
        for (int i=0;i<nombre.length();i++){
            if((nombre.codePointAt(i)<97 || nombre.codePointAt(i)>122)
                    && nombre.codePointAt(i)!=32){
                return false;
            }
            if(Character.isDigit(nombre.codePointAt(i))){
                return false;
            }
            
        }
        
        return true;
    }
    
    public Boolean validarDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public Boolean validarDato(double num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public Boolean validarDato(float num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public Boolean validarDato(long num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public Boolean validarStr(String str){
        String str1= str.trim().toLowerCase().replace(" ", "");
        int cont=0;
        for(int acum=0;acum<str1.length();acum++){
            if(str1.charAt(acum)<97 || str1.charAt(acum)>122){
                cont++;
            }
        }
        if(cont==0){
            return true;
        }else{
            return false;
        }
    }
    
    public Boolean validarFecha(String str){
        String patron ="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
}
