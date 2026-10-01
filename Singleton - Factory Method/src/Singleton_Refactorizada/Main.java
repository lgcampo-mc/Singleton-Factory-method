package Singleton_Refactorizada;

public class Main {
    public static void main(String[] args) {

        Wallet billetera = Wallet.getInstancia();


        Wallet recarga = Wallet.getInstancia();
        recarga.recargar(10000);


        Wallet pagar = Wallet.getInstancia();
        pagar.pagar(50000);


        System.out.println("Saldo: "+ billetera.getSaldo());




    }
}
