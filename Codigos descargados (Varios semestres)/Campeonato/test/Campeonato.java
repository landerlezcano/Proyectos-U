/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import lógica.Entrenador;
import lógica.Equipo;
import lógica.Jugador;
import lógica.Medico;
import lógica.Persona;

/**
 *
 * @author estudiante
 */
public class Campeonato {
    
    public static void main(String[] args){
        Equipo pasto = new Equipo();
        ArrayList<Persona> listaAux = new ArrayList();
        ArrayList listaEquipos = new ArrayList();
        
        
        Jugador objJugador = new Jugador("Arquero", 1, "Juan", 45642);
        listaAux.add(objJugador);
        objJugador = new Jugador("Medio Campista", 1, "Juan", 45642);
        listaAux.add(objJugador);
        objJugador = new Jugador("Volante", 5, "Leo", 45642);
        listaAux.add(objJugador);
        Entrenador aux1 = new Entrenador("Aguila", "Valdez", 55555);
        listaAux.add(aux1);
        Medico aux2 = new Medico(4654542, "Dr. mate", 22442);
        listaAux.add(aux2);
        pasto.setListaIntegrantes(listaAux);
        listaEquipos.add(pasto);
        
        listaAux.clear();
        Equipo Nacional = new Equipo();
        objJugador = new Jugador("Arquero", 1, "Juan", 45642);
        listaAux.add(objJugador);
        objJugador = new Jugador("Medio Campista", 1, "Juan", 45642);
        listaAux.add(objJugador);
        objJugador = new Jugador("Volante", 5, "Leo", 45642);
        listaAux.add(objJugador);
        aux1 = new Entrenador("Aguila", "Valdez", 55555);
        listaAux.add(aux1);
        aux2 = new Medico(4654542, "Dr. mate", 22442);
        listaAux.add(aux2);
        Nacional.setListaIntegrantes(listaAux);
        
        listaEquipos.add(Nacional);
    
        Iterator foo = listaEquipos.iterator();
        while(foo.hasNext()){
            JOptionPane.showMessageDialog(null, foo.next().toString());
        }
    }
    
}
