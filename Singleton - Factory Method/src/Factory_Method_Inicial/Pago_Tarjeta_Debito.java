package Factory_Method_Inicial;


public class Pago_Tarjeta_Debito implements PasarelaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" con tarjeta de debito");
    }
}