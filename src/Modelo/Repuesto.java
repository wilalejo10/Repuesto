package Modelo;
public class Repuesto
{
    private int categoria;
    private int stock;
    private double precio;

    //Constructor para cargar los datos
    public Repuesto(int categoria, int stock, double precio){
        this.categoria=categoria;
        this.stock=stock;
        this.precio=precio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    //SET ASIGNA
    //GET DEVUELVE
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}