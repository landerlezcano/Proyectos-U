/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import Vista.ValidacionDatos;

/**
 *
 * @author Yair
 */
public class Revista extends Libro{
    private final int ID = 4;
    
    public Revista(double codigo, String nombre, String ISBN, String autor, int edicion, String editorial,  String fechaPub){
        super(codigo, nombre, "       ", nombre, edicion, nombre, fechaPub);
    }
    
    @Override
    public String[] toArrayString(){
        String tmp[] = new String[7];
        tmp[0] = Double.toString(this.codigo);
        tmp[1] = this.nombre; 
        tmp[2] = this.autor;
        tmp[3] = "        ";
        tmp[4] = Integer.toString(this.edicion);
        tmp[5] = this.editorial;
        tmp[6] = this.fechaPub;
        return tmp;
    }
    
    public static Libro nuevoLibro (){
        Libro nuevo;
        InOut ob1 = new InOut();
        double codigo = ob1.solicitarNum("Ingrese un código para la revista.");
        while(ValidacionDatos.validarDato(codigo)==false){
            codigo = ob1.solicitarNum("¡Error! Ingrese un código válido.");
        }
        String name = ob1.solicitarStr("Ingrese el nombre de la revista.");
        while(ValidacionDatos.validarStr(name)==false){
            name = ob1.solicitarStr("¡Error! Ingrese un nombre válido.");
        }
        int edition = ob1.solicitarNum("Ingrese el número de edición de la revista");
        while(ValidacionDatos.validarDato(edition)==false){
            name = ob1.solicitarStr("¡Error! Ingrese un número de edición válido.");
        }
        String editorial = ob1.solicitarStr("Ingrese el nombre de la editorial del libro");
        while(ValidacionDatos.validarStr(editorial)==false){
            name = ob1.solicitarStr("¡Error! Ingrese nombre de editorial válido.");
        }
        String fecha = ob1.solicitarStr("Ingrese la fecha de publicación del libro");
        nuevo = new Revista(codigo, name, name, name, edition, editorial, fecha);
        return nuevo;
    }
}
