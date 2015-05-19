package applet1;

import java.util.Vector;

public class ListaTriangulos
{
  private Vector lista = new Vector();

  public void Nuevo(int paramInt1, int paramInt2, int paramInt3)
  {
    Triangulo localTriangulo = new Triangulo(paramInt1, paramInt2, paramInt3);

    this.lista.addElement(localTriangulo);
  }

  public void Cambia(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Triangulo localTriangulo = new Triangulo(paramInt2, paramInt3, paramInt4);

    this.lista.setElementAt(localTriangulo, paramInt1 - 1);
  }

  public int Numero() {
    return this.lista.size();
  }

  public void Borra() {
    this.lista = new Vector();
  }

  public void Borra(int paramInt) {
    this.lista.removeElementAt(paramInt - 1);
  }

  public int LadoA(int paramInt) {
    return ((Triangulo)this.lista.elementAt(paramInt - 1)).a;
  }

  public int LadoB(int paramInt) {
    return ((Triangulo)this.lista.elementAt(paramInt - 1)).b;
  }

  public int LadoC(int paramInt) {
    return ((Triangulo)this.lista.elementAt(paramInt - 1)).c;
  }

  public boolean Existe(int paramInt1, int paramInt2, int paramInt3)
  {
    Triangulo localTriangulo = new Triangulo(paramInt1, paramInt2, paramInt3);
    boolean i = false;
    int k = this.lista.size();
    int j = 0;

    while ((j < k) && (i == false)) {
      if (((Triangulo)this.lista.elementAt(j)).Igual(localTriangulo))
        i = true;
      else j++;
    }

    return i;
  }
}