/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class ServicioGeneral implements IServicio{

    protected MedioTransporte objTransporte;
    private String ciudadOrigen;
    private String ciudadDestino;
    public static HashMap<String,Integer> idCiudad;
    public static Map<HashSet, Double> NoKm;

    public ServicioGeneral() {
    }

    public ServicioGeneral(MedioTransporte objTransporte, String ciudadOrigen, String ciudadDestino) {
        this.objTransporte = objTransporte;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }
    
    static{
        idCiudad = new HashMap<String, Integer>();
        NoKm = new HashMap<HashSet, Double>();
        idCiudad.put("bogota", 1);
        idCiudad.put("neiva", 2);
        idCiudad.put("santa marta", 3);
        idCiudad.put("pasto", 4);
        NoKm.put(new HashSet(Arrays.asList(1,2)), 297.2);
        NoKm.put(new HashSet(Arrays.asList(1,3)), 978.0);
        NoKm.put(new HashSet(Arrays.asList(1,4)), 272.4);
        NoKm.put(new HashSet(Arrays.asList(2,3)), 1134.7);
        NoKm.put(new HashSet(Arrays.asList(2,4)), 430.2);
        NoKm.put(new HashSet(Arrays.asList(3,4)), 1583.5);
    }
    
    public MedioTransporte getObjTransporte() {
        return objTransporte;
    }

    public void setObjTransporte(MedioTransporte objTransporte) {
        this.objTransporte = objTransporte;
    }
    
    @Override
    public double calcularCostoTotal() {
        return objTransporte.CostoKM*DistanciaKm();
    }
    
    public double DistanciaKm(){
        return NoKm.get(new HashSet(Arrays.asList(idCiudad.get(ciudadOrigen),idCiudad.get(ciudadDestino))));
    }

    @Override
    public double calcularCostoPorPasajero() {
        return calcularCostoTotal()/objTransporte.NPasajeros;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    @Override
    public String toString() {
        return "Servicio General\n\n" + objTransporte + "\nCiudad de origen : " 
                + ciudadOrigen + "\nCiudad de destino : " + ciudadDestino + '\n';
    }
    
    
    
}
