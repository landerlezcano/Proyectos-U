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
    private String Id,Nom,Tel;

    public Persona(String Id, String Nom, String Tel) {
        this.Id = Id;
        this.Nom = Nom;
        this.Tel = Tel;
    }
    
    
    public Persona() {
        this.Id = "";
        this.Nom = "";
        this.Tel = "";
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Identificacion=" + Id + 
               "Nombre=" + Nom + 
               "Telefono=" + Tel;
    }
}
