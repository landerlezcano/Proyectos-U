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
    char [] nombre; 
    InOut ob1 = new InOut();
    public Palabra() {
    }
    
    public Palabra(char [] nombre) {
        this.nombre=nombre;
    }

    public char[] getNombre() {
        return nombre;
    }

    public void setNombre(char[] nombre) {
        this.nombre = nombre;
    }
    
    public Boolean validarPalabra(String str){
        String descompuesta[] = str.split(" ");
        String str2 = str.trim().toLowerCase();
        if(descompuesta.length != 1) {
            ob1.mostrar("Error, ingrese una sola palabra");
            return false;
        }
        
        for (int i=0;i<str2.length();i++){
            if((str2.codePointAt(i)<97 || str2.codePointAt(i)>122)
                    && str2.codePointAt(i)!=32){
                ob1.mostrar("Error, ingrese solo caracteres validos");
                return false;
            }
            if(Character.isDigit(str2.codePointAt(i))){
                ob1.mostrar("Error, ingrese solo letras");
                return false;
            }
        }
        return true;
    }
    
    public void asignarPalabra(String str){
        char name [] = str.trim().toLowerCase().toCharArray();
        setNombre(name);
    }
    
    public String mostrarNombre(){
        String str = "";
        for (char a:nombre){
            str = str + a;
        }
        return str;
    }
    
    public void esPalindromo() {
        Boolean palindromidad = true;
        int i = 0, j =nombre.length-1;
        char ch = nombre[((int)nombre.length/2)+1];
        if(nombre.length%2 == 0) palindromidad = false;
        while(nombre[i] != ch){
            if (nombre[i]!=nombre[j]){
                palindromidad=false;
                break;
            }
            i++; j--;
        }
        if(palindromidad){
            ob1.mostrar("La palabra \""+mostrarNombre()+"\" es palindroma.");
        }else{
            ob1.mostrar("La palabra \""+mostrarNombre()+"\" no es palindroma.");
        }        
    }
    
    public String posiciones(){
        String position="\nLas posiciones en las que se encontró el caracter fueron:\n";
        for(int i=0;i<nombre.length;i++){
            if(nombre[i]=='a'){
                position=position+"  "+i+"\n";
            }
        }
        return position;
    }
    
    public void numVocalA() {
        int num=0;
        
        for (char a:nombre){
            if(a == 'a'){
                num++;
            }
        }
        if (num == 0){
            ob1.mostrar("La palabra no tiene la letra 'a'");
        }else{
            ob1.mostrar("El número de veces que la palabra \""+mostrarNombre()+
                    "\" tiene la vocal 'a' es "+num+"."+posiciones());
        }
    }
}
