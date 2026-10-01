package Factory_Method_Inicial;


public class Pago_Bancolombia implements PasarelaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" con Bancolombia");
    }
}
