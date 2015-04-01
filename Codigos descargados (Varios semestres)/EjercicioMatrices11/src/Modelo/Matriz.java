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
    float matriz1[][];
    float matriz2[][];
    int numFilasResult, numColumnasResult;
    int numFilas1,numColumnas1;
    int numFilas2,numColumnas2;
    
    InOut ob1 = new InOut();

    public float[][] getNum() {
        return num;
    }

    public float[][] getMatriz1() {
        return matriz1;
    }

    public float[][] getMatriz2() {
        return matriz2;
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
    
    public Matriz (int filas1,int columnas1,int filas2,int columnas2){
        num = new float[filas1][columnas2];
        matriz1 = new float[filas1][columnas1];
        matriz2 = new float[filas2][columnas2];
        numFilasResult=filas1;
        numColumnasResult=columnas2;
        numFilas1 = filas1;
        numColumnas1 = columnas1;
        numFilas2 = filas2;
        numColumnas2 = columnas2;
    }
    
    public void cargarMatriz(float array[][],int numFilas, int numColumnas){
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                array[i][j]=ob1.solicitarNum("Ingrese un número para la posición"
                        + " Fila: "+i+", Columna: "+j);
            }
        }
    }
    
    public void multiplicarMatrices(float matrizA[][], float matrizB[][]){
        for (int k = 0;k < numFilas1;k++){
            for (int j = 0;j<numColumnas2;j++){
                for (int i = 0;i < numFilas2;i++ )
                num[k][j]+= matrizA[k][i]*matrizB[i][j];
            }
        }
    }
    
    public String mostrarMatriz(float array[][], int numFilas , int numColumnas){
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
        String str = "Resultados:\n";
        str = str + "El resultado de multiplicar la matriz A ("+numFilas1+"x"+numColumnas1+"):\n";
        str = str + mostrarMatriz(getMatriz1(), numFilas1, numColumnas1);
        str = str + "\n Por la matriz B ("+numFilas2+"x"+numColumnas2+"):\n";
        str = str + mostrarMatriz(getMatriz2(), numFilas2, numColumnas2);
        str = str + "\nEs:\n\n";
        str = str + mostrarMatriz(num, numFilasResult, numColumnasResult);
        ob1.mostrar(str);
    }
}
