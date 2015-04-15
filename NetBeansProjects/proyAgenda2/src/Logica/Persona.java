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
    private String id,nombre,tel;

    public Persona(String id, String nombre, String tel) {
        this.id = id;
        this.nombre = nombre;
        this.tel = tel;
    }
    
    public Persona() {
        this.id = "";
        this.nombre = "";
        this.tel = "";
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "\nid=" + id + 
               "\nNombre=" + nombre + 
               "\ntelefono=" + tel ;
    }
    
    
}
