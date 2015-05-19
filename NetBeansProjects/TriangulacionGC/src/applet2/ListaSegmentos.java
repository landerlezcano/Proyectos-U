package applet2;

import java.util.Vector;

public class ListaSegmentos
{
  private Vector lista = new Vector();

  public void Nuevo(int paramInt1, int paramInt2)
  {
    Segmento localSegmento = new Segmento(paramInt1, paramInt2);

    this.lista.addElement(localSegmento);
  }

  public int Numero() {
    return this.lista.size();
  }

  public void Cambia(int paramInt1, int paramInt2, int paramInt3)
  {
    Segmento localSegmento = new Segmento(paramInt2, paramInt3);

    this.lista.setElementAt(localSegmento, paramInt1 - 1);
  }

  public void Cambia(int paramInt, boolean paramBoolean)
  {
    Segmento localSegmento = new Segmento(ExtremoA(paramInt), ExtremoB(paramInt));
    localSegmento.interno = paramBoolean;

    this.lista.setElementAt(localSegmento, paramInt - 1);
  }

  public boolean Interior(int paramInt) {
    return ((Segmento)this.lista.elementAt(paramInt - 1)).interno;
  }

  public int ExtremoA(int paramInt) {
    return ((Segmento)this.lista.elementAt(paramInt - 1)).A;
  }

  public int ExtremoB(int paramInt) {
    return ((Segmento)this.lista.elementAt(paramInt - 1)).B;
  }

  public void Borra() {
    this.lista = new Vector();
  }

  public void Borra(int paramInt) {
    this.lista.removeElementAt(paramInt - 1);
  }

  public boolean Existe(int paramInt1, int paramInt2)
  {
    Segmento localSegmento = new Segmento(paramInt1, paramInt2);
    boolean i = false;
    int k = this.lista.size();
    int j = 0;

    while ((j < k) && (i == false)) {
      if (((Segmento)this.lista.elementAt(j)).Igual(localSegmento))
        i = true;
      else j++;
    }

    return i;
  }

  public int Indice(int paramInt1, int paramInt2)
  {
    Segmento localSegmento = new Segmento(paramInt1, paramInt2);
    int j = this.lista.size();
    int i = 0;

    while ((i < j) && (!((Segmento)this.lista.elementAt(i)).Igual(localSegmento))) {
      i++;
    }
    return i + 1;
  }
}