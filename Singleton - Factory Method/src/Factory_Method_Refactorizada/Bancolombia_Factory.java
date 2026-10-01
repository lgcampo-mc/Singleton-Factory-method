package Factory_Method_Refactorizada;

public class Bancolombia_Factory extends Pago_Factory{

    @Override
    public PasarelaPago crearPago(){
        return new Pago_Bancolombia();
    }
}
