package Factory_Method_Inicial;


public class Pago_Tarjeta_Credito implements PasarelaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" con tarjeta de credito");
    }
}

