/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class RutaEscolar implements IServicio{
    
    private Bus objBus;
    private String zonaTrabajo;
    private String zonaColegio;
    public static HashMap<String,Integer> idZona;
    public static Map<List, Integer> NoKm;

    public Bus getObjBus() {
        return objBus;
    }

    public void setObjBus(Bus objBus) {
        this.objBus = objBus;
    }

    public String getZonaTrabajo() {
        return zonaTrabajo;
    }

    public void setZonaTrabajo(String zonaTrabajo) {
        this.zonaTrabajo = zonaTrabajo;
    }

    public String getZonaColegio() {
        return zonaColegio;
    }

    public void setZonaColegio(String zonaColegio) {
        this.zonaColegio = zonaColegio;
    }

    public RutaEscolar(Bus objBus, String zonaColegio, String zonaTrabajo) {
        this.objBus = objBus;
        this.zonaTrabajo = zonaTrabajo;
        this.zonaColegio = zonaColegio;
    }

    public RutaEscolar() {
    }

    static{
        idZona = new HashMap<String, Integer>();
        NoKm = new HashMap<List, Integer>();
        idZona.put("ciudad bolivar", 1);
        idZona.put("rafael uribe", 2);
        idZona.put("bosa", 3);
        idZona.put("usaquen", 4);
        NoKm.put(Arrays.asList(1,2), 50);
        NoKm.put(Arrays.asList(1,3), 80);
        NoKm.put(Arrays.asList(1,4), 160);
        NoKm.put(Arrays.asList(1,1), 25);
    }
    
    @Override
    public double calcularCostoTotal() {
        int noKm = calcularNoKm();
        return noKm<=50 ? 2000000 : noKm>50&& noKm<=100 ?3500000 : noKm>100 ? 4500000:0; 
    }
    
    public int calcularNoKm(){
        return NoKm.get(Arrays.asList(idZona.get(this.zonaColegio),idZona.get(this.zonaTrabajo)));
    }

    @Override
    public double calcularCostoPorPasajero() {
        return calcularCostoTotal()/objBus.NPasajeros;
    }

    @Override
    public String toString() {
        return "Ruta escolar\n\n" + objBus + "\nZona de trabajo : " 
                + zonaTrabajo + "\nZona del colegio : " + zonaColegio + '\n';
    }
    
    
}
