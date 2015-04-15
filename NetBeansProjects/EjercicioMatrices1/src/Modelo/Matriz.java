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
    
    public float realizarSuma(){
        float aux = 0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                aux=aux+num[i][j];
            }
        }
        return aux;
    }
    
    public float realizarMult(){
        float aux = 0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                if (i==0 && j==0){
                    aux=num[i][j];
                }else{
                    aux=aux*num[i][j];
                }
            }
        }
        return aux;
    }
    
    public float[][] dividirMatriz(float aux){
        float tmp[][]= new float [numFilas][numColumnas];
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                tmp[i][j]=num[i][j]/aux;
            }
        }
        return tmp;
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
        str = str + "\nInformación\n\n";
        str = str + "Suma de todos elementos de la matriz: "+realizarSuma();
        str = str + "\nMultiplicación de todos los elementos de la matriz: "+realizarMult();
        ob1.mostrar(str);
    }
    
    public void mostrarDivision(){
        float num;
        num = ob1.solicitarNum("Ingrese un número para dividir cada elemento de la matriz:");
        while(num==0){
            ob1.solicitarNum("¡Error! Ingrese un número diferente a cero para dividir cada elemento de la matriz:");
        }
        ob1.mostrar("El resultado de dividir la matriz entre"+num+" es:\n"+mostrarMatriz(dividirMatriz(num)));
    }
    
}
