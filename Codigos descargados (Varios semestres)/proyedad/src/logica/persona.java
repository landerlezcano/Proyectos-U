/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;



/**
 *
 * @author estudiante
 */
public class persona {
    private String id,nombre,tel;
    private fecha fechan;

    public persona(String id, String nombre, String tel, fecha fechan) {
        this.id = id;
        this.nombre = nombre;
        this.tel = tel;
        this.fechan = fechan;
    }
    
public persona() {
        this.id = "";
        this.nombre = "";
        this.tel = "";
        this.fechan = new fecha();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public fecha getFechan() {
        return fechan;
    }

    public void setFechan(fecha fechan) {
        this.fechan = fechan;
    }

    @Override
    public String toString() {
        return "\nid=" + id +
                "\nnombre=" + nombre + 
                "\ntel=" + tel + 
                "\nfechan=" + fechan.toString()+fechan.edad();
    }
    

    

    
    
}
