/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lógica;

import java.awt.Graphics;

/**
 *
 * @author estudiante
 */
public class Círculo implements FiguraGeométrica{
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Círculo(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void dibujar(Graphics g){
        g.drawOval(20,20,(int)this.radio*10,(int)this.radio*10);
    }
    
    @Override
    public float calcularArea() {
        return (float)Math.PI*(float)Math.pow(radio, 2);
    }

}
