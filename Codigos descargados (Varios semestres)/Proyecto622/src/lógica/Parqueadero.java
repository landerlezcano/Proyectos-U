/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author Yair
 */
public class Parqueadero {
    public Carro objCarro = new Carro();
    private Tiempo horaEntrada;
    private Tiempo horaSalida;
    private int valorMin;

    public Parqueadero(Carro objCarro, Tiempo horaEntrada, Tiempo horaSalida, int tarifaPorMin) {
        this.objCarro = objCarro;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorMin = tarifaPorMin;
    }

    public Parqueadero() {
    }

    public Carro getObjCarro() {
        return objCarro;
    }

    public void setObjCarro(Carro objCarro) {
        this.objCarro = objCarro;
    }

    public Tiempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tiempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tiempo getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Tiempo horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getValorMin() {
        return valorMin;
    }

    public void setValorMin(int valorMin) {
        this.valorMin = valorMin;
    }
    
    
    
    public float tarifaPagos(){
        float totalMins, s,m,h;
        Tiempo aux = horaEntrada.restarTiempo(horaSalida);
        s=aux.getS();
        m=aux.getM();
        h=aux.getH();
        totalMins=(s/60)+m+(h*60);
        return totalMins*valorMin;
    }
}
