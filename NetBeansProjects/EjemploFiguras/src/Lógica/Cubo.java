/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import java.awt.Graphics;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Cubo extends Rectángulo implements Figura3D{

    private float lado;
    
    public Cubo(float lado) {
        super(lado,lado);
        this.lado=lado;
    }
    
    @Override
    public float calcularArea() {
        return 6*super.calcularArea();
    }
    
    @Override
    public float calcularVolumen() {
        return (float) Math.pow(lado,3);
    }

    @Override
    public void dibujar(Graphics g) {
        g.draw3DRect(20, 20, (int)this.lado*10, (int)this.lado*10, true);
        g.fill3DRect(20, 20, (int)this.lado*10, (int)this.lado*10, true);
    }
    
    
    
}
