package Singleton_Inicial;

public class Main {
    public static void main(String[] args) {

        Wallet billetera = new Wallet();

        Wallet recarga = new Wallet();
        recarga.recargar(10000);


        Wallet pago = new Wallet();
        pago.pagar(50000);


        System.out.println("Saldo: "+ billetera.getSaldo());



    }
}
