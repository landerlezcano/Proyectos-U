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
public class Frase {

    String frase;
    char fraseAux[];
    int cantVocal[];
    char vocales[] = {'a','e','i','o','u'};
    
    InOut ob1 = new InOut();
    
    public Frase(String tmp) {
        this.frase=tmp;
        fraseAux= tmp.trim().toLowerCase().replace(" ","").toCharArray();
        cantVocal = new int [5];
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

    public void mostrarInfo() {
        String str = "Frase: "+frase+"\n\n";
        str=str+"Información:\n\n";
        for (char ch:vocales){
            str = str + "Número de apariciones de la letra '"+ch+"' en la frase: "+numVeces(ch)+"\n";
        }
        ob1.mostrar(str);
    }
    
    public int numVeces(char ch){
        int aux=0;
        for(int i = 0; i<fraseAux.length;i++){
            if(fraseAux[i]==ch){
                aux++;
            }
        }
        return aux;
    }
    
}
