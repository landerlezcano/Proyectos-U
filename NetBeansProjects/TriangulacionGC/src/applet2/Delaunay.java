package applet2;

public class Delaunay
{
  public ListaPuntos puntos = new ListaPuntos();
  public ListaSegmentos segmentos = new ListaSegmentos();

  public void Limpia()
  {
    this.puntos = new ListaPuntos();
    this.segmentos = new ListaSegmentos();
  }

  public void NuevoPunto(int paramInt1, int paramInt2)
  {
    this.puntos.Nuevo(paramInt1, paramInt2);
  }

  public void EliminaPunto(int paramInt)
  {
    this.puntos.Borra(paramInt);
  }

  public boolean NuevoSegmento(int paramInt1, int paramInt2)
  {
    boolean k = false;

    if ((!this.segmentos.Existe(paramInt1, paramInt2)) && (paramInt1 != paramInt2)) {
      int i = 1;
      k = true;
      int j = this.segmentos.Numero();

      while ((i <= j) && (k != false)) {
        if (Corta(this.segmentos.ExtremoA(i), this.segmentos.ExtremoB(i), paramInt1, paramInt2))
          k = false;
        else i++;
      }

      if (k != false) this.segmentos.Nuevo(paramInt1, paramInt2);
    }

    return k;
  }

  private boolean Corta(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d1 = this.puntos.X(paramInt1);
    double d2 = this.puntos.X(paramInt2);
    double d3 = this.puntos.X(paramInt3);
    double d4 = this.puntos.X(paramInt4);
    double d5 = this.puntos.Y(paramInt1);
    double d6 = this.puntos.Y(paramInt2);
    double d7 = this.puntos.Y(paramInt3);
    double d8 = this.puntos.Y(paramInt4);

    double d9 = d2 - d1; double d10 = d3 - d4; double d11 = d6 - d5;
    double d12 = d7 - d8; double d13 = d3 - d1; double d14 = d7 - d5;
    double d15 = (d12 * d13 - d10 * d14) / (d9 * d12 - d10 * d11);
    double d16 = (d9 * d14 - d11 * d13) / (d9 * d12 - d10 * d11);

    return (d15 > 0.0D) && (d15 < 1.0D) && (d16 > 0.0D) && (d16 < 1.0D);
  }

  private int PuntoComun(int paramInt1, int paramInt2)
  {
    int j = this.segmentos.ExtremoA(paramInt1);
    int k = this.segmentos.ExtremoB(paramInt1);
    int m = this.segmentos.ExtremoA(paramInt2);
    int n = this.segmentos.ExtremoB(paramInt2);

    int i = 0;
    if ((j == m) || (j == n)) i = j;
    if ((k == m) || (k == n)) i = k;

    return i;
  }

  private boolean PuntosVisibles(int paramInt1, int paramInt2)
  {
    int i = 1;
    boolean k = true;
    while ((i <= this.segmentos.Numero()) && (k != false)) {
      if (Corta(paramInt1, paramInt2, this.segmentos.ExtremoA(i), this.segmentos.ExtremoB(i)))
        k = false;
      i++;
    }

    int j = this.puntos.Numero();
    this.puntos.Nuevo((this.puntos.X(paramInt1) + this.puntos.X(paramInt2)) / 2, 
      (this.puntos.Y(paramInt1) + this.puntos.Y(paramInt2)) / 2);

    if (!PuntoInterior(j + 1)) {
      k = false;
    }

    this.puntos.Borra(j + 1);

    return k;
  }

  private boolean PuntoInterior(int paramInt)
  {
    int m = 0;
    int k = this.puntos.Numero();
    for (int i = 1; i <= k; i++) {
      if (this.puntos.X(i) <= m) continue; m = this.puntos.X(i);
    }

    this.puntos.Nuevo(m + 10, this.puntos.Y(paramInt) + 10);

    int j = 0;
    for (int i = 1; i <= this.segmentos.Numero(); i++) {
      if ((this.segmentos.Interior(i)) || 
        (!Corta(paramInt, k + 1, this.segmentos.ExtremoA(i), this.segmentos.ExtremoB(i)))) continue;
      j++;
    }

    this.puntos.Borra(k + 1);

    return j % 2 != 0;
  }

  public boolean Triangulacion()
  {
    if (!Poligono()) {
      return false;
    }
    int m = this.segmentos.Numero();
    for (int i = 1; i <= m; i++) {
      this.segmentos.Cambia(i, false);
    }
    int k = 0;
    m = this.puntos.Numero();
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= m; j++) {
        if ((!this.segmentos.Existe(i, j)) && (PuntosVisibles(i, j))) {
          k++;
          this.segmentos.Nuevo(i, j);
          this.segmentos.Cambia(this.segmentos.Numero(), true);
        }
      }
    }

    return true;
  }

  private boolean Poligono()
  {
    int[] arrayOfInt = new int[this.puntos.Numero()];
    int k = this.segmentos.Numero();
    boolean i = true;

    for (int j = 0; j < this.puntos.Numero(); j++) {
      arrayOfInt[j] = 0;
    }
    int j = 1;
    while ((j <= k) && (i != false)) {
      int m = this.segmentos.ExtremoA(j) - 1;
      int n = this.segmentos.ExtremoB(j) - 1;
      arrayOfInt[m] += 1;
      arrayOfInt[n] += 1;
      if ((arrayOfInt[m] > 2) || (arrayOfInt[n] > 2))
        i = false;
      j++;
    }

    j = 0;
    while ((j < this.puntos.Numero()) && (i != false)) {
      if (arrayOfInt[j] != 2) i = false;
      j++;
    }

    if (this.segmentos.Numero() != this.puntos.Numero()) {
      i = false;
    }
    return i;
  }
}