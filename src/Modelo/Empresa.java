package Modelo;

import Vista.InOut;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Repuesto> repuestos = new ArrayList<>();
    List<Factura> compras = new ArrayList<>();
    InOut obp = new InOut();

    // Constructor y otros métodos aquí...

    public Repuesto encontrarRepuestoMasVendido() {
        if (repuestos.isEmpty()) {
            return null; // Retorna null si no hay repuestos registrados
        }

        Repuesto masVendido = repuestos.get(0); // Inicializa con el primer repuesto
        for (Repuesto repuesto : repuestos) {
            if (repuesto.getVentas() > masVendido.getVentas()) {
                masVendido = repuesto;
            }
        }
        return masVendido;
    }

    public void mostrarRepuestoMasVendido() {
        Repuesto masVendido = encontrarRepuestoMasVendido();
        if (masVendido == null) {
            obp.mensaje("No hay repuestos registrados.");
        } else {
            obp.mensaje("El repuesto más vendido es:\n" +
                    "Categoría: " + masVendido.getCategoria() + "\n" +
                    "Stock: " + masVendido.getStock() + "\n" +
                    "Precio: $" + masVendido.getPrecio() + "\n" +
                    "Ventas: " + masVendido.getVentas());
        }
    }

    public void registrarRepuestos() {
        int cate, stock;
        double precio;

        cate = obp.solicitarEnteros(
                "Categoría del repuesto:\n" +
                        "1. Motor\n" +
                        "2. Suspensión\n" +
                        "3. Frenos\n" +
                        "Digite su opción:");

        stock = obp.solicitarEnteros("Cantidad de repuestos a comprar:");
        precio = obp.solicitarDouble("Precio del repuesto:");

        if (stock >= 0 && precio >= 0) {
            repuestos.add(new Repuesto(cate, stock, precio));

            double subtotal, descuento, total, iva = 0.19, recaudo = 0;

            subtotal = stock * precio;
            if (subtotal > 5000000) {
                descuento = subtotal * 0.2;
            } else {
                descuento = 0;
            }
            total = subtotal - descuento + subtotal * iva;
            recaudo += total;
            obp.mensaje("Subtotal: $" + subtotal + "\n" +
                    "Descuento: $" + descuento + "\n" +
                    "IVA: $" + subtotal * iva + "\n" +
                    "Total: $" + total);

            compras.add(new Factura(subtotal, descuento, total, recaudo));

            String mensajeStockBajo = "Repuestos con menos de cinco productos en stock:\n";
            for (int i = 0; i < repuestos.size(); i++) {
                if (repuestos.get(i).getStock() < 5) {
                    mensajeStockBajo += repuestos.get(i).getCategoria() + " - $" + repuestos.get(i).getPrecio() + "\n";
                }
            }

            obp.mensaje(mensajeStockBajo);
        } else {
            obp.mensaje("El valor ingresado no es válido. Deben ser números positivos.");
        }
    }

    public void mostrarInformacionCompras() {
        for (int i = 0; i < compras.size(); i++) {
            obp.mensaje("El total recaudado por la tienda es: $" + compras.get(i).getRecaudo());
        }
    }
}
