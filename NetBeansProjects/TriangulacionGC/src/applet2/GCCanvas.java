package applet2;

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
  private boolean movimiento;
  private boolean error;
  private String mensaje;
  private Font tipo;
  private int actual;
  private int antiguo;
  private int extX;
  private int extY;
  private int antX;
  private int antY;
  private Color fondo;

  GCCanvas()
  {
    this.fondo = new Color(245, 245, 255);
    this.tipo = new Font("Serif", 0, 22);
    this.mensaje = new String("La entrada debe estar compuesta de polígonos");

    setBackground(this.fondo);
    this.geom = new Delaunay();
    this.radio = 6;
    this.precision = 10.0D;
    this.accion = false;
    this.corrupto = false;
    this.movimiento = false;
    this.error = false;
    this.extX = 0;
    this.extY = 0;
    this.actual = 0;
    this.antiguo = 0;
  }

  public void paint(Graphics paramGraphics) {
    update(paramGraphics);
  }

  public void update(Graphics paramGraphics)
  {
    if (this.corrupto) borra(paramGraphics);
    int j;
    int i;
    if ((this.movimiento) && (this.antiguo != 0)) {
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

      this.antX = this.extX;
      this.antY = this.extY;
      this.movimiento = false;
    }

    if (this.corrupto) {
      j = this.geom.segmentos.Numero();
      for (i = 1; i <= j; i++) {
        if (this.geom.segmentos.Interior(i))
          paramGraphics.setColor(Color.green);
        else
          paramGraphics.setColor(Color.blue);
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
      paramGraphics.setColor(Color.yellow);
      paramGraphics.fill3DRect(50, 34, 450, 42, true);
      paramGraphics.setFont(this.tipo);
      paramGraphics.setColor(Color.blue);
      paramGraphics.drawString(this.mensaje, 70, 66);
      this.error = false;
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
      Limpia();
    } else {
      this.actual = Apuntado(paramInt1, paramInt2);
      if (this.actual == 0) {
        this.geom.NuevoPunto(paramInt1, paramInt2);
        this.actual = this.geom.puntos.Numero();
        if (this.antiguo != 0)
          this.geom.NuevoSegmento(this.antiguo, this.actual);
        this.antiguo = this.actual;

        this.antX = paramInt1; this.antY = paramInt2;
      }
      else if (this.antiguo != 0) {
        this.geom.NuevoSegmento(this.antiguo, this.actual);
        this.antiguo = 0; } else {
        this.antiguo = this.actual;
      }
    }
    this.corrupto = true;
    repaint();
  }

  public void Mueve(int paramInt1, int paramInt2) {
    this.extX = paramInt1; this.extY = paramInt2;
    this.movimiento = true;
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

  public void Triangulacion() {
    this.accion = this.geom.Triangulacion();
    if (this.accion) {
      this.corrupto = true;
      repaint();

      return;
    }

    this.error = true;
    repaint();
  }

  public void Limpia()
  {
    this.geom.Limpia();
    this.actual = 0;
    this.antiguo = 0;
    this.accion = false;
    this.corrupto = true;
    this.error = false;
    repaint();
  }
}