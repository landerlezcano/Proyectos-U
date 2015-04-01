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
public class PerSeguridad extends Empleado{
    
    public float cedula;
    private long numMatricula;
    private int cantidadBalas;

    public float getCedula() {
        return cedula;
    }

    public void setCedula(float cedula) {
        this.cedula = cedula;
    }

    public long getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(long numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }
    
    

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
    @Override
    public void cobrarSueldo() {
        System.out.println("Cobrar sueldo Personal de Seguridad");
    }

    @Override
    public void pagarImpuesto() {
        System.out.println("Pagar impuesto Personal de Seguridad");
    }

    @Override
    public void asistirAReunion() {
        System.out.println("Asistir a reunión Personal de Seguridad");
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Registrar entrada Personal de Seguridad");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Registrar salida Personal de Seguridad");
    }
    
    public void dispararArma(){
        System.out.println("Disparar arma Personal de Seguridad");
    }
}
