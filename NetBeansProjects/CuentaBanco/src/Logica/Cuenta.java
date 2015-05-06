package Logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public abstract class Cuenta implements Impuesto {
    protected long Saldo;
    protected long Interes;
    private long NoCuenta;
    protected Titular titular;
    private Historial history; 
    
    public Cuenta(long Saldo, float Intereses, long NoCuenta, Titular ObjTitular) {
        this.Saldo = Saldo;
        this.Interes = Interes;
        this.NoCuenta = NoCuenta;
        this.titular = titular;
        history = new Historial();
    }

    public Cuenta() {
        Saldo = 0;
        history = new Historial();
    }

    public Cuenta(long Saldo) {
        this.Saldo = Saldo;
    }

    public long getInteres() {
        return Interes;
    }

    public void setInteres(long Interes) {
        this.Interes = Interes;
    }

    public long getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public long getSaldo() {
        return Saldo;
    }

    public void setSaldo(long Saldo) {
        this.Saldo = Saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public static long generarNoCuenta(){
        return (long)(Math.random()*999999);
    }

    public abstract String Retirar(long valorRetirar);
    
    public abstract String Consignar(long valorConsignar);
    
    public abstract long GenerarInteres();

    public Historial getHistory() {
        return history;
    }

    public void setHistory(Historial history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "No. de cuenta: " + NoCuenta+"\nSaldo: " + Saldo + "\nInteres: " 
                + Interes + "\nTitular: " + titular.toString();
    }

    
    
}
