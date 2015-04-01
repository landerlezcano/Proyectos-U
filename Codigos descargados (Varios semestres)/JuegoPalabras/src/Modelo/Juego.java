/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class Juego {
    public String palabra;
    public String[] collection= {"casa","pollo","lechuga","borrador","uva","dado","muslo"
                                ,"roscon","zanahoria","figura","balon","televisor","tablet"
                                ,"audifono","tarjeta","memoria","gota","planeta","mujer","equidad"};
    public int numIntentos;
    public String palabraTmp;
    
    InOut ob1 = new InOut();
    
    public String getPalabraTmp() {
        return palabraTmp;
    }

    public void setPalabraTmp(String palabraTmp) {
        this.palabraTmp = palabraTmp;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }
    
    Juego(){
        numIntentos = 0;
        palabra = collection[aleatorio()];
    }
    
    public int aleatorio(){
      int seleccionado = (int) Math.round((Math.random()*19)); 
      return seleccionado;
    }
    
    public void incrementarIntento(){
        setNumIntentos(getNumIntentos()+1);
    }    
    
    public static Boolean validarStr(String str){
        String str1= str.trim().toLowerCase().replace(" ", "");
        int cont=0;
        for(int acum=0;acum<str1.length();acum++){
            if(str1.charAt(acum)<97 || str1.charAt(acum)>122){
                cont++;
            }
        }
        return cont==0;
    }
    
    public void actualizarTmp(){
        String tmp = ob1.solicitarStr("Ingrese una palabra de '"+palabra.length()+"' caracteres de logitud:");
        while((tmp.length()<palabra.length() || tmp.length()>palabra.length())&& (validarStr(tmp)==false)){
            tmp = ob1.solicitarStr("¡Error!\nIngrese una palabra de '"+palabra.length()
                    +"' caracteres de logitud:");
        }
        setPalabraTmp(palabraTmp.trim().toLowerCase());
    }
    
    public int fijas(String str1,String str2){
//      public int fijas(char [] x,char [] y){
      char array1[]= str1.trim().toLowerCase().toCharArray();
      char array2[]= str2.trim().toLowerCase().toCharArray();
      int f=0;
      for(int i=0;i<=3;i++){
          if(x[i]==y[i])
              f++;
      }
       return f;
       
   }
    
}
