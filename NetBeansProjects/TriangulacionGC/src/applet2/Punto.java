package applet2;

public class Punto
{
  public int x;
  public int y;

  public Punto(int paramInt1, int paramInt2)
  {
    this.x = paramInt1; this.y = paramInt2;
  }

  public boolean Igual(Punto paramPunto) {
    return (this.x == paramPunto.x) && (this.y == paramPunto.y);
  }
}