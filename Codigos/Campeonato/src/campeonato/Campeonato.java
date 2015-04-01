
package campeonato;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Entrenador;
import logica.Equipo;
import logica.Jugador;
import logica.Medico;
import logica.Persona;

public class Campeonato {

   public static void main(String[] args) {
        // TODO code application logic here
        
        Equipo Pasto = new Equipo();
        ArrayList <Persona> ListaAux = new ArrayList();
        //LISTA DE EQUIPOS
        ArrayList <Equipo> ListaEquipos = new ArrayList();
        
        Jugador objJugador = new Jugador("Arquero",1,"Juan",523687);
        
        ListaAux.add(objJugador);
        objJugador = new Jugador("MedioCampista",2,"Carlos",111111);
        ListaAux.add(objJugador);
        objJugador = new Jugador("Volante",5,"Leo",222222);
        ListaAux.add(objJugador);
        Entrenador objEntrenador = new Entrenador("Aguila", "Loco Valdez", 5252);
        ListaAux.add(objEntrenador);
        Medico objMedico = new Medico (121212,"Dr. Carriazo",444444);
        ListaAux.add(objMedico);
        
        ListaEquipos.add(Pasto);
        
        Pasto.setListaIntegrantes(ListaAux);
        
        Equipo Nacional = new Equipo();
        ListaAux = new ArrayList();
        ListaAux.add(objJugador);
        objJugador = new Jugador("MedioCampista",2,"Pedro",666666);
        ListaAux.add(objJugador);
        objJugador = new Jugador("Volante",5,"Camilo",4444444);
        ListaAux.add(objJugador);
        objEntrenador = new Entrenador("Chicó", "Carlos Maturana", 2860);
        ListaAux.add(objEntrenador);
        objMedico = new Medico (154978,"Dr. Arias",333333);
        ListaAux.add(objMedico);
        
       Nacional.setListaIntegrantes(ListaAux);
       
       ListaEquipos.add(Pasto);
       ListaEquipos.add(Nacional);
        
        for (int i=0; i<ListaAux.size();i++)
        {
            ListaAux.get(i).getClass();
            
            //JOptionPane.showMessageDialog(null, ListaAux.get(i).getClass());
            if((ListaAux.get(i).getClass()+"").equals("class logica.Jugador"))
                {
                    objJugador = (Jugador)ListaAux.get(i);
                    JOptionPane.showMessageDialog(null, "El Jugador: " + objJugador.getNombre()+ " \n Posición en el Equipo: "+ objJugador.getPosicion()+ "\n Número: "+ objJugador.getNumero());
                }
            
            else if ((ListaAux.get(i).getClass()+"").equals("class logica.Entrenador")) 
                {
                    objEntrenador = (Entrenador)ListaAux.get(i);
                   JOptionPane.showMessageDialog(null, "El Entrenador:  " + objEntrenador.getNombre()+ "\n Liga: "+ objEntrenador.getLiga()); 
                }    
               else
                    {
                        objMedico = (Medico)ListaAux.get(i);
                        JOptionPane.showMessageDialog(null, "El Médico:  " + objMedico.getNombre()+ "\n Tarjeta Profesional: "+ objMedico.getTarjetaProfesional()); 
                    }
        }
        
    }
    
}
