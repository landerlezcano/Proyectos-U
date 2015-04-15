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
    private String Id,Nombre,Tel;
    double sueldo;

    public Persona(String Id, String Nombre, String Tel, double sueldo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Tel = Tel;
        this.sueldo = sueldo;
    }
    
    public Persona() {
        this.Id = "";
        this.Nombre = "";
        this.Tel = "";
        this.sueldo = 0;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    @Override
        public String toString() {
        return "\nIdentificacion=" + Id + 
               "\nNombre=" + Nombre + 
               "\nTelefono=" + Tel + 
               "\nSueldo=" + sueldo ;
    }
    
    
}
