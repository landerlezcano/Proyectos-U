package applet1;

import java.util.Vector;

public class TablaIndices
{
  private Vector indices = new Vector();

  public void Nuevo(int paramInt)
  {
    this.indices.addElement(new Integer(paramInt));
  }

  public int Elemento(int paramInt) {
    return ((Integer)this.indices.elementAt(paramInt - 1)).intValue();
  }

  public int Numero() {
    return this.indices.size();
  }

  public void Borra() {
    this.indices = new Vector();
  }

  public void Borra(int paramInt) {
    this.indices.removeElementAt(paramInt - 1);
  }

  public boolean Existe(int paramInt)
  {
    int j = 0;
    boolean i = false;
    int k = this.indices.size();

    while ((j < k) && (i == false)) {
      if (paramInt == ((Integer)this.indices.elementAt(j)).intValue())
        i = true;
      else j++;
    }

    return i;
  }
}