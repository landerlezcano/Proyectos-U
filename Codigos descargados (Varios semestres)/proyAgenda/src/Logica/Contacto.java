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
public class Contacto extends Persona{
    private int valor;
    private String email;

    public Contacto(int valor, String Nom, String id, String tel, String edad, String email) {
        super(Nom, id, tel, edad);
        this.valor = valor;
        this.email = email;
    }
    
    public Contacto() {
        super();
        this.valor = 0;
        this.email= "";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nEmail=" + email +
                "" + valor;
    }
    
    
}
