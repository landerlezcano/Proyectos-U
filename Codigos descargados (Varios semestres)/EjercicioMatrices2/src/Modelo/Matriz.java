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
        str = str + "Mayor elemento la matriz: "+buscarMaximo();
        str = str + "\nMenor elemento de la matriz: "+buscarMinimo();
        ob1.mostrar(str);
    }

    private String buscarMaximo() {
        String tmp = "";
        int fila=0, columna=0;
        float aux=0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if(num[i][j]>aux){
                    aux=num[i][j];
                    fila=i; columna = j;
                }
            }
        }
        tmp= tmp +aux+ " en la fila ("+fila+") y columna ("+columna+").";
        return tmp;
    }

    private String buscarMinimo() {
        String tmp = "";
        int fila=0, columna=0;
        float aux=Float.MAX_VALUE;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if(num[i][j]<aux){
                    aux=num[i][j];
                    fila=i; columna = j;
                }
            }
        }
        tmp= tmp +aux+ " en la fila ("+fila+") y columna ("+columna+").";
        return tmp;
    }
    
}
