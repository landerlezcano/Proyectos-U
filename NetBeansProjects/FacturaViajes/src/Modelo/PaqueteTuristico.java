/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import Modelo.*;

/**
 *
 * @author estudiante
 */
public class PaqueteTuristico {
    
    ReservaPasaje pasaje;
    ReservaHotel hotel;

    public PaqueteTuristico(ReservaPasaje pasaje, ReservaHotel hotel) {
        this.pasaje = pasaje;
        this.hotel = hotel;
    }

    public PaqueteTuristico() {
        this.pasaje=new ReservaPasaje();
        this.hotel=new ReservaHotel();
    }
    
    public long calcularPrecio(){
        return this.pasaje.calcularPrecio()+this.calcularPrecio();
    }

    @Override
    public String toString() {
        return pasaje + "\n" + hotel + "\n";
    }
    
}
