package Modelo;
public class Factura
{
    private double subtotal; // Subtotal de la compra
    private double descuento; // Descuento de la compra
    private double total; // Total de la compra
    private double recaudo; // Recaudo total de la tienda

    //Constructor para cargar los datos
    public Factura(double subtotal, double descuento, double total, double recaudo){
        this.subtotal=subtotal;
        this.descuento=descuento;
        this.total=total;
        this.recaudo=recaudo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(double recaudo) {
        this.recaudo = recaudo;
    }
}