package Factory_Method_Refactorizada;

public abstract class Pago_Factory {


    public abstract PasarelaPago crearPago();

    public void procesarTransaccion(double monto){
        PasarelaPago pago = crearPago();
        pago.procesarPago(monto);
    }
}
