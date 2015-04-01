/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

/**
 *
 * @author estudiante
 */
public class ProductoSoftware extends Producto{

    public ProductoSoftware(tipoSoftware tipo, String nombre_producto, float precio_product) {
        super(nombre_producto, precio_product);
        this.tipo = tipo;
    }

    public ProductoSoftware() {
        super();
    }

    public String tipoProducto() {
        String aux = "Tipo de hardware: ";
        switch(tipo){
            case Juego:
                aux+="Juego.";
                break;
            case SO:
                aux+="Sistema operativo.";
                break;
            case Office:
                aux+="Office.";
                break;
            case otro:
                aux+="Otro.";
                break;
        }
        return aux;
    }

    public void setTipo(tipoSoftware tipo) {
        this.tipo = tipo;
    }
    public enum tipoSoftware{
        Juego,SO,Office, otro;
    }
    
    private tipoSoftware tipo;

    @Override
    public String toString() {
        return "\nID producto: "+getID()+"\n"+this.tipoProducto()
                +"\nNombre del producto: "+getNombre_producto()+
                "\nMarca del producto: "+getMarca_producto()+"\nCantidad de productos: "+
                getCantidad()+"\nPrecio del producto: "+getPrecio_producto()+"\n";
    }
    
    
    
}
