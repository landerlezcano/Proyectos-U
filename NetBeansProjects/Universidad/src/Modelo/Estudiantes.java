/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yair
 */
public class Estudiantes {
    public long cedula;
    public long codigoEstudiantil;

    public Estudiantes(long cedula, long codigoEstudiantil) {
        this.cedula = cedula;
        this.codigoEstudiantil = codigoEstudiantil;
    }
    
    

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(long codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }
    
    public void pagarMatricula(){
        System.out.println("Pagar matricula Estudiante");
    }
    
    public void asistarClase(){
        System.out.println("Asistir a clase Estudiante");
    }
    
    public void realizarLecturas(){
        System.out.println("Realizar lecturas Estudiante");
    }
    
    public void realizarTrabajos(){
        System.out.println("Realizar trabajos Estudiante");
    }
}
