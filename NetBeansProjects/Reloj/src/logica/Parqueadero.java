/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Usuario
 */
public class Parqueadero {
    public Carro objCarro=new Carro();
    private Tiempo hEntrada=new Tiempo();
    private Tiempo hSalida=new Tiempo();
    
    public Parqueadero() {
    }

    public Parqueadero(Carro objCarro, Tiempo hEntrada,Tiempo hSalida) {
        this.objCarro = objCarro;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
       
    }

    public Carro getObjCarro() {
        return objCarro;
    }

    public Tiempo getHEntrada() {
        return hEntrada;
    }

    public Tiempo getHSalida() {
        return hSalida;
    }
    public void setObjCarro(Carro objCarro) {
        this.objCarro = objCarro;
    }

    public void sethEntrada(Tiempo hEntrada) {
        this.hEntrada = hEntrada;
    }

    public void sethSalida(Tiempo hSalida) {
        this.hSalida = hSalida;
    }
    
    public float tarifaPagar(){
        int h,m,s,tMin;
        float tarifa;
        Tiempo aux=new Tiempo();
        aux=hSalida.restarTiempo(hEntrada);
        h=aux.getH();
        m=aux.getM();
        s=aux.getS();
        tMin=(h*60)+m;
        tarifa=tMin*20;
        
        return tarifa;
    }
    
}
