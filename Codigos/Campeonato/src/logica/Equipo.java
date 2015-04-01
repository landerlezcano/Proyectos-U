
package logica;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Equipo {
    
    ArrayList <Persona> ListaIntegrantes = new ArrayList();
    private String nombre; 

    public Equipo() {
    }

    public ArrayList<Persona> getListaIntegrantes() {
        return ListaIntegrantes;
    }

    public void setListaIntegrantes(ArrayList<Persona> ListaIntegrantes) {
        this.ListaIntegrantes = ListaIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
