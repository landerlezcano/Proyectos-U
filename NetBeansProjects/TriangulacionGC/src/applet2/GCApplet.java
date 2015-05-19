package applet2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Window;

public class GCApplet extends Applet
{
  private Button start;
  private GCFrame frame;
  private int ancho;
  private int alto;

  public void init()
  {
    this.start = new Button("Triangulación de polígonos");
    //    this.ancho = Integer.parseInt(getParameter("frame width"));
    this.ancho=300;
//    this.alto = Integer.parseInt(getParameter("frame height"));
    this.alto=300;
    setLayout(new FlowLayout(1));
    setBackground(Color.white);
    add(this.start);
  }

  public boolean action(Event paramEvent, Object paramObject)
  {
    if (paramEvent.target == this.start)
    {
      this.frame = new GCFrame("Geometría Computacional, Triangulación de polígonos");

      this.frame.resize(this.ancho, this.alto);
      this.frame.setResizable(false);
      this.frame.show();
    }
    return true;
  }
}