package co.edu.uniquindio.barberia.model;
import co.edu.uniquindio.barberia.enumeradores.tipoCorte;
import co.edu.uniquindio.barberia.enumeradores.tipoCliente;
import co.edu.uniquindio.barberia.enumeradores.metodoPago;

public class Cliente {
    private String nombre;
    private int identificacion;
    private int numCelular;
    private tipoCorte tipoCorte;
    private tipoCliente tipoCliente;
    private metodoPago metodoPago;

    public Cliente(String nombre, int identificacion, int numCelular, co.edu.uniquindio.barberia.enumeradores.tipoCorte tipoCorte,
                   co.edu.uniquindio.barberia.enumeradores.tipoCliente tipoCliente, co.edu.uniquindio.barberia.enumeradores.metodoPago metodoPago) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numCelular = numCelular;
        this.tipoCorte = tipoCorte;
        this.tipoCliente = tipoCliente;
        this.metodoPago = metodoPago;
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
    public co.edu.uniquindio.barberia.enumeradores.tipoCorte getTipoCorte() {
        return tipoCorte;
    }
    public void setTipoCorte(co.edu.uniquindio.barberia.enumeradores.tipoCorte tipoCorte) {
        this.tipoCorte = tipoCorte;
    }
    public co.edu.uniquindio.barberia.enumeradores.tipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(co.edu.uniquindio.barberia.enumeradores.tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public co.edu.uniquindio.barberia.enumeradores.metodoPago getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(co.edu.uniquindio.barberia.enumeradores.metodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}