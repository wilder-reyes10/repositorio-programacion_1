package co.edu.uniquindio.barberia.model;

public class Herramienta {
    private String nombre;
    private int numCodigo;
    private String tipoProducto;
    private double precio;
    private int cantidad;

    public Herramienta(String nombre, int numCodigo, String tipoProducto, double precio, int cantidad) {
        this.nombre = nombre;
        this.numCodigo = numCodigo;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
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

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
