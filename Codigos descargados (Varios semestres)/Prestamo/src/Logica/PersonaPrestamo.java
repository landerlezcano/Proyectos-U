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
public class PersonaPrestamo {
    private String nombre,Numcredto;
//constructor parametrico
    public PersonaPrestamo(String nombre, String Numcredto) {
        this.nombre = nombre;
        this.Numcredto = Numcredto;
    }
    //constructor basico
    public PersonaPrestamo() {
        this.nombre = "";
        this.Numcredto = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumcredto() {
        return Numcredto;
    }

    public void setNumcredto(String Numcredto) {
        this.Numcredto = Numcredto;
    }

    @Override
    public String toString() {
        return "\nnombre = " + nombre + 
                "\nNumcredto = " + Numcredto;
    }
    
    
}
