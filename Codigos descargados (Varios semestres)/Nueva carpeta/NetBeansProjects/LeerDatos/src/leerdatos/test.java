package leerdatos;

// Utiliza la clase Leer que debe de estar almacenada

import java.io.*;

public class test
{
  public static void Visualizar(byte car)
  {
    int i = 0, bit;
    for (i = 7; i >= 0; i--)
    {
      bit = ((car & (1 << i))!= 0) ? 1 : 0;
      System.out.print(bit);
    }
    System.out.println();
  }
  
  public static byte HaceAlgo(byte car)
  {
    return (byte)(((car & 0x01) << 7) | ((car & 0x02) << 5) |
                  ((car & 0x04) << 3) | ((car & 0x08) << 1) |
                  ((car & 0x10) >> 1) | ((car & 0x20) >> 3) |
                  ((car & 0x40) >> 5) | ((car & 0x80) >> 7));
  }


  public static void main(String[] args)
  {
    byte car;
    try
    {
      System.out.print("Introduce un carácter ASCII: ");
      car = (byte)System.in.read();
      System.out.print((int)car);
      System.out.println();
      Visualizar(car);
      System.out.println("\nCarácter resultante:");
      car = HaceAlgo(car);
      Visualizar(car);
    }
    catch (IOException ignorar){}
  }
}