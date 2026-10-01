package Factory_Method_Refactorizada;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Pago_Factory> fabricas = new HashMap<>();

    static {
        fabricas.put("nequi", new Nequi_Factory());
        fabricas.put("tarjeta de credito", new TarjetaCredito_Factory());
        fabricas.put("tarjeta de debito", new TarjetaDebito_Factory());
        fabricas.put("bancolombia", new Bancolombia_Factory());
        fabricas.put("efectivo", new Efectivo_Factory());
    }

    public static void main(String[] args) {

        // Transaccion #1
        String opcion1 = "nequi";
        double monto1 = 120000;
        ejecutarTransaccion(opcion1, monto1);

        // Transaccion #2
        String opcion2 = "bancolombia";
        double monto2 = 1500000;
        ejecutarTransaccion(opcion2, monto2);

        // Transaccion #3
        String opcion3 = "efectivo";
        double monto3 = 600000;
        ejecutarTransaccion(opcion3, monto3);

    }
    private static void ejecutarTransaccion(String metodo, double monto){
        Pago_Factory fabrica = fabricas.get(metodo.trim().toLowerCase());
            if (fabrica != null) {
                fabrica.procesarTransaccion(monto);
            } else {
                System.out.println("Error: El método de pago '" + metodo + "' no está disponible.");
            }
        }
        }


