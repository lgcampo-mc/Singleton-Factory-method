package Factory_Method_Refactorizada;

public class Pago_Efectivo implements PasarelaPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" en efectivo");
    }
}