/*
 * ENUNCIADO: un almacen desea conocer el total de ventas realizadas durante una semana
Autor: Mireya Bernal
 */

package Control;

import Modelo.Almacen;
import Vista.InOut;

public class Ejecutar {

    //metodo principal que dirige el programa
    public static void main(String[] args) {
       //creacion de objetos
        Almacen ob1=new Almacen();
        InOut ob2=new InOut();
        //llamado al metodo que realiza el proceso general
        String r=ob1.recorrerDias();
        ob2.mostrar(r);
        
        
    }
    
}
