package applet1;

public class Delaunay
{
  public ListaPuntos puntos = new ListaPuntos();
  public ListaSegmentos segmentos = new ListaSegmentos();
  public ListaTriangulos triangulos = new ListaTriangulos();
  public TablaIndices cola = new TablaIndices();
  public int paso;
  public int actual;
  public int triang1;
  public int triang2;
  public double centroX;
  public double centroY;
  public double radio;

  public void Limpia()
  {
    this.puntos = new ListaPuntos();
    this.segmentos = new ListaSegmentos();
    this.triangulos = new ListaTriangulos();
    this.cola = new TablaIndices();
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

    if (!this.segmentos.Existe(paramInt1, paramInt2)) {
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

  public boolean IniciaTriangulacion()
  {
    int i2 = this.segmentos.Numero();
    this.triangulos.Borra();
    this.cola.Borra();
    int j;
    int k;
    for (int i = 1; i <= i2; i++) {
      for (j = 1; j <= i2; j++) {
        int m = PuntoComun(i, j);
        if ((j != i) && (m != 0)) {
          for (k = 1; k <= i2; k++) {
            int n = PuntoComun(i, k);
            int i1 = PuntoComun(j, k);
            if ((k == i) || (k == j) || (n == 0) || (i1 == 0) || (n == i1) || 
              (!Vacio(i, j, k)) || (this.triangulos.Existe(i, j, k))) continue;
            this.triangulos.Nuevo(i, j, k);
          }
        }
      }

    }

    i2 = this.segmentos.Numero();
    int i3 = this.triangulos.Numero();
    for (int i = 1; i <= i2; i++) {
      int i4 = 0;
      for (j = 1; j <= i3; j++) {
        if (SegmentoEnTriangulo(i, j))
          i4++;
      }
      if (i4 == 2) {
        this.cola.Nuevo(i);
        this.segmentos.Cambia(i, true); } else {
        this.segmentos.Cambia(i, false);
      }
    }
    this.paso = 0;
    this.actual = 0;
    this.radio = -1.0D;

    boolean i5 = true;
    i2 = this.puntos.Numero();
    i3 = this.segmentos.Numero();
    int i = 1;
    while ((i <= i2) && (i5 != false)) {
      j = 1;
      while ((j <= i2) && (i5 != false)) {
        if ((i != j) && (!this.segmentos.Existe(i, j))) {
          k = 1;
          i5 = false;
          while ((k <= i3) && (i5 == false)) {
            if (Corta(i, j, this.segmentos.ExtremoA(k), this.segmentos.ExtremoB(k)))
              i5 = true;
            else k++;
          }
        }
        j++;
      }
      i++;
    }

    return i5;
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

  private boolean Vacio(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = PuntoComun(paramInt1, paramInt2);
    int j = PuntoComun(paramInt1, paramInt3);
    int k = PuntoComun(paramInt2, paramInt3);
    int m = this.puntos.X(i); int n = this.puntos.Y(i);
    int i1 = this.puntos.X(j); int i2 = this.puntos.Y(j);
    int i3 = this.puntos.X(k); int i4 = this.puntos.Y(k);

    int i7 = 1;
    boolean i10 = true;
    int i8 = this.puntos.Numero();
    while ((i7 <= i8) && (i10 != false)) {
      if ((i7 != i) && (i7 != j) && (i7 != k)) {
        int i5 = this.puntos.X(i7); int i6 = this.puntos.Y(i7);

        if (m * i2 + i1 * i4 + i3 * n - i2 * i3 - i4 * m - n * i1 < 0) {
          int i9 = m; m = i1; i1 = i9;
          i9 = n; n = i2; i2 = i9;
        }

        if ((m * i2 + i1 * i6 + i5 * n - i2 * i5 - i6 * m - n * i1 > 0) && 
          (m * i6 + i5 * i4 + i3 * n - i6 * i3 - i4 * m - n * i5 > 0) && 
          (i5 * i2 + i1 * i4 + i3 * i6 - i2 * i3 - i4 * i5 - i6 * i1 > 0))
          i10 = false;
      }
      i7++;
    }

    return i10;
  }

  public boolean SiguientePaso()
  {
    if (this.cola.Numero() > 0) {
      if (this.paso == 4) this.paso = 0;
      int i = 0;
      switch (this.paso)
      {
      case 0:
        this.actual = this.cola.Elemento(1);
        this.triang1 = 0;
        this.triang2 = 0;
        break;
      case 1:
        i = this.triangulos.Numero();
        this.triang1 = 1;
        while ((this.triang1 <= i) && (!SegmentoEnTriangulo(this.actual, this.triang1)))
          this.triang1 += 1;
        this.triang2 = (this.triang1 + 1);
        break;
      case 2:
      case 3:
        while (true) { this.triang2 += 1;
          if (this.triang2 > i) break; 
          if (!SegmentoEnTriangulo(this.actual, this.triang2))
            continue;
          //break;

          int j = this.segmentos.ExtremoA(this.actual);
          int k = this.segmentos.ExtremoB(this.actual);
          int m = VerticeOpuesto(this.actual, this.triang1);

          double d1 = this.puntos.X(j); double d2 = this.puntos.Y(j);
          double d3 = this.puntos.X(k); double d4 = this.puntos.Y(k);
          double d5 = this.puntos.X(m); double d6 = this.puntos.Y(m);

          double d10 = d1 * d1; double d11 = d2 * d2;
          double d12 = d3 * d3; double d13 = d4 * d4;
          double d14 = d5 * d5; double d15 = d6 * d6;

          double d9 = 2.0D * (d2 * d5 + d4 * d1 - d4 * d5 - d2 * d3 - d6 * d1 + d6 * d3);
          this.centroX = ((d4 * d10 - d6 * d10 - d13 * d2 + d15 * d2 + d12 * d6 + d11 * d4 + d14 * d2 - d15 * d4 - d14 * d4 - d12 * d2 + d13 * d6 - d11 * d6) / d9);
          this.centroY = ((d10 * d5 + d11 * d5 + d12 * d1 - d12 * d5 + d13 * d1 - d13 * d5 - d10 * d3 - d11 * d3 - d14 * d1 + d14 * d3 - d15 * d1 + d15 * d3) / d9);
          this.radio = Math.sqrt((d1 - this.centroX) * (d1 - this.centroX) + (d2 - this.centroY) * (d2 - this.centroY));

          //break;

          j = this.segmentos.ExtremoA(this.actual);
          k = this.segmentos.ExtremoB(this.actual);
          m = VerticeOpuesto(this.actual, this.triang1);
          int n = VerticeOpuesto(this.actual, this.triang2);

          double d7 = this.puntos.X(n); double d8 = this.puntos.Y(n);

          if (Math.sqrt((d7 - this.centroX) * (d7 - this.centroX) + (d8 - this.centroY) * (d8 - this.centroY)) < this.radio) {
            this.segmentos.Cambia(this.actual, m, n);
            this.segmentos.Cambia(this.actual, true);
            int i1 = this.segmentos.Indice(j, m);
            int i2 = this.segmentos.Indice(j, n);
            int i3 = this.segmentos.Indice(k, m);
            int i4 = this.segmentos.Indice(k, n);
            this.triangulos.Cambia(this.triang1, this.actual, i1, i2);
            this.triangulos.Cambia(this.triang2, this.actual, i3, i4);
            if ((!this.cola.Existe(i1)) && (this.segmentos.Interior(i1)))
              this.cola.Nuevo(i1);
            if ((!this.cola.Existe(i2)) && (this.segmentos.Interior(i2)))
              this.cola.Nuevo(i2);
            if ((!this.cola.Existe(i3)) && (this.segmentos.Interior(i3)))
              this.cola.Nuevo(i3);
            if ((!this.cola.Existe(i4)) && (this.segmentos.Interior(i4))) {
              this.cola.Nuevo(i4);
            }
          }
          this.radio = -1.0D;
          this.cola.Borra(1);
        }
      }

      this.paso += 1;
      return true;
    }return false;
  }

  private boolean SegmentoEnTriangulo(int paramInt1, int paramInt2)
  {
    return (this.triangulos.LadoA(paramInt2) == paramInt1) || (this.triangulos.LadoB(paramInt2) == paramInt1) || 
      (this.triangulos.LadoC(paramInt2) == paramInt1);
  }

  private int VerticeOpuesto(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (paramInt1 == this.triangulos.LadoA(paramInt2))
      i = PuntoComun(this.triangulos.LadoB(paramInt2), this.triangulos.LadoC(paramInt2));
    if (paramInt1 == this.triangulos.LadoB(paramInt2))
      i = PuntoComun(this.triangulos.LadoA(paramInt2), this.triangulos.LadoC(paramInt2));
    if (paramInt1 == this.triangulos.LadoC(paramInt2)) {
      i = PuntoComun(this.triangulos.LadoA(paramInt2), this.triangulos.LadoB(paramInt2));
    }
    return i;
  }
}