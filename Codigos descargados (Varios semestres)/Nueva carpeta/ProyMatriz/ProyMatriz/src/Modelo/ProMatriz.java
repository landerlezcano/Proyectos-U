/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;

public class ProMatriz {
    
    private String m[][];
    private int fil;
    private int col;
    InOut o=new InOut();
    
    public ProMatriz(int f, int c){
        m=new String [f][c];
        fil=f;
        col=c;
    }
    
    
    public void  cargarM(){
        for(int i=0; i<fil;i++){
            for(int j=0; j<col;j++){
                   m[i][j]="☺";
              // m[i][j]= o.solicitar("Ingrese dato de la posicion "+ i + j);
                
            }
        }
    }
    
    
    
     public void  mostrarM(){
         String a="";
        for(int i=0; i<fil;i++){
            for(int j=0; j<col;j++){
               a=a+"["+ m[i][j]+"]";             
            }
            a=a+"\n";
        }
        o.mostrar(a);
    }
     
     
      public void  DiagonalM(){
           String a="Los datos de la diagonal son \n";
        for(int i=0; i<fil;i++){
            for(int j=0; j<col;j++){
                if(i==j){
                   a=a+"["+ m[i][j]+"]";   
                
            }
        }
    }
        o.mostrar(a);
      }
    
      
         public void  LetraO(){
           
        for(int i=0; i<fil;i++){
            for(int j=0; j<col;j++){
                if(i==0 || j==0 || i==fil-1 || j==col-1){
                    m[i][j]="☻";   
                
            }
           
            
        }
        
    }
       
      }
    
      
      
}
