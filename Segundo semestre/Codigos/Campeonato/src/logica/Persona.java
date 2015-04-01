
package logica;

/**
 *
 * @author estudiante
 */
public class Persona {
    protected 
            String nombre;
            long id;  

    public Persona(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
                   
}





