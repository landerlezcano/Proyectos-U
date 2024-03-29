/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Vista.InOut;
/**
 *
 * @author Yair Lopez Poveda
 */
public class Frase {
    private String cadenaNombre;
    
    InOut ob1 = new InOut();
    
    public Frase() {
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
            while (temp.charAt(i)==' ' && temp.charAt(i+1)== ' '){
                temp.deleteCharAt(i+1);
            } 
        }
        setCadenaNombre(temp.toString());
    }
    
    public void actualizarNombre(){
        
        setCadenaNombre(ob1.solicitarStr("Ingrese a continuación la frase:").toLowerCase());
        formatoNombre();
    }
    
    public Boolean validarNombre(){
        for (int i=0;i<getCadenaNombre().length();i++){
            if((getCadenaNombre().codePointAt(i)<97 || getCadenaNombre().codePointAt(i)>122)
                    && getCadenaNombre().codePointAt(i)!=32){
                return false;
            }
            if(Character.isDigit(getCadenaNombre().codePointAt(i))){
                return false;
            }
            
        }
        
        return true;
    }
    
    public void calculoNombres(){
        int acum;
        String[] partes = getCadenaNombre().trim().split(" ");
        String nombres = "Longitud total de la frase:"+Integer.toString(totalLetras())
                        +"\n\nPalabras:\n";
        for(int i=0;i<partes.length;i++){
            acum=partes[i].length();
            nombres = nombres + partes[i]+":  "+acum+ "\n";
        }
        ob1.mostrar(nombres);
    }
    
    public void inicioInfo(){
        actualizarNombre();
        if(validarNombre()==false){
            ob1.mostrar("Error: Ingrese una frase válida");
            actualizarNombre();
        }
        calculoNombres();
        
    }
}
