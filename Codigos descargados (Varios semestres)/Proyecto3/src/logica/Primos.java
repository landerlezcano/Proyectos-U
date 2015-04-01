/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Primos {
    private int num1;
    private int num2;

    public Primos(int n) {
        this.num1 = n;
    }

    public Primos() {
    
    }

    public int getnum1() {
        return num1;
    }

    public void setnum1(int n) {
        this.num1 = n;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    private Boolean esPrimo(int n){
        int a=0,i;
        for(i=1;i<(n+1);i++){  
            if(n%i==0){  
             a++;  
            }  
        }  
        if(a!=2){  
            return false;  
        }else{  
            return true;  
        }  
    }
    
    private ArrayList divisoresNum(int n){
        ArrayList divisores = new  ArrayList(1);
        int a=0,i;
        for(i=1;i<(n+1);i++){  
            if(n%i==0){  
                divisores.add(i);  
            }  
        } 
        return divisores;
    }
    
    public int[] toIntArray(ArrayList i){
        int[] vector = new int[i.size()];
        for(int n=0;n<i.size();n++){
            vector[n]=(int)i.get(n);
        }
        return vector;
    }
    
    public Boolean sonPrimosRelativos(){
        int[] arrayN1 = toIntArray(divisoresNum(this.num1));
        int[] arrayN2 = toIntArray(divisoresNum(this.num2));
        int acum = 0;
        for(int i:arrayN1){
            for(int j:arrayN2){
                if(i != 1 || j!=1){
                    if(i == j){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
}
