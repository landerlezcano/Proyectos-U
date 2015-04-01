
package logica;

/**
 *
 * @author estudiante
 */
public class Medico extends Persona{
    private long TarjetaProfesional;

    public Medico() {
    }

    public Medico(long TarjetaProfesional, String nombre, long id) {
        super(nombre, id);
        this.TarjetaProfesional = TarjetaProfesional;
    }

     

    public Medico(long TarjetaProfesional) {
        this.TarjetaProfesional = TarjetaProfesional;
    }

    public long getTarjetaProfesional() {
        return TarjetaProfesional;
    }

    public void setTarjetaProfesional(long TarjetaProfesional) {
        this.TarjetaProfesional = TarjetaProfesional;
    }
    
    
    
}
