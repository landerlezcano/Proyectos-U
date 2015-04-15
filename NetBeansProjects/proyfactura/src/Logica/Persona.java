/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author estudiante
 */
public class Persona {
    private String id,nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Persona() {
        this.id = "";
        this.nombre = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "\nIdentificacion = " + id + 
               "\nNombre = " + nombre ;
    }
    
    
}
