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
public class Cliente extends Persona{
    private String tel;

    public Cliente(String tel, String id, String nombre) {
        super(id, nombre);
        this.tel = tel;
    }
    
    public Cliente() {
        super();
        this.tel = "";
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTelefono = " + tel;
    }
    
    
}
