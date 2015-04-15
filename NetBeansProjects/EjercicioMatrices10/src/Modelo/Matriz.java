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
    float sumFilas[];
    float sumColum[];
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
        sumFilas = new float[filas];
        sumColum = new float[columnas];
    }
    
    public void cargarMatriz(){
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                float tmp;
                tmp=ob1.solicitarNum("Ingrese un número para la posición"
                        + " Fila: "+i+", Columna: "+j);
                while((tmp<1 || tmp>9) || (seRepite(tmp)==true)){
                    tmp=ob1.solicitarNum("¡Número repetido!\nIngrese un número para la posición"
                        + " Fila: "+i+", Columna: "+j);
                }
                num[i][j] = tmp;
            }
        }
    }
    
    private Boolean seRepite(float foo){
        Boolean aux = false;
        for(int i=0;i<numFilas;i++){
            for(int j=0;j<numFilas;j++){
                if(num[i][j]==foo){
                    aux = true;
                    break;
                }
            }
        }
        return aux;
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
        if (esMagica()==true){
                str = str + "¡La matriz es mágica!";
        }else{
                str = str + "La matriz no es mágica.";
        }
        ob1.mostrar(str);
    }
    
    public void sumatoriaFilas(){
        float aux=0;
        for(int i = 0; i<numFilas; i++){
            for(int j= 0; j<numColumnas;j++){
                aux=aux+num[i][j];
            }
            sumFilas[i]=aux;
            aux=0;
        }
    }
    
    public void sumatoriaColumnas(){
        float aux=0;
        for(int i = 0; i<numColumnas; i++){
            for(int j= 0; j<numFilas;j++){
                aux=aux+num[j][i];
            }
            sumColum[i]=aux;
            aux=0;
        }
    }
    
    public Boolean esMagica(){
        Boolean aux = true;
        for (float i : sumFilas){
            for(float j : sumColum){
                if (i != j){
                    aux=false;
                    break;
                }
            }
        }
        return aux;
    }

    public void llenarMatriz(float aux) {
        for(int i = 0; i<numColumnas; i++){
            for(int j= 0; j<numFilas;j++){
                num[i][j]=aux;
            }
        }    
    }
    
}
