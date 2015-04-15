package leerdatos;

// Utiliza la clase Leer que debe de estar almacenada

import java.io.*;

public class LeerDatos
{
  // Cálculo del factorial de un número
  public static long factorial(int n)
  {
    long contador;  
    if (n == 0)
      return 1;
    else
      contador = n * factorial(n-1);
    return contador;
  }

  public static void main(String[] args)
  {
    int numero;
    long fac;
    do
    {
      System.out.print("¿Número? ");
      numero = Leer.datoInt();
    }
    while (numero < 0 || numero > 25);
    fac = factorial(numero);
    System.out.println("\nEl factorial de " + numero + " es: " + fac);
  }
}