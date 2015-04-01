/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Vista.InOut;
/**
 *
 * @author Yair
 */
public class Palabra {
    String palabras[];
    char [] vocales, consonantes;

    public char[] getVocales() {
        return vocales;
    }

    public void setVocales(char[] vocales) {
        this.vocales = vocales;
    }

    public char[] getConsonantes() {
        return consonantes;
    }

    public void setConsonantes(char[] consonantes) {
        this.consonantes = consonantes;
    }
    
    InOut ob1 = new InOut();
    
    public Palabra(String vector) {
        palabras = vector.trim().split(" ");
    }
    
    public static Boolean validarVector(String str){
        String[] partes = str.trim().split(" ");
        if(partes.length==5){
            return true;
        }else{
            System.out.println("Num. "+partes.length);
            return false;
        }
    }
    
    public static Boolean validarStr(String str){
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

    public int aleatorio(){
      int seleccionado = (int) Math.round((Math.random()*5)); 
      return seleccionado;
    }

    public void cargarVocales() {
        String tmp = ob1.solicitarStr("A continuación ingrese letras (vocales) "
                + "para llenar el vector 1:");
        while(validarVocales(tmp.trim())==false){
            ob1.mostrar("¡Error!\nIngrese solo vocales sin espacios.");
            tmp = ob1.solicitarStr("A continuación ingrese letras (vocales) "
                + "para llenar el vector 2:");
        }
        setVocales(tmp.trim().toCharArray());
    }
    
    public void cargarConsonantes() {
        String tmp = ob1.solicitarStr("A continuación ingrese letras (consonantes) "
                + "para llenar el vector 2:");
        while(validarConsonantes(tmp)==false){
            ob1.mostrar("¡Error!\nIngrese solo consonantes sin espacios.");
            tmp = ob1.solicitarStr("A continuación ingrese letras (consonantes) "
                + "para llenar el vector 2:");
        }
        setConsonantes(tmp.trim().toCharArray());
    }
    
    public boolean validarVocales(String tmp) {
        char [] aux= tmp.trim().toLowerCase().toCharArray();
        if(validarStr(tmp)==false){
            return false;
        }
        for(char a:aux){
            if(a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u'){
                return false;
            }          
        }
        return true;
    }
    
    public boolean validarConsonantes(String tmp) {
        char [] aux= tmp.trim().toLowerCase().toCharArray();
        if(validarStr(tmp)==false){
            return false;
        }
        for(char a:aux){
            if(a == 'a' && a == 'e' && a == 'i' && a == 'o' && a == 'u'){
                return false;
            }          
        }
        return true;
    }

    public void formarpalabra() {
        int numLetras=0;
        int rand = aleatorio();
        String vowel = new String(vocales);
        String consonant = new String(consonantes);

        System.out.println(rand);
        Boolean formarPalabra = true;
        for(int i=0;i<palabras[rand].length();i++){
            if(verificarLetra(palabras[rand].charAt(i))){
                numLetras++;
            }
        }
        if(numLetras==palabras[rand].length()){
            ob1.mostrar("La palabra '"+palabras[rand]+"' se puede formar con el vector vocales"+
                    " ("+vowel+") y el vector consonantes ("+consonant+").");
        }else{
            ob1.mostrar("La palabra '"+palabras[rand]+"' no se puede formar con el vector vocales"+
                    " ("+vowel+") y el vector consonantes ("+consonant+").");
        }
    }
    
    public Boolean verificarLetra(char letter){
        Boolean foo = false;
        for(char a:vocales){
            if(a==letter){
                foo = true;
            }
        }
        for(char a:consonantes){
            if(a==letter){
                foo = true;
            }
        }
        return foo;
    }
    
}
