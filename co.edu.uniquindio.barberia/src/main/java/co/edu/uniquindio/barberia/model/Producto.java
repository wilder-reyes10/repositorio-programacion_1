package co.edu.uniquindio.barberia.model;

public class Producto {

    private String nombre;
    private int numCodigo;
    private String marca;

    public Producto(String nombre, int numCodigo, String marca) {
        this.nombre = nombre;
        this.numCodigo = numCodigo;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
