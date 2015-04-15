/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author estudiant
 */
public class Estudiante {
    String nombre;
    long codigo;
    float notas[];

    public Estudiante(String nombre, long codigo, float[] notas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.notas = notas;
    }

    public Estudiante() {
        this.notas = new float[3];
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    public void setNotas(float auxNota, int posicion) {
        this.notas[posicion]=auxNota;
    }

    public float generarPromedio(){
        float aux=0;
        for(int i=0; i<notas.length;i++){
            aux+=notas[i];
        }
        return aux/notas.length;
    }
}
