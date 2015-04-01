
package logica;

/**
 *
 * @author estudiante
 */
public class Jugador extends Persona{
    
    private String posicion;
    private long numero;
    private String nombre;
        private long id;

    public Jugador() {
    }

    public Jugador(String posicion, long numero, String nombre, long id) {
        this.posicion = posicion;
        this.numero = numero;
        this.nombre = nombre;
        this.id = id;
    }

   
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
    
}
