package applet1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class GCCanvas extends Canvas
{
  private boolean accion;
  private Delaunay geom;
  public boolean corrupto;
  private int radio;
  private double precision;
  private boolean pulsado;
  private boolean error;
  private String mensaje;
  private Font tipo;
  private int actual;
  private int extX;
  private int extY;
  private int antX;
  private int antY;
  private Color fondo;

  GCCanvas()
  {
    this.fondo = new Color(245, 245, 255);
    this.mensaje = new String("La entrada no es una triangulación");
    this.tipo = new Font("Serif", 0, 22);
    setBackground(this.fondo);
    this.geom = new Delaunay();
    this.radio = 6;
    this.precision = 10.0D;
    this.accion = false;
    this.corrupto = false;
    this.pulsado = false;
    this.error = false;
    this.extX = 0;
    this.extY = 0;
    this.actual = 0;
  }

  public void paint(Graphics paramGraphics) {
    update(paramGraphics);
  }

  public void update(Graphics paramGraphics)
  {
    if (this.corrupto) borra(paramGraphics);
    int j;
    int i;
    if (!this.accion) {
      if (this.pulsado) {
        paramGraphics.setColor(this.fondo);
        paramGraphics.drawLine(this.geom.puntos.X(this.actual), this.geom.puntos.Y(this.actual), 
          this.antX, this.antY);
        paramGraphics.setColor(Color.green);
        paramGraphics.drawLine(this.geom.puntos.X(this.actual), this.geom.puntos.Y(this.actual), 
          this.extX, this.extY);

        paramGraphics.setColor(Color.blue);
        j = this.geom.segmentos.Numero();
        for (i = 1; i <= j; i++) {
          paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(i)), 
            this.geom.puntos.Y(this.geom.segmentos.ExtremoA(i)), 
            this.geom.puntos.X(this.geom.segmentos.ExtremoB(i)), 
            this.geom.puntos.Y(this.geom.segmentos.ExtremoB(i)));
        }

        paramGraphics.setColor(Color.red);
        j = this.geom.puntos.Numero();
        for (i = 1; i <= j; i++) {
          paramGraphics.fillOval(this.geom.puntos.X(i) - this.radio / 2, this.geom.puntos.Y(i) - this.radio / 2, 
            this.radio, this.radio);
        }

        this.antX = this.extX; this.antY = this.extY;
        this.pulsado = false;
      }

      if (this.corrupto) {
        paramGraphics.setColor(Color.blue);
        j = this.geom.segmentos.Numero();
        for (i = 1; i <= j; i++) {
          paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(i)), 
            this.geom.puntos.Y(this.geom.segmentos.ExtremoA(i)), 
            this.geom.puntos.X(this.geom.segmentos.ExtremoB(i)), 
            this.geom.puntos.Y(this.geom.segmentos.ExtremoB(i)));
        }

        paramGraphics.setColor(Color.red);
        j = this.geom.puntos.Numero();
        for (i = 1; i <= j; i++) {
          paramGraphics.fillOval(this.geom.puntos.X(i) - this.radio / 2, this.geom.puntos.Y(i) - this.radio / 2, 
            this.radio, this.radio);
        }
      }

      if (this.error) {
        paramGraphics.setFont(this.tipo);
        paramGraphics.setColor(Color.yellow);
        paramGraphics.fill3DRect(50, 34, 350, 42, true);
        paramGraphics.setColor(Color.blue);
        paramGraphics.drawString(this.mensaje, 70, 66);
        this.error = false;
      }
    }
    else if (this.corrupto) {
      if (this.geom.radio > 0.0D) {
        paramGraphics.setColor(Color.pink);
        paramGraphics.drawOval((int)(this.geom.centroX - this.geom.radio), 
          (int)(this.geom.centroY - this.geom.radio), 
          (int)(2.0D * this.geom.radio), (int)(2.0D * this.geom.radio));
      }
      j = this.geom.segmentos.Numero();
      paramGraphics.setColor(Color.blue);
      for (i = 1; i <= j; i++) {
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(i)), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(i)), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(i)), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(i)));
      }
      j = this.geom.cola.Numero();
      paramGraphics.setColor(Color.gray);
      for (i = 1; i <= j; i++) {
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.cola.Elemento(i))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.cola.Elemento(i))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.cola.Elemento(i))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.cola.Elemento(i))));
      }
      paramGraphics.setColor(Color.green);
      if ((this.geom.triang1 != 0) && (this.geom.triang2 != 0)) {
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoA(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoA(this.geom.triang1))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoA(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoA(this.geom.triang1))));
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoB(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoB(this.geom.triang1))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoB(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoB(this.geom.triang1))));
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoC(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoC(this.geom.triang1))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoC(this.geom.triang1))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoC(this.geom.triang1))));
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoA(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoA(this.geom.triang2))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoA(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoA(this.geom.triang2))));
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoB(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoB(this.geom.triang2))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoB(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoB(this.geom.triang2))));
        paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoC(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.triangulos.LadoC(this.geom.triang2))), 
          this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoC(this.geom.triang2))), 
          this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.triangulos.LadoC(this.geom.triang2))));
      }
      paramGraphics.setColor(Color.red);
      paramGraphics.drawLine(this.geom.puntos.X(this.geom.segmentos.ExtremoA(this.geom.actual)), 
        this.geom.puntos.Y(this.geom.segmentos.ExtremoA(this.geom.actual)), 
        this.geom.puntos.X(this.geom.segmentos.ExtremoB(this.geom.actual)), 
        this.geom.puntos.Y(this.geom.segmentos.ExtremoB(this.geom.actual)));
    }

    this.corrupto = false;
    repaint();
  }

  private void borra(Graphics paramGraphics)
  {
    Dimension localDimension = getSize();
    paramGraphics.setColor(this.fondo);
    paramGraphics.fillRect(0, 0, localDimension.width, localDimension.height);
  }

  public void NuevoPunto(int paramInt1, int paramInt2) {
    if (this.accion) {
      this.accion = false;
    } else {
      this.actual = Apuntado(paramInt1, paramInt2);
      if (this.actual == 0) {
        this.geom.NuevoPunto(paramInt1, paramInt2);
        this.actual = this.geom.puntos.Numero();
      }
    }
    this.corrupto = true;
    repaint();
  }

  public void Arrastra(int paramInt1, int paramInt2) {
    this.antX = this.extX;
    this.antY = this.extY;
    this.extX = paramInt1; this.extY = paramInt2;
    this.pulsado = true;
    repaint();
  }

  public void NuevaArista(int paramInt1, int paramInt2)
  {
    this.pulsado = false;
    this.corrupto = true;
    int i = this.actual;
    this.actual = Apuntado(paramInt1, paramInt2);
    if (this.actual == 0) {
      this.geom.NuevoPunto(paramInt1, paramInt2);
      this.actual = this.geom.puntos.Numero();
      if (!this.geom.NuevoSegmento(i, this.actual)) {
        this.geom.EliminaPunto(this.actual);
        this.actual = i;

        return;
      }

    }
    else
    {
      this.geom.NuevoSegmento(i, this.actual);
    }
  }

  private int Apuntado(int paramInt1, int paramInt2)
  {
    int k = 0;
    int j = this.geom.puntos.Numero();
    double d3 = this.precision;
    for (int i = 1; i <= j; i++) {
      double d1 = this.geom.puntos.X(i);
      double d2 = this.geom.puntos.Y(i);
      double d4 = Math.sqrt((d1 - paramInt1) * (d1 - paramInt1) + (d2 - paramInt2) * (d2 - paramInt2));
      if (d4 < d3) {
        k = i;
        d3 = d4;
      }
    }

    return k;
  }

  public void Flipping() {
    this.actual = 0;
    this.accion = this.geom.IniciaTriangulacion();
    if (this.accion) { Siguiente(); return;
    }
    this.error = true;
    repaint();
  }

  public void Siguiente()
  {
    if (this.accion) {
      this.accion = this.geom.SiguientePaso();
      this.corrupto = true;
      repaint();
    }
  }

  public void Limpia() {
    this.geom.Limpia();
    this.actual = 0;
    this.accion = false;
    this.corrupto = true;
    repaint();
  }
}