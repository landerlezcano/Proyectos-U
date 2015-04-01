/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpitagoras;

/**
 *
 * @author Yair
 */
public class CPitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
  {
    int x = 1, y = 1, z = 0;
    System.out.println("Z\t" + "X\t" + "Y");
    System.out.println("____________________");
    while (x <= 50)
    {
      // Calcular z. Como z es un entero, almacena
      // la parte entera de la raíz cuadrada
      z = (int)Math.sqrt(x * x + y * y);
      while (y <= 50 && z <= 50)
      {
          if (z*z==x*x+y*y)
              System.out.println(z+"\t"+x+"\t"+y);
            y=y+1;
            z = (int)Math.sqrt(x*x+y*y);

      }
      x = x + 1; 
      y = x;
    }
  }
}