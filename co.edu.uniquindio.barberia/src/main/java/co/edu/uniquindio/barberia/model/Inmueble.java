package co.edu.uniquindio.barberia.model;

public class Inmueble {

    private String nombre;
    private int numCodigo;
    private int cantidad;

    public Inmueble(String nombre, int numCodigo, int cantidad) {
        this.nombre = nombre;
        this.numCodigo = numCodigo;
        this.cantidad = cantidad;
    }

    /* Getters and Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCodigo() {
        return numCodigo;
    }

    public void setNumCodigo(int numCodigo) {
        this.numCodigo = numCodigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
