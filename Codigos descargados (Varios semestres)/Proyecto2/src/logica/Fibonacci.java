/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author estudiante
 */
public class Fibonacci {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public Fibonacci() {
    
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    public String generarSerie(){
        String serie ="";
        int base1=0, base2=1, resultado;
        if (n==1){
            return (" "+base1);
        }else if(n==2){
            return (" "+base1+ "\n"+base2);
        }else{
            serie+="\n"+base1+ "\n"+base2;
            for(int cont = 1; cont<=this.n-2;cont++){
                resultado=base1+base2;
                serie+="\n"+ resultado+ "\n";
                base1=base2;
                base2=resultado;
            }
            return serie;
        }
    }
}
