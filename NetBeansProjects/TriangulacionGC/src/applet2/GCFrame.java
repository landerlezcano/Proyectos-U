package applet2;

import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class GCFrame extends Frame
{
  private GCCanvas canvas;
  private MenuBar menu;
  private Menu accion;
  private MenuItem salir;
  private MenuItem triang;
  private MenuItem limpiar;

  GCFrame(String paramString)
  {
    super(paramString);
    this.menu = new MenuBar();
    setMenuBar(this.menu);
    this.accion = new Menu("Acción");
    this.salir = new MenuItem("Salir");
    this.limpiar = new MenuItem("Nuevo");
    this.triang = new MenuItem("Triangulación");
    this.accion.add(this.limpiar);
    this.accion.add(this.triang);
    this.accion.add(new MenuItem("-"));
    this.accion.add(this.salir);
    this.menu.add(this.accion);
    this.canvas = new GCCanvas();
    add(this.canvas);
  }

  public boolean handleEvent(Event paramEvent) {
    if (paramEvent.id == 201)
    {
      hide();
      dispose();
      return true;
    }
    if ((paramEvent.id == 205) || (paramEvent.id == 204))
    {
      this.canvas.corrupto = true;
      this.canvas.repaint();
    }

    return super.handleEvent(paramEvent);
  }

  public boolean action(Event paramEvent, Object paramObject) {
    if ((paramEvent.target instanceof MenuItem)) {
      if (paramEvent.target == this.salir) {
        hide();
        dispose();
        return true;
      }
      if (paramEvent.target == this.limpiar) {
        this.canvas.Limpia();
        return true;
      }
      if (paramEvent.target == this.triang) {
        this.canvas.Triangulacion();
        return true;
      }
    }

    return true;
  }

  public boolean mouseMove(Event paramEvent, int paramInt1, int paramInt2) {
    if ((paramEvent.target instanceof GCCanvas)) {
      this.canvas.Mueve(paramInt1 - 2, paramInt2 - 40);
    }
    return true;
  }

  public boolean mouseDown(Event paramEvent, int paramInt1, int paramInt2) {
    if ((paramEvent.target instanceof GCCanvas)) {
      this.canvas.NuevoPunto(paramInt1 - 2, paramInt2 - 40);
    }
    return true;
  }
}