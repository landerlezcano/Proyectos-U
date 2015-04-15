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
public class Contacto extends Persona{
    private String email;

    public Contacto(String email, String id, String nombre, String tel) {
        super(id, nombre, tel);
        this.email = email;
    }
    
    public Contacto() {
        super();
        this.email = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.getNombre()+"\nID:"+this.getId()
                +"\nTeléfono:"+this.getTel()+"\nEmail:" + email+"\n";
    }
    
    
}
