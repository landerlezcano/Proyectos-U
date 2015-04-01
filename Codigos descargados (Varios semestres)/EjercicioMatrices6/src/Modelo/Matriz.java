/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import java.util.Arrays;

/**
 *
 * @author Yair
 */
public class Matriz {
    float num[][];
    int numFilas;
    int numColumnas;
    float toFind[];
    String posicion[];
    
    InOut ob1 = new InOut();

    public float[][] getNum() {
        return num;
    }

    public String[] getPosicion() {
        return posicion;
    }
    
    public Matriz (){
        Arrays.fill(num, 0);
    }
    
    public static Boolean validarDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public Matriz (int filas, int columnas){
        num = new float[filas][columnas];
        numFilas=filas;
        numColumnas=columnas;
        toFind= new float [5];
        posicion = new String[5];
    }
    
    public void cargarMatriz(){
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                num[i][j]=ob1.solicitarNum("Ingrese un número para la posición"
                        + " Fila: "+i+", Columna: "+j);
                        
            }
        }
    }
    
    
    
    public String mostrarMatriz(float array[][]){
        String tmp = "";
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                tmp=tmp+"["+array[i][j]+"]";
            }
            tmp = tmp + "\n";
        }
        return tmp;
    }
    
    public String mostrarVector(String array[]){
        String tmp = "";
        for(int i = 0; i<array.length; i++){
            tmp=tmp+array[i];
        }
        return tmp;
    }
    
    public void mostrarInfo(){
        String str = "Matriz:\n"+mostrarMatriz(getNum());
        str = str + "\nInformación:\n\n";
        str = str + mostrarVector(getPosicion());
        ob1.mostrar(str);
    }

    public void buscarCoincidencias(float[][] num) {
        int aux = 0;
        String tmp = "";
        for (int k=0; k<toFind.length;k++){
            tmp = tmp + (k+1) +". Buscando número ("+toFind[k]+") en la matriz...\n";
            for(int i = 0; i<numFilas; i++){
                for(int j= 0; j<numColumnas;j++){
                    if(num[i][j]==toFind[k]){
                        tmp = tmp + "Posición: ["+i+","+j+"]\n";
                        aux++;
                    }
                }
            }
            if(aux==0){
                tmp = tmp + "No se encontró el número ("+toFind[k]+") en la matriz.\n\n";
            }else{
                tmp = tmp + "Se encontró el número ("+toFind[k]+") "+aux+" veces en la matriz.\n\n";
            }
            posicion[k]=tmp;
            tmp = "";
            aux=0;
        }
    }
    
    public void cargarCoincidencias(){
        for(int i = 0; i<toFind.length; i++){
            toFind[i]=ob1.solicitarNum("Ingrese el número '"+(i+1)+"' a buscar en la matriz:");
        }
    }
    
}
