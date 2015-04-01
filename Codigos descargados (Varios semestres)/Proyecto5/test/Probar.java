/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JOptionPane;
import lógica.Tiempo;

/**
 *
 * @author estudiante
 */
public class Probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo objTiempo = new Tiempo(00,00,00);
        objTiempo.sumarSegundo();
        objTiempo.restarTiempo();
        while(true){
            System.out.println("Nueva hora: "+objTiempo.getH()+":"+
            objTiempo.getM()+":"+objTiempo.getS());
            objTiempo.sumarSegundo();
            objTiempo.restarTiempo();
        }
    }
    
}
