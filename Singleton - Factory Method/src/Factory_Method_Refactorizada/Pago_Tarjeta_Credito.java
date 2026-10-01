package Factory_Method_Refactorizada;

public class Pago_Tarjeta_Credito implements PasarelaPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" con tarjeta de credito");
    }
}
