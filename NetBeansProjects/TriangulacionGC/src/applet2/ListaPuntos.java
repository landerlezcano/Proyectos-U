package applet2;

import java.util.Vector;

public class ListaPuntos
{
  private Vector lista = new Vector();

  public void Nuevo(int paramInt1, int paramInt2)
  {
    Punto localPunto = new Punto(paramInt1, paramInt2);

    this.lista.addElement(localPunto);
  }

  public int Numero() {
    return this.lista.size();
  }

  public int X(int paramInt) {
    return ((Punto)this.lista.elementAt(paramInt - 1)).x;
  }

  public int Y(int paramInt) {
    return ((Punto)this.lista.elementAt(paramInt - 1)).y;
  }

  public void Borra() {
    this.lista = new Vector();
  }

  public void Borra(int paramInt) {
    this.lista.removeElementAt(paramInt - 1);
  }

  public void Cambia(int paramInt1, int paramInt2, int paramInt3)
  {
    Punto localPunto = new Punto(paramInt2, paramInt3);

    this.lista.setElementAt(localPunto, paramInt1 - 1);
  }

  public boolean Existe(int paramInt1, int paramInt2)
  {
    Punto localPunto = new Punto(paramInt1, paramInt2);
    boolean i = false;
    int k = this.lista.size();
    int j = 0;

    while ((j < k) && (i == false)) {
      if (((Punto)this.lista.elementAt(j)).Igual(localPunto))
        i = true;
      else j++;
    }

    return i;
  }
}