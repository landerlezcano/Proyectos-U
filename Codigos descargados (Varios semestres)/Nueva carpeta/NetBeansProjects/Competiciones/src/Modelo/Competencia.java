/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yair
 */
import Vista.InOut;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Competencia {
    
    int numPersonas;
    int numPruebas;
    String nombres[];
    float puntajes[][];
    float promedio[];
    
    
    InOut ob1 = new InOut();
    
    public Competencia(int numPersonas, int numPruebas) {
        this.numPersonas=numPersonas;
        this.numPruebas=numPruebas;
        nombres = new String[numPersonas];
        puntajes = new float[numPruebas][numPersonas];
        promedio = new float[numPersonas]; 
        
    }
    
    public Boolean validarNombre(String str){
        String str1= str.trim().toLowerCase().replace(" ", "");
        int cont=0;
        for(int acum=0;acum<str1.length();acum++){
            if(str1.charAt(acum)<97 || str1.charAt(acum)>122){
                cont++;
            }
        }
        if(cont==0){
            return true;
        }else{
            ob1.mostrar("¡Error! Ingrese un nombre válido");
            return false;
        }
    }
    
    public static Boolean validarDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public void cargarPuntajes(){
        for(int i=0;i<numPruebas;i++){
            ob1.mostrar("Prueba num. "+(i+1)+":");
            for(int j=0;j<numPersonas;j++){
                puntajes[i][j]=ob1.solicitarNum("Ingrese puntaje para participante"
                        + " num. "+(j+1)+"("+nombres[j]+"):");
                while(validarDato((int)puntajes[i][j])==false){
                    ob1.mostrar("¡ERROR!\nIngrese un puntaje válido:");
                    puntajes[i][j]=ob1.solicitarNum("Ingrese puntaje para participante"
                    + " num. "+(j+1)+"("+nombres[j]+"):");
                }
            }
        }
    }
    
    public void cargarNombres(){
        for(int i=0;i<nombres.length;i++){
            nombres[i]=ob1.solicitarStr("Ingrese nombre del participante num. "+(i+1)+":");
            while(validarNombre(nombres[i])==false){
                ob1.mostrar("¡ERROR!\nIngrese nombre del participante válido");
                nombres[i]=ob1.solicitarStr("Ingrese nombre del participante num. "+(i+1)+":");
            }
        }
    }
    
    public void cargarDatos() {
        cargarNombres();
        cargarPuntajes();
    }
    
    public void mostrarDatos(){
        String datos = "Tabla de puntajes\t\t\t\t\n\n";
        for(int i=0;i<numPruebas;i++){
            datos=datos+"\t Prueba num. "+(i+1)+":\n";
            for(int j=0;j<numPersonas;j++){
                datos=datos+"\t\tParticipante num. "+(j+1)+":   "+puntajes[i][j]+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, new JTextArea(datos));
    }
    
    public void promediarMatriz(){
        for(int i=0;i<numPersonas;i++){
            for(int j=0;j<numPruebas;j++){
                promedio[i]=promedio[i]+puntajes[j][i];
            }
            promedio[i]=promedio[i]/numPruebas;
        }
    }
    
    public int[] seleccionarGanadores(){
        float total[]=new float[numPersonas];
        int index[]=new int[3];
        
        float aux=0;
        int index1=0;
        for(int i=0;i<numPersonas;i++){
            for(int j=0;j<numPruebas;j++){
                total[i]=total[i]+puntajes[j][i];
            }
            total[i]=total[i]/numPruebas;
        }
        for(int j=0;j<3;j++){
            for(int i=0;i<numPersonas;i++){
                if(total[i]>aux){
                    aux=total[i];
                    index1=i;
                }
            }
            index[j]=index1;
            total[index1]=0;
            aux=0;
        }
        System.out.println("\n"+index[0]+"\n"+index[1]+"\n"+index[2]);
        return index;
    }
    
    public void mostrarSeleccionados(){
        promediarMatriz();
        String str="";
        int ganadores[]=seleccionarGanadores();
        str=str+"Resultados finales:\t\t\t\t\n\n";
        for(int i=0;i<3;i++){
            str=str+" Puesto #"+(i+1)+":\n";
            str=str+"\tNombre: "+nombres[ganadores[i]]+"\n";
            str=str+"\tPuntajes Prueba:\n";
            for(int j=0;j<numPruebas;j++){
                str=str+"\t\tPrueba "+(j+1)+": "+puntajes[j][ganadores[i]]+"\n";
            }
            str=str+"\tPuntaje promedio: "+promedio[ganadores[i]]+"\n";
        }
        JOptionPane.showMessageDialog(null, new JTextArea(str));
    }
    
}
