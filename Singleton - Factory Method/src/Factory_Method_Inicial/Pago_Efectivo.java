package Factory_Method_Inicial;


public class Pago_Efectivo implements PasarelaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $"+monto +" en efectivo");
    }
}