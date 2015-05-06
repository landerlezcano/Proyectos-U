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
public class Rectángulo implements FiguraGeométrica{

    public float base;
    public float altura;

    public Rectángulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawRect(20,20,(int)this.base*10,(int)this.altura*10);

    }
    
}
