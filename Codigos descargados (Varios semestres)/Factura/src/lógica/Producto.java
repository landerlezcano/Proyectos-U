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
public abstract class Producto {
    
//    public static float IVA = (float) 0.16;
    
    private long ID;
    private String nombre_producto;
    private float precio_producto;
    private int cantidad;
    private String marca_producto;

    
    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }
    
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Producto() {
    }

    public Producto(String nombre_producto, float precio_product) {
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
    public float precioIVA(){
//        return this.precio_producto*lógica.Producto.IVA;
        return (float) (this.getPrecio_producto()*(0.16));
    }
    
    
}
