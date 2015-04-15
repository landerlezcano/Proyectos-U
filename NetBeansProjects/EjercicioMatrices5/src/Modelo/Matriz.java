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
    
    InOut ob1 = new InOut();

    public float[][] getNum() {
        return num;
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
    
    public void mostrarInfo(){
        String str = "Matriz:\n"+mostrarMatriz(getNum());
        str = str + "\nInformación:\n\n";
        str = str + "Cantidad de elementos negativos: "+numNegativos(getNum());
        str = str + "\nCantidad de elementos nulos: "+numNulos(getNum());
        str = str + "\nCantidad de elementos positivos: "+numPositivos(getNum());
        ob1.mostrar(str);
    }

    private int numNegativos(float[][] num) {
        int aux = 0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if(num[i][j]<0) aux++;
            }
        }
        return aux;
    }

    private int numNulos(float[][] num) {
        int aux = 0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if(num[i][j]==0) aux++;
            }
        }
        return aux;
    }

    private int numPositivos(float[][] num) {
        int aux = 0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if(num[i][j]>0) aux++;
            }
        }
        return aux;
    }
    
    
    
}
