/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Cilindro extends Círculo implements Figura3D{

    private float altura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Cilindro(float radio,float altura) {
        super(radio);
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return super.calcularArea()*this.altura; 
    }
    
    @Override
    public float calcularVolumen() {
        return (float) (2 * Math.PI * getRadio() * this.altura);
    }

    @Override
    public void dibujar(Graphics g) {
//        Graphics2D graphics2 = (Graphics2D) g;            //Falta~
//        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(100, 100, 240, 160, 10, 10);
//        graphics2.draw(roundedRectangle);
    }
    
    
    
}
