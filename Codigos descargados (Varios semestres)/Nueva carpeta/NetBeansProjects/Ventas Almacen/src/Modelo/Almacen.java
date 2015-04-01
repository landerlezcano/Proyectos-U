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
 * @author yair
 */
public class Almacen {
    InOut ob1=new InOut();
    private int contadorDia;
    private int totalVendido;
    private int cantidadVentas;
    private int contadorSemana;
    
    public Almacen(){
        contadorDia=1;
        totalVendido=0;
        cantidadVentas=0;
        contadorSemana=1;
    }

    public InOut getOb1() {
        return ob1;
    }

    public void setOb1(InOut ob1) {
        this.ob1 = ob1;
    }

    public int getContadorDia() {
        return contadorDia;
    }

    public void setContadorDia(int contadorDia) {
        this.contadorDia = contadorDia;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public int getContadorSemana() {
        return contadorSemana;
    }

    public void setContadorSemana(int contadorSemana) {
        this.contadorSemana = contadorSemana;
    }
    public int multiplicar(int d1, int d2){
        return d1*d2;
    }
    public void acumularTotal(int d1, int d2){
        setTotalVendido(d1+d2);
    }
    public void aumentarCantVenta(){
        setCantidadVentas(getCantidadVentas()+1);
    }
    public void aumentarSemana(){
        setContadorSemana(getContadorSemana()+1);
    }
    public void siguienteDia(){
        setContadorDia(getContadorDia()+1);
        if(getContadorDia() == 8){
            aumentarSemana();
            setContadorDia(1);
        }
    }
    public void mostrarInfo(){
        String res="Día "+getContadorDia()+", Semana "+getContadorSemana()+".\n";

            res=res+"Total vendido: $"+getTotalVendido()+"\n";
            res=res+"\n";
            res=res+"Cantidad de ventas hechas: "+getCantidadVentas()+"\n";
        ob1.mostrar(res);
    }
    public void ingresarVenta(){
        int var1,var2,acum,var3;
        var1 = ob1.solicitarNum("Ingrese el precio del producto: \n");
        var2=ob1.solicitarNum("Ingrese la cantidad del producto a comprar: \n");
        acum=multiplicar(var1, var2);
        var3=ob1.mostrarConfirm("Precio: "+var1+"\nCantidad: "+var2+
                "\n El valor total de la compra es: $"+acum+"\n "
                                   + "¿Desea almacenar la compra?");
                if (var3 == JOptionPane.NO_OPTION) {
                    ejecutarMenu();
                  } else if (var3 == JOptionPane.YES_OPTION) {
                    acumularTotal(getTotalVendido(), acum);
                    aumentarCantVenta();
                  } 
    }
    public void ejecutarMenu(){
        int opc;
        do{
        opc = ob1.mostrarMenu(Integer.toString(getContadorDia()));
        }while((opc < 1) || opc>4);
        System.out.println(opc);
        switch(opc){
            case 1:
                ingresarVenta();
                ejecutarMenu();
                break;
            case 2:
                mostrarInfo();
                ejecutarMenu();
                break;
            case 3:
                siguienteDia();
                ejecutarMenu();
                break;
            case 4:
                int var;
                var=ob1.mostrarConfirm("¿Desea salir del programa?");
                if (var == JOptionPane.NO_OPTION) {
                    ejecutarMenu();
                  } else if (var == JOptionPane.YES_OPTION) {
                    mostrarInfo();
                    break;
                  } 
                break;
        }
        
    }
    
    
}
