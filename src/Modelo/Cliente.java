package Modelo;

public class Cliente
{
    private String nombre;
    private int telefono;
    private String nomRepuesto;

    //Constructor para cargar los datos
    public Cliente(String nombre, int telefono, String nomRepuesto){
        this.nombre=nombre;
        this.telefono=telefono;
        this.nomRepuesto=nomRepuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNomRepuesto() {
        return nomRepuesto;
    }

    public void setNomRepuesto(String nomRepuesto) {
        this.nomRepuesto = nomRepuesto;
    }
}
