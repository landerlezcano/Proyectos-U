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
public class ProductoHardware extends Producto{

    public ProductoHardware(tipoHardware tipo, String nombre_producto, float precio_producto) {
        super(nombre_producto, precio_producto);
        this.tipo = tipo;
    }

    public ProductoHardware() {
        super();
    }
    
    
    
    public String tipoProducto() {
        String aux = "Tipo de hardware: ";
        switch(tipo){
            case Portatil:
                aux+="Portatil.";
                break;
            case PC_Escritorio:
                aux+="PC de escritorio.";
                break;
            case Servidor:
                aux+="Servidor.";
                break;
            case otro:
                aux+="Otro.";
                break;
        }
        return aux;
    }

    public tipoHardware getTipo() {
        return tipo;
    }

    public void setTipo(tipoHardware tipo) {
        this.tipo = tipo;
    }
    public enum tipoHardware{
        Portatil,PC_Escritorio,Servidor,otro;
    }
    
    private tipoHardware tipo;
    
    @Override
    public String toString() {
        return "\nID producto: "+getID()+"\n"+this.tipoProducto()
                +"\nNombre del producto: "+getNombre_producto()+
                "\nMarca del producto: "+getMarca_producto()+"\nCantidad de productos: "+
                getCantidad()+"\nPrecio del producto: "+getPrecio_producto()+"\n";
    }
    
}
