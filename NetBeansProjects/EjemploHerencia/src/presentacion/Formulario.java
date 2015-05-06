/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import lógica.Cucú;
import lógica.Gato;
import lógica.Perro;

/**
 *
 * @author estudiante
 */
public class Formulario {
    
    public static void main(String Args[]){
        Cucú obj1 = new Cucú();
        Gato obj2 = new Gato();
        Perro obj3 = new Perro();
        obj1.hablar();
        obj2.habla();
        obj3.habla();
        obj1.darHora();
    }
    
}
