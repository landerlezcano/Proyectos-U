package Logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class CDT extends Cuenta {

    private int plazo;                          //meses

    public CDT(int plazo, long Saldo, long Interes, long NoCuenta, Titular objTitular) {
        super(Saldo, Interes, NoCuenta, objTitular);
        this.plazo = plazo;
    }

    public CDT() {
        super();
        this.plazo=0;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    @Override
    public String Retirar(long valorRetirar) {
        if (Saldo >= valorRetirar) {
            long aux = this.Saldo;
            this.Saldo -= (valorRetirar + calcularImpuesto(valorRetirar));
            this.Interes += GenerarInteres();
            this.getHistory().añadirTransacción(new Transacción(this.getNoCuenta()
                                    , "Retiro", aux, this.Saldo, valorRetirar));
            
            return ("Retiro Exitoso");
        } else {
            return ("Fondos Insuficientes en su Cuenta");
        }
    }

    public long GenerarInteres() {
        Interes = (((Saldo * 10) / 100) / 12) * getPlazo();
        Saldo = Saldo + Interes;
        return (Interes);
    }

    public long calcularImpuesto(Long monto) {
        return (monto * 4) / 1000;
    }

    @Override
    public String Consignar(long valorConsignar) {
        long aux = this.Saldo;
        Saldo = Saldo + valorConsignar;
        this.Interes += GenerarInteres();
        this.getHistory().añadirTransacción(new Transacción(this.getNoCuenta(), 
                            "Consignación", aux, this.Saldo, valorConsignar));
        
        return ("Consigancion Exitosa");
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo de cuenta: CDT" + "\nMeses de plazo:" + plazo + '.';
    }
    
    

}
