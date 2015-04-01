/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;

/**
 *
 * @author usuario
 */
public class Seleccion {
    private int team1,team2,numSelec;                //acumuladores por equipo
    
    InOut ob1 = new InOut();

    public Seleccion() {
        team1 = 0;
        team2 = 0;
        numSelec=0;
    }

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    public int getNumSelec() {
        return numSelec;
    }

    public void setNumSelec(int numSelec) {
        this.numSelec = numSelec;
    }
    public void actualizarAcum(int cont, int nuevaCant){        
        if(cont%2 != 0){                                                        //cont almacena int que según su paridad o imparidad                  
            setTeam2(getTeam2()+nuevaCant);                                     //determina si alterna asignación entre equipo 1 y 2         
        }else{                                                                  //nuevaCant recibe el valor a actualizar en el atributo correspondiente
            setTeam1(getTeam1()+nuevaCant);
        }
    }
    
    public int solicitarNumaJugador(){
        int num;
        num=ob1.solicitarNum("\tIngrese un número al azar:");
        return num;
    }
    
    public void inicioSeleccion(){
        int var = 0,aux=0,cont=8,ronda=1;
        ob1.mostrar("¡A continuación inicia la selección de grupos!");
        while(getNumSelec()<8){
            for(int i=0;i<cont;i++){
                var=solicitarNumaJugador();
                if((var>aux) && ((var%3)==0)){
                    aux=var;
                }                
            }
            if((aux%3 ==0)&&(aux != 0)){
                actualizarAcum(cont,aux);
                cont--;
                setNumSelec(getNumSelec()+1);
            }
            mostrarResultados(ronda);
            var=0;                                                              
            aux=0;
            ronda++;
        }
        ob1.mostrar("Finalizó la formación de grupos.");
        mostrarResultados(ronda);
    }

    private void mostrarResultados(int ronda) {
        ob1.mostrar("Resultados de la ronda No."+ronda+":\n"+"Equipo 1: "
                +getTeam1()+"\nEquipo 2: "+getTeam2()+"\nNúmero de jugadores"
                + " asignados: "+getNumSelec());

    }
}
