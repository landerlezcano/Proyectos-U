/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Titular {
    private String nombre;
    private long noIdentidad;

    public Titular() {
    }
    
    public Titular(String nombre, long id) {
        this.nombre = nombre;
        this.noIdentidad = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoIdentidad(long noIdentidad) {
        this.noIdentidad = noIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getNoIdentidad() {
        return noIdentidad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n No. de identidad: " + noIdentidad + '\n';
    }
    
    
}
