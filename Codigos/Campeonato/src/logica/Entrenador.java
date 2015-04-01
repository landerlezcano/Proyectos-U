
package logica;

/**
 *
 * @author estudiante
 */
public class Entrenador extends Persona{
    protected String liga;

    public Entrenador() {
    }

    public Entrenador(String liga, String nombre, long id) {
        super(nombre, id);
        this.liga = liga;
    }

   

    public Entrenador(String liga) {
        this.liga = liga;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }
    
    
    
       
    
}
