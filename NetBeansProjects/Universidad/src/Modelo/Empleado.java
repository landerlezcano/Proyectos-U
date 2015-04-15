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
public abstract class Empleado {
    public float sueldo;
    public abstract void cobrarSueldo();
    public abstract void pagarImpuesto();
    public abstract void asistirAReunion();
    public abstract void registrarEntrada();
    public abstract void registrarSalida();
    
}
