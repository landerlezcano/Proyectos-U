/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class OperacionMatriz {
    
    final private int array[];
    InOut ob1 = new InOut();
    
    public OperacionMatriz(int array) {
        this.array= new int[array];
    }
    public static Boolean validadDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    public void suma(){
        float tmp[]= new float[array.length];
        float num = ob1.solicitarFloat("Ingrese un número a sumar al vector");
        for (int i=0;i<array.length;i++){
            tmp[i]=array[i]+num;
        }
        ob1.mostrar("La suma del "+mostrarMatriz()+" mas "+num+" es:\n"+mostrarMatriz(tmp));
        
    }
    
    public void resta(){
        float tmp[]= new float[array.length];
        float num = ob1.solicitarFloat("Ingrese un número a sumar al vector");
        for (int i=0;i<array.length;i++){
            tmp[i]=array[i]-num;
        }
        ob1.mostrar("La resta del vector "+mostrarMatriz()+" menos "+num+" es:\n"+mostrarMatriz(tmp));
        
    }
    
    public void multiplicacion(){
        float tmp[]= new float[array.length];
        float num = ob1.solicitarNum("Ingrese un número a sumar al vector");
        for (int i=0;i<array.length;i++){
            tmp[i]=array[i]*num;
        }
        ob1.mostrar("La multiplicación del vector "+mostrarMatriz()+" por "+num+" es:\n"+mostrarMatriz(tmp));
        
    }
    
    public void division(){
        float tmp[]= new float[array.length];
        float num = ob1.solicitarNum("Ingrese un número a sumar al vector");
        for (int i=0;i<array.length;i++){
            tmp[i]=array[i]/num;
        }
        ob1.mostrar("La división del vector "+mostrarMatriz()+" entre "+num+" es:\n"+mostrarMatriz(tmp));
        
    }

    public String mostrarMatriz(){
        String str = "Vector:\n[ ";
        for(int num=0;num<array.length;num++){
            str=str+array[num]+" ";
        }
        str = str+"]";
        return str;
    }
    
    public String mostrarMatriz(float arreglo[] ){
        String str = "Vector:\n[ ";
        for(int num=0;num<arreglo.length;num++){
            str=str+arreglo[num]+" ";
        }
        str = str+"]";
        return str;
    }
    
    public void ejecutarMenu(){
        String menu = "Menú - Operaciones Básicas del vector\n"+"1. Cargar vector\n"
                +"2. Mostrar vector\n"+"3. Suma del vector\n"
                +"4. Resta del vector\n"+"5. Multiplicación del vector\n"
                +"6. División del vector\n"+"7. Salir";
        int opc;
        String str;
        opc=ob1.solicitarNum(menu);
        while (true){
            switch(opc){
                case 1:
                    cargarMatriz();
                    ejecutarMenu();
                    break;
                case 2:
                    ob1.mostrar(mostrarMatriz());
                    ejecutarMenu();
                    break;
                case 3:
                    suma();
                    ejecutarMenu();
                    break;
                case 4:
                    resta();
                    ejecutarMenu();
                    break;
                case 5:
                    multiplicacion();
                    ejecutarMenu();
                    break;
                case 6:
                    division();
                    ejecutarMenu();
                    break;
                case 7:
                    int var;
                    var=ob1.mostrarConfirm("¿Desea salir del programa?");
                    if (var == JOptionPane.NO_OPTION) {
                        ejecutarMenu();
                      } else if (var == JOptionPane.YES_OPTION) {
                        break;
                      } 
                    break;
                default:
                    ejecutarMenu();
                    break;
            }
        
        str="";
        break;
        }
    }

    public void cargarMatriz() {
        int acum;
        ob1.mostrar("A continuación ingrese valores para las "+array.length+
                " posiciones del vector");
        for(int num=0;num<array.length;num++){
                acum=ob1.solicitarNum("Posición "+num+" del vector:");
            array[num]=acum;
        }
    }
}
