package Factory_Method_Inicial;

public class Main {
    public static void main(String[] args) {
        String metodoSeleccionado1 = "nequi";
        double monto1 = 100000;
        PasarelaPago pago1 = null;

        if (metodoSeleccionado1.equalsIgnoreCase("tarjeta de credito")) {
            pago1 = new Pago_Tarjeta_Credito();
        }
        else if (metodoSeleccionado1.equalsIgnoreCase("tarjeta de debito")) {
            pago1 = new Pago_Tarjeta_Debito();
        }
        else if (metodoSeleccionado1.equalsIgnoreCase("nequi")) {
            pago1 = new Pago_Nequi();
        }
        else if (metodoSeleccionado1.equalsIgnoreCase("bancolombia")) {
            pago1 = new Pago_Bancolombia();
        }
        else if (metodoSeleccionado1.equalsIgnoreCase("efectivo")) {
            pago1 = new Pago_Efectivo();
        }

        if (pago1 != null) {
            pago1.procesarPago(monto1);
        }
    }
}
