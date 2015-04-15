/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Jugador extends Persona{
    
    private String posición;
    private int numero;
    

    public Jugador() {
        super();
    }    
    
    public Jugador(String posición, int numero) {
        this.posición = posición;
        this.numero = numero;
    }

    public Jugador(String posición, int numero, String nombre, int id) {
        super(nombre, id);
        this.posición = posición;
        this.numero = numero;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\nOcupación: Jugador"+"\nID: "+getId()
                + "\nPosición: " + posición + "\nNúmero en el equipo: " + numero; 
                 
    }
    
    
    
}
