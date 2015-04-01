/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class autoNumerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        Scanner dato= new Scanner(System.in);
        System.out.println("valor de x"+ x);
        x=dato.nextInt();
        System.out.println("nuevo valor"+x);
    }
    
}
