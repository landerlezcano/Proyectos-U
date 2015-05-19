
import Modelo.Avion;
import Modelo.MedioTransporte;
import Modelo.ServicioGeneral;
import java.util.Arrays;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        RutaEscolar obj1 = new RutaEscolar(new Bus(),"ciudad bolivar","bosa");
////        System.out.println(obj1.idZona.get("ciudad bolivar"));
////        System.out.println(obj1.idZona.get("bosa"));
//        System.out.println(Arrays.asList(1,3).equals(Arrays.asList(3,1)));
//        HashSet a= new HashSet();
//        a.add("a");
//        a.add("b");
//        HashSet b= new HashSet();
//        b.add("b");
//        b.add("a");
//        System.out.println(a.equals(b));
//        ServicioGeneral obj2 = new ServicioGeneral(new Avion(),"pasto","bogota");
//        obj2.getObjTransporte().setCostoKM(40000);
//        obj2.getObjTransporte().setNPasajeros(42);
////        System.out.println(obj1.calcularNoKm());
////        System.out.println(obj1.costoMensual());
//        System.out.println(obj2.idCiudad.get("pasto"));
//        int a=obj2.idCiudad.get("pasto");
//        System.out.println(obj2.idCiudad.get("bogota"));
//        int b=obj2.idCiudad.get("bogota");
//        System.out.println(obj2.NoKm.get(new HashSet(Arrays.asList(4,1))));
//        System.out.println(obj2.NoKm.get(new HashSet(Arrays.asList(1,4))));
//        System.out.println(obj2.NoKm.get(new HashSet(Arrays.asList(a,b))));
//        System.out.println(obj2.getObjTransporte().getCostoKM());
//        System.out.println(obj2.DistanciaKm());
//        System.out.println(obj2.calcularCostoTotal());
//        System.out.printf("%.0f\n", obj2.calcularCostoTotal());
//        System.out.printf("%.2f\n", obj2.calcularCostoTotal());
//        System.out.println(obj2.toString()+"\n\n\n"
//                            +"Costo por pasajero :"+String.format("%.2f", obj2.calcularCostoPorPasajero())
//                            +"\n\nCosto total :"+String.format("%.2f", obj2.calcularCostoTotal()));
        short a=32766;
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        for(int i=0;i<1500;i++){
            a++;
        }
        System.out.println(a);
    }
    
}
