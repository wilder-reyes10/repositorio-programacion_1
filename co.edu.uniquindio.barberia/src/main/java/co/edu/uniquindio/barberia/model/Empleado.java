package co.edu.uniquindio.barberia.model;
import co.edu.uniquindio.barberia.enumeradores.tipoRol;
import co.edu.uniquindio.barberia.enumeradores.tipoCuenta;
public class Empleado {
    private String nombre;
    private int identificacion;
    private int numCelular;
    private tipoRol tipoRol;
    private tipoCuenta tipoCuenta;
    private int numCuenta;

    public Empleado(String nombre, int identificacion, int numCelular, co.edu.uniquindio.barberia.enumeradores.tipoRol tipoRol,
                    co.edu.uniquindio.barberia.enumeradores.tipoCuenta tipoCuenta, int numCuenta) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numCelular = numCelular;
        this.tipoRol = tipoRol;
        this.tipoCuenta = tipoCuenta;
        this.numCuenta = numCuenta;
    }

    /* Getters and Setters*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public int getNumCelular() {
        return numCelular;
    }
    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }
    public co.edu.uniquindio.barberia.enumeradores.tipoRol getTipoRol() {
        return tipoRol;
    }
    public void setTipoRol(co.edu.uniquindio.barberia.enumeradores.tipoRol tipoRol) {
        this.tipoRol = tipoRol;
    }
    public co.edu.uniquindio.barberia.enumeradores.tipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(co.edu.uniquindio.barberia.enumeradores.tipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
}