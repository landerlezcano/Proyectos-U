/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import Vista.InOut;
import javax.swing.JOptionPane;
/**
 *
 * @author Yair
 */
public class Ancianato {
    private int destino1,destino2,destino3;
   
    InOut ob1 = new InOut();
    
    public Ancianato() {   //Constructor de la clase
        destino1 = 0;
        destino2 = 0;
        destino3 = 0;
    }

    public int getDestino1() {
        return destino1;
    }

    public void setDestino1(int destino1) {
        this.destino1 = destino1;
    }

    public int getDestino2() {
        return destino2;
    }

    public void setDestino2(int destino2) {
        this.destino2 = destino2;
    }

    public int getDestino3() {
        return destino3;
    }

    public void setDestino3(int destino3) {
        this.destino3 = destino3;
    }

    public int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public int solicitarEstrato(){
        int est;
        est=ob1.solicitarNum("Ingrese estrato del abuelito: ");
        while((est<1) || (est>6)){
            est=ob1.solicitarNum("Estrato inválido \n Ingrese estrato del abuelito: ");
        }
        return est;
    }
    public int solicitarNumHijos(){
        int numHijos;
        numHijos=ob1.solicitarNum("Ingrese cantidad de hijos del abuelito"
                + "\n \t En caso de no tener hijos, ingrese '0'");
        while((numHijos<0) || (numHijos>15)){
            numHijos=ob1.solicitarNum("Número inválido \n Ingrese cantidad de "
                    + "hijos del abuelito\n \t En caso de no tener hijos, ingrese '0'");
        }
        return numHijos;
    }
    public int solicitarPago(){
        int pago;
        pago=ob1.solicitarNum("Ingrese el monto de pago mensual del abuelito"
                + "\n \t En caso de no pagar mensualidad, ingrese '0'");
        while(pago<0){
            pago=ob1.solicitarNum("Número inválido \n Ingrese el monto de "
                    + "pago mensual del abuelito\n \t En caso de no pagar mensualidad, ingrese '0'");
        }
        return pago;
    }
    public void aumentarDestino(int est, int numHijos, int pago){
        if ((est==2)&&(numHijos==0)&&(pago==0)){
            setDestino1(getDestino1()+1);
        }else if ((est==3)&&(numHijos==2 || numHijos==3)&&(pago>=250000 && pago<=500000)){
            setDestino2(getDestino2()+1);
        }else {
            if((est>=4)&&(pago>=1000000 && pago<=2000000)){
            setDestino3(getDestino3()+1);
            }
        }
    }
    public void ingresarEntrada(){
        int est,numHijos,pago,var;
        String destino;
        est=solicitarEstrato();
        numHijos=solicitarNumHijos();
        pago=solicitarPago();
        if ((est==2)&&(numHijos==0)&&(pago==0)){
            destino = "Melgar";
        }else if ((est==3)&&(numHijos==2 || numHijos==3)&&(pago>=250000 && pago<=500000)){
            destino = "San Andrés";
        }else {
            if((est>=4)&&(pago>=1000000 && pago<=2000000)){
            destino = "Cancún";
            }else{
                destino="Ninguno";
            }
        }
        var=ob1.mostrarConfirm("Estrato: "+est+"\nNúmero de familiares:"+numHijos+
                "\nPago mensual: "+pago+"\nDestino: "+destino+"\n¿Desea continuar?"); 
        if (var == JOptionPane.YES_OPTION) {
                    aumentarDestino(est,numHijos,pago);
                  } 
    }
    void mostrarInfoCostos(){
        float precio1,precio2,precio3,total;
        precio1=ob1.solicitarNum("Ingrese precio unitario del viaje a Melgar: ");
        precio2=ob1.solicitarNum("Ingrese precio unitario del viaje a San Andrés: ");
        precio3=ob1.solicitarNum("Ingrese precio unitario del viaje a Cancún: ");
        if(getDestino1()>10){
            ob1.mostrar("El total de viajes a Melgar tienen 20% de descuento.");
            total=precio1*getDestino1();
            total=(float) (total-((precio1*getDestino1())*0.20));
        }else{
            total=precio1*getDestino1();
        }
        if(getDestino2()>10){
            ob1.mostrar("El total de viajes a San Andrés tienen 20% de descuento.");
            total=(float) (total+((precio2*getDestino2())-((precio2*getDestino2())*0.20)));
        }else{
            total=total+(precio2*getDestino2());
        }
        if(getDestino3()>10){
            ob1.mostrar("El total de viajes a Cancún tienen 20% de descuento.");
            total=(float) (total+((precio3*getDestino3())-((precio3*getDestino3())*0.20)));
        }else{
            total=total+(precio3*getDestino3());
        }
        ob1.mostrar("Informe de costos\nPrecios:\nViaje a Melgar: "+precio1+
                "\nViaje a San Andrés: "+precio2+"\nViaje a Cancún: "+precio3+
                "\n\nTotal - Costo de viajes para el ancianato: "+total);
    }
    public void ejecutarMenu(){
        int opc;
        opc=ob1.mostrarMenu();
        while (true){
            switch(opc){
                case 1:
                    ingresarEntrada();
                    ejecutarMenu();
                    break;
                case 2:
                    ob1.mostrar("Cantidad de viajeros por destino: \n"+"\tMelgar:"
                            +getDestino1()+"\n\tSan Andrés:"+getDestino2()+"\n\tCancún:"+getDestino3());
                    ejecutarMenu();
                    break;
                case 3:
                    mostrarInfoCostos();
                    ejecutarMenu();
                    break;
                case 4:
                    int var;
                    var=ob1.mostrarConfirm("¿Desea salir del programa?");
                    if (var == JOptionPane.NO_OPTION) {
                        ejecutarMenu();
                      } else if (var == JOptionPane.YES_OPTION) {
                        break;
                      } 
                    break;

            }
        break;
        }
    }
    
}
