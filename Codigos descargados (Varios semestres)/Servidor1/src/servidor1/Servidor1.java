/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor1;

import java.net.*;
import java.io.*;


public class Servidor1 {
    final int PUERTO=5000;
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    String mensajeRecibido;
    BufferedReader entrada = null;

//SERVIDOR

    public void initServer(){
        
        try{
            sc = new ServerSocket(PUERTO);
            so=new Socket();
            System.out.println("Esperando una conexión:");
            so = sc.accept();
            System.out.println("Un cliente se ha conectado.");
            System.out.println("Confirmando conexion al cliente....");
            Thread principal = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        leer();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });
            principal.start();
        }catch(Exception e ){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void leer() {
        Thread leer = new Thread(new Runnable() {
            public void run() {
                try {
                    entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
                    while (true) {
                        String mensajeR = entrada.readLine();
                        System.out.println("Cliente dice: " + mensajeR);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        leer.start();
    }
    
    public static void main(String args[]){
        Servidor1 obj1 = new Servidor1();
        obj1.initServer();
    }
}