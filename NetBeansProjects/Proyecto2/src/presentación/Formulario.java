/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentación;

import java.io.InputStream;
import java.util.Scanner;
import logica.Fibonacci;

/**
 *
 * @author estudiante
 */
public class Formulario {
    
    
    public static void main(String[] args) {
        Fibonacci objFibo = new Fibonacci(121);
        System.out.println(objFibo.generarSerie());
//        objFibo.setN(n);
    }
    
}
