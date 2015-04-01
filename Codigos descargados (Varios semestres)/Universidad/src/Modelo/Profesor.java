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
public class Profesor extends Empleado{

    public long cedula;
    private long numTarjetaProf;

    public Profesor(long cedula, long numTarjetaProf) {
        this.cedula = cedula;
        this.numTarjetaProf = numTarjetaProf;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getNumTarjetaProf() {
        return numTarjetaProf;
    }

    public void setNumTarjetaProf(long numTarjetaProf) {
        this.numTarjetaProf = numTarjetaProf;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public void cobrarSueldo() {
        System.out.println("Cobrar sueldo Profesor");
    }

    @Override
    public void pagarImpuesto() {
        System.out.println("Pagar impuesto Profesor");
    }

    @Override
    public void asistirAReunion() {
        System.out.println("Asistir a reunión Profesor");
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Registrar entrada Profesor");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Registrar salida Profesor");
    }
    
    public void dictarClase(){
        System.out.println("Dictar clase profesor");
    }
    
}
