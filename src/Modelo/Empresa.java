package Modelo;

import Vista.InOut;

import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    List<Repuesto> repuestos = new ArrayList<>();
    List<Factura> compras = new ArrayList<>();
    InOut obp=new InOut();



    public void registrarRepuestos(){
        int cate, stock;
        double precio;

        cate=obp.solicitarEnteros(
                "Categoría del repuesto:\n" +
                        "1. Motor\n" +
                        "2. Suspensión\n" +
                        "3. Frenos\n" +
                        "Digite su opción:");

        stock=obp.solicitarEnteros("Cantidad de repuestos a comprar:");
        precio=obp.solicitarDouble("Precio del repuesto:");

        repuestos.add(new Repuesto(cate,stock,precio));

        double subtotal,descuento,total,iva=0.19, recaudo = 0;

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


        compras.add(new Factura(subtotal,descuento,total,recaudo));

        String mensajeStockBajo = "Repuestos con menos de cinco productos en stock:\n";
        for (int i=0; i<repuestos.size();i++ ) {
            if (repuestos.get(i).getStock() < 5) {
                mensajeStockBajo += repuestos.get(i).getCategoria() + " - $" + repuestos.get(i).getPrecio() + "\n";
            }
        }

        obp.mensaje(mensajeStockBajo);




    }




    public void mostrarInformacionCompras(){
        for(int i=0; i<compras.size();i++ ){
            obp.mensaje("El total recaudado por la tienda es: $" + compras.get(i).getRecaudo());
        }
    }






    /*
    public int precioTotal(){
       int precio;
       precio=obp.solicitarEnteros("Ingrese el precio del repuesto");

       return precio;
    }

    public void registrarClientes(){
        String nom, nomRe;
        int tel;
        for(int i=0; i<clientes.length; i++){
            nom=obp.solicitarString("Ingrese el nombre del cliente #"+(i+1));
            tel=obp.solicitarEnteros("Ingrese el telefono del cliente #"+(i+1));
            nomRe=obp.solicitarString("Ingrese el repuesto que quiere del cliente #"+(i+1));

            Cliente e=new Cliente(nom,tel, nomRe);

            clientes[i]=e;
        }
    }
    */
}