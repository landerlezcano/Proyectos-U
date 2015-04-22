package Logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class CuentaAhorro extends Cuenta {

    private String clave;

    public CuentaAhorro(String clave, long Saldo, float Interes, long NoCuenta, Titular objTitular) {
        super(Saldo, Interes, NoCuenta, objTitular);
        this.clave = clave;
    }

    public CuentaAhorro() {
        super();
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean VerificarClave(String claveAux) {
        return (this.clave.trim().equals(claveAux.trim())) ? (true) : (false);
    }

    public long GenerarInteres() {
        Interes = (Saldo * 5) / 100;
        Saldo = Saldo + Interes;
        return (Interes);
    }

    public long calcularImpuesto(Long monto) {
        return (monto * 2) / 1000;
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
        return super.toString();
    }

    
    
}
