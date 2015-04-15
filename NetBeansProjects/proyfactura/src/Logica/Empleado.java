/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author USUARIO
 */
public class Empleado extends Persona {
    private String Cod;

    public Empleado(String Cod, String id, String nombre) {
        super(id, nombre);
        this.Cod = Cod;
    }
    
    public Empleado() {
        super();
        this.Cod = "";
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo = " + Cod ;
    }
    
    
}
