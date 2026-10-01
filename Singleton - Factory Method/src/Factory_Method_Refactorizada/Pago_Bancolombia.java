package Factory_Method_Refactorizada;

public class Pago_Bancolombia implements PasarelaPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" con Bancolombia");
    }
}
