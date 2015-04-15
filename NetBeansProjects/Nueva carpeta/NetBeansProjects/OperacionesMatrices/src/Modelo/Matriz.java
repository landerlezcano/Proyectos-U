/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.Arrays;
import Vista.InOut;
import javax.swing.JOptionPane;
/**
 *
 * @author Yair
 */
public class Matriz {
    final private int array[];
    InOut ob1 = new InOut();
    
    public Matriz(int array) {
        this.array= new int[array];
        cargarMatriz();
    }
    public static Boolean validadDato(int num){
        if(num>0){ 
            return true;
        }
        else{
            return false;
        }
    }
    public float mediana(){
        int tmp[]= Arrays.copyOf(array, array.length);
        Arrays.sort(tmp);
        if(tmp.length%2 == 0){
            return (float)(tmp[(tmp.length/2)-1]+tmp[(tmp.length/2)])/2;
        }else{
            return tmp[(int)(tmp.length/2)+1];
        }
    }
    
    public float promedio(){
        float acum=0;
        for(int cont = 0;cont<array.length;cont++){
            acum=acum+array[cont];
        }
        acum=acum/array.length;
        return acum;
    }
    
    public int maximo(){
        int tmp[]= Arrays.copyOf(array, array.length);
        Arrays.sort(tmp);
        return tmp[tmp.length-1];
    }
    
    public int minimo(){
        int tmp[]= Arrays.copyOf(array, array.length);
        Arrays.sort(tmp);
        return tmp[0];
    }
    
    public String moda(){
        int frecuenciaTemp, frecuenciaModa = 0, moda = -1; 
        String str;
        for (int i=0; i < array.length-1; i++){
            frecuenciaTemp = 1;
            for(int j = i+1 ; j< array.length; j++){
                if(array[i] == array[j])
                    frecuenciaTemp ++;                
            }
            if(frecuenciaTemp > frecuenciaModa){
                frecuenciaModa = frecuenciaTemp;
                moda = array[i];
            }
        }
        if(frecuenciaModa==1){
            return "No hay moda";
        }
        str=moda + " Frecuencia: " + frecuenciaModa+"\n";
        return str;
    }
    
    public String mostrarMatriz(){
        String str = "Vector:\n[ ";
        for(int num=0;num<array.length;num++){
            str=str+array[num]+" ";
        }
        str = str+"]";
        return str;
    }
    
    public void infoGeneral(){
        String str = mostrarMatriz()+"\nMediana: "+mediana()+"\npromedio: "+promedio()
                +"\nMáximo: "+maximo()+"\nMínimo: "+minimo()+"\nModa: "+moda();
        ob1.mostrar(str);
    }
    
    public void ejecutarMenu(){
        String menu = "Menú - Operaciones del vector\n"+"1. Cargar vector\n"
                +"2. Mostrar vector\n"+"3. Mediana del vector\n"
                +"4. Promedio del vector\n"+"5. Máximo del vector\n"
                +"6. Mínimo del vector\n"+"7. Moda del vector\n"+"8. Información"
                + " general del vector\n"+"9. Salir";
        int opc;
        String str;
        opc=ob1.solicitarNum(menu);
        while (true){
            switch(opc){
                case 1:
                    cargarMatriz();
                    ejecutarMenu();
                    break;
                case 2:
                    ob1.mostrar(mostrarMatriz());
                    ejecutarMenu();
                    break;
                case 3:
                    str = mostrarMatriz()+"\nLa mediana del vector es: "+mediana();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 4:
                    str = mostrarMatriz()+"\nEl promedio del vector es: "+promedio();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 5:
                    str = mostrarMatriz()+"\nEl máximo del vector es: "+maximo();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 6:
                    str = mostrarMatriz()+"\nEl mínimo del vector es: "+minimo();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 7:
                    str = mostrarMatriz()+"\nLa moda del vector es: "+moda();
                    ob1.mostrar(str);
                    ejecutarMenu();
                    break;
                case 8:
                    infoGeneral();
                    ejecutarMenu();
                    break;
                case 9:
                    int var;
                    var=ob1.mostrarConfirm("¿Desea salir del programa?");
                    if (var == JOptionPane.NO_OPTION) {
                        ejecutarMenu();
                      } else if (var == JOptionPane.YES_OPTION) {
                        break;
                      } 
                    break;
                default:
                    ejecutarMenu();
                    break;
            }
        
        str="";
        break;
        }
    }

    public void cargarMatriz() {
        int acum;
        ob1.mostrar("A continuación ingrese valores para las "+array.length+
                " posiciones del vector");
        for(int num=0;num<array.length;num++){
            do{
                acum=ob1.solicitarNum("Posición "+num+" del vector:");
            }while(validadDato(acum)==false);
            array[num]=acum;
        }
    }
}
