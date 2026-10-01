package Singleton_Refactorizada;

public class Wallet {

    private static Wallet instancia = new Wallet();

    private double saldo;
    private Wallet(){
        this.saldo = 100000;
    }

    public static Wallet getInstancia(){
        return instancia;
    }

    public void recargar(double monto){
        this.saldo +=monto;
    }

    public void pagar(double monto){
        this.saldo -=monto;
    }

    public double getSaldo(){
        return this.saldo;
    }








}
