package applet1;

public class Triangulo
{
  public int a;
  public int b;
  public int c;

  public Triangulo(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1; this.b = paramInt2; this.c = paramInt3;
  }

  public boolean Igual(Triangulo paramTriangulo)
  {
    boolean i = false;

    if (((this.a == paramTriangulo.a) && (this.b == paramTriangulo.b) && (this.c == paramTriangulo.c)) || 
      ((this.a == paramTriangulo.a) && (this.b == paramTriangulo.c) && (this.c == paramTriangulo.b)) || 
      ((this.a == paramTriangulo.b) && (this.b == paramTriangulo.a) && (this.c == paramTriangulo.c)) || 
      ((this.a == paramTriangulo.b) && (this.b == paramTriangulo.c) && (this.c == paramTriangulo.a)) || 
      ((this.a == paramTriangulo.c) && (this.b == paramTriangulo.a) && (this.c == paramTriangulo.b)) || (
      (this.a == paramTriangulo.c) && (this.b == paramTriangulo.b) && (this.c == paramTriangulo.a))) {
      i = true;
    }
    return i;
  }
}