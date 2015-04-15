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
    int tamaño;
    float diag[];
    
    InOut ob1 = new InOut();

    public float[][] getNum() {
        return num;
    }

    public float[] getDiag() {
        return diag;
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
        tamaño = filas;
        diag = new float[filas];
    }
    
    public void cargarMatriz(){
        for(int i = 0; i<tamaño; i++){
            for(int j= 0; j<tamaño;j++){
                num[i][j]=ob1.solicitarNum("Ingrese un número para la posición"
                        + " Fila: "+i+", Columna: "+j);
                        
            }
        }
    }
    
    public String mostrar(float array[][]){
        String tmp = "";
        for(int i = 0; i<tamaño; i++){
            for(int j= 0; j<tamaño;j++){
                tmp=tmp+"["+array[i][j]+"]";
            }
            tmp = tmp + "\n";
        }
        return tmp;
    }
    
    public String mostrar(float array[]){
        String tmp = "";
        for(int i = 0; i<tamaño; i++){
                tmp=tmp+"["+array[i]+"]";
        }
        return tmp;
    }
    
    public void mostrarInfo(){
        String str = "Matriz:\n"+mostrar(getNum());
        str = str + "\nInformación:\n\n";
        str = str + "La diagonal secundaria de la matriz es: "+mostrar(getDiag());
        ob1.mostrar(str);
    }
    
    public void buscarDiagonal(){
        int cont = 0;
        for (int i=tamaño-1; i>=0; i--){
            for (int j=0; j<tamaño; j++){ 
                if (tamaño-1-i == j){ 
                    diag[cont]=num[i][j];
                    cont++;
                }
            }
        }    
    }
    
}
