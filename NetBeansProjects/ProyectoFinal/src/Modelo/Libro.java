/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Timer;
import Vista.InOut;
import Vista.ValidacionDatos;

/**
 *
 * @author Yair
 */
public class Libro {
    private final int ID = 0;
    protected double codigo;
    protected String nombre;
    protected String ISBN;
    protected String autor;
    protected int edicion;
    protected String editorial;
    protected String fechaPub;
    

    public Libro(double codigo, String nombre, String ISBN, String autor, int edicion, String editorial,  String fechaPub) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.editorial = editorial;
        this.fechaPub = fechaPub;
    }
    
    Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String[] toArrayString(){
        String tmp[] = new String[7];
        tmp[0] = Double.toString(this.codigo);
        tmp[1] = this.nombre; 
        tmp[2] = this.autor;
        tmp[3] = this.ISBN;
        tmp[4] = Integer.toString(this.edicion);
        tmp[5] = this.editorial;
        tmp[6] = this.fechaPub;
        return tmp;
    }
    
    public static Libro nuevoLibro (){
        Libro nuevo;
        InOut ob1 = new InOut();
        double codigo = ob1.solicitarNum("Ingrese un código para el libro.");
        while(ValidacionDatos.validarDato(codigo)==false){
            codigo = ob1.solicitarNum("¡Error! Ingrese un código válido.");
        }
        String name = ob1.solicitarStr("Ingrese un nombre para el libro.");
        while(ValidacionDatos.validarStr(name)==false){
            name = ob1.solicitarStr("¡Error! Ingrese un nombre válido.");
        }
        String autor = ob1.solicitarStr("Ingrese un nombre de autor para el libro.");
        while(ValidacionDatos.validarStr(autor)==false){
            name = ob1.solicitarStr("¡Error! Ingrese un nombre de autor válido.");
        }
        String isbn = ob1.solicitarStr("Ingrese un código ISBN para el libro.");
        int edition = ob1.solicitarNum("Ingrese el número de edición del libro");
        while(ValidacionDatos.validarDato(edition)==false){
            name = ob1.solicitarStr("¡Error! Ingrese un número de edición válido.");
        }
        String editorial = ob1.solicitarStr("Ingrese el nombre de la editorial del libro");
        while(ValidacionDatos.validarStr(editorial)==false){
            name = ob1.solicitarStr("¡Error! Ingrese nombre de editorial válido.");
        }
        String fecha = ob1.solicitarStr("Ingrese la fecha de publicación del libro");
        nuevo = new Libro(codigo, name, isbn, autor, edition, editorial, fecha);
        return nuevo;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }
    
    
    
    
}
