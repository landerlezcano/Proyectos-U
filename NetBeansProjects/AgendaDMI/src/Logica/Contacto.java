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
public class Contacto extends Persona {
    private String email;

    public Contacto(String email, String Id, String Nom, String Tel) {
        super(Id, Nom, Tel); //super hace referencia a persona
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
        return super.toString() + "Correo: " + email;
    }
}
