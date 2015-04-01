/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

/**
 *
 * @author estudiante
 */
public class Entrenador extends Persona{
    private String liga;

    public Entrenador() {
        super();
    }
    
    public Entrenador(String liga) {
        this.liga = liga;
    }

    public Entrenador(String liga, String nombre, int id) {
        super(nombre, id);
        this.liga = liga;
    }
    

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\nOcupación: Entrenador\n"+"ID: "+getId()+ 
                "\nLiga: "+this.liga;
    }
    
    
    
}
