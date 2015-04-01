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
public class Persona {
    private String Nom,id,tel,edad;

    public Persona(String Nom, String id, String tel, String edad) {
        this.Nom = Nom;
        this.id = id;
        this.tel = tel;
        this.edad = edad;
    }
    
    public Persona() {
        this.Nom = "";
        this.id = "";
        this.tel = "";
        this.edad = "";
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nId=" + id +"\nNombre=" + Nom +  "\nTel=" + tel;
    }
    
    
}
