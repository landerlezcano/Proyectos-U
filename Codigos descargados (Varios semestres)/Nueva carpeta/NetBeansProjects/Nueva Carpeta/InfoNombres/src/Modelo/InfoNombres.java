/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Vista.InOut;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Yair Lopez Poveda
 */
public class InfoNombres {
    private String cadenaNombre;
    
    InOut ob1 = new InOut();
    
    public InfoNombres() {
        cadenaNombre = "";
    }
    
    public String getCadenaNombre() {
        return cadenaNombre;
    }

    public void setCadenaNombre(String cadenaNombre) {
        this.cadenaNombre = cadenaNombre;
    }
    
    public int totalLetras(){
        int numLetras;
        numLetras=getCadenaNombre().trim().replace(" ","").length();
        return numLetras;
    }
    
    public void formatoNombre(){
        String newString = getCadenaNombre();
        StringBuffer temp = new StringBuffer(newString);
        for (int i=0;i<temp.length();i++){
            try{
                while (temp.charAt(i)==' ' && temp.charAt(i+1)== ' '){
                    temp.deleteCharAt(i+1);
                }
            }catch(Exception e){
                
            }
        }
        setCadenaNombre(temp.toString());
    }
   
    public Boolean validarNombre(String str){
        str = str.trim();
        for (int i=0;i<str.length();i++){
            if((str.codePointAt(i)<97 || str.codePointAt(i)>122)
                    && str.codePointAt(i)!=32){
                return false;
            }
            if(Character.isDigit(str.codePointAt(i))){
                return false;
            }
            
        }
        
        return true;
    }
    public String evaluarCadena(String [] str){
            String [] tmp = str.clone();
            for (int i =0;i<tmp.length;i++){
                if(tmp[i].equalsIgnoreCase("del")  ||  tmp[i].equalsIgnoreCase("de")
                    || tmp[i].equalsIgnoreCase("la") || tmp[i].equalsIgnoreCase("y")){
                    tmp[i]=tmp[i]+tmp[i+1];
                    tmp[i+1]="";
                }
            }
            StringBuilder builder = new StringBuilder();
            for(String s : tmp) {
                builder.append(s);
                builder.append(" ");
            }
            setCadenaNombre(builder.toString());
            formatoNombre();
            return getCadenaNombre();
    }
    public void calculoNombres(){
        String str2;
        String[] partes = getCadenaNombre().trim().split(" ");
        str2=evaluarCadena(partes);
        mostrarLong(partes);
        mostrarCant(str2);
    }
    public void mostrarLong(String[] partes){
        int acum;
        String nombres = "Longitud total del nombre: "+Integer.toString(totalLetras())
                        +"\n\nNombres:\n";
        for(int i=0;i<partes.length;i++){
            acum=partes[i].length();
            if(i==(partes.length - 2)){
                nombres=nombres+"\nApellidos:\n";
            }
            nombres = nombres + partes[i]+":  "+acum+ "\n";
        }
        ob1.mostrar(nombres);
    }
    public int cantidadVocales(String str){
        int acum=0;
        String [] str2 = str.split("");
        Pattern pat = Pattern.compile("[aeiou]");
        
        for(int i=0;i<str.length();i++){
            if(str2[i].isEmpty()) break;
            Matcher mat = pat.matcher(str2[i]);
            if(mat.matches()){
                acum++;
            }
        }
        return acum;
    }
    public int cantidadCons(String str){
        int acum=0;
        String [] str2 = str.split("");
        Pattern pat = Pattern.compile("[^aeiou]");
        
        for(int i=0;i<str.length();i++){
            if(str2[i].isEmpty()) break;
            Matcher mat = pat.matcher(str2[i]);
            if(mat.matches()){
                acum++;
            }
        }
        return acum;
    }
    public void mostrarCant(String nombre){
        int acum;
        String [] partes = nombre.split(" ");
        String nombres = "Cantidad de letras del nombre: "+Integer.toString(totalLetras())
                        +"\n\nNombres:\n";
        for(int i=0;i<partes.length;i++){
            if(partes[i].isEmpty() == false){
                if(i==(partes.length - 2)){
                    nombres=nombres+"\nApellidos:\n";
                }
                nombres = nombres + partes[i]+":  "+ "\n";
                nombres = nombres + "Num. vocales:  "+cantidadVocales(partes[i])+ "\n";
                nombres = nombres + "Num. consonantes:  "+cantidadCons(partes[i])+ "\n";
            }
        }
        ob1.mostrar(nombres);
    }
    public void inicioInfo(){
        String name;
        do{
        name = ob1.solicitarStr("Ingrese su nombre completo:").toLowerCase();
        }while(validarNombre(name)==false);
        setCadenaNombre(name);
        formatoNombre();
        calculoNombres();
    }
}
