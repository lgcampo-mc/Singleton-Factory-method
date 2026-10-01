package Factory_Method_Refactorizada;

public class TarjetaDebito_Factory extends Pago_Factory{

    @Override
    public PasarelaPago crearPago(){
        return new Pago_Tarjeta_Debito();
    }
}

