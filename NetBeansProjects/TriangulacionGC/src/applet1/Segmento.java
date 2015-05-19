package applet1;

public class Segmento
{
  public int A;
  public int B;
  public boolean interno;

  public Segmento(int paramInt1, int paramInt2)
  {
    this.A = paramInt1; this.B = paramInt2;
    this.interno = false;
  }

  public boolean Igual(Segmento paramSegmento)
  {
    boolean i = false;

    if (((this.A == paramSegmento.A) && (this.B == paramSegmento.B)) || ((this.A == paramSegmento.B) && (this.B == paramSegmento.A))) {
      i = true;
    }
    return i;
  }
}