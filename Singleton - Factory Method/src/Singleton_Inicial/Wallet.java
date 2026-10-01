package Singleton_Inicial;

public class Wallet {

    private double saldo;
    public Wallet(){
        this.saldo = 100000;
    }

    public void recargar(double monto) {
        this.saldo += monto;
    }

    public void pagar(double monto) {
        this.saldo -= monto;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
