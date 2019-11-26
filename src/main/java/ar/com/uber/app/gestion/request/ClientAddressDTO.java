package ar.com.uber.app.gestion.request;

import java.io.Serializable;

public class ClientAddressDTO implements Serializable {

    private Long latitudOrigen;
    private Long longitudOrigen;
    private Long latitudDestino;
    private Long longitudDestino;

    public Long getLatitudOrigen() {
        return latitudOrigen;
    }

    public void setLatitudOrigen(Long latitudOrigen) {
        this.latitudOrigen = latitudOrigen;
    }

    public Long getLongitudOrigen() {
        return longitudOrigen;
    }

    public void setLongitudOrigen(Long longitudOrigen) {
        this.longitudOrigen = longitudOrigen;
    }

    public Long getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(Long latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public Long getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(Long longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    @Override
    public String toString() {
        return "ClientAddressDTO{" +
                "latitudOrigen=" + latitudOrigen +
                ", longitudOrigen=" + longitudOrigen +
                ", latitudDestino=" + latitudDestino +
                ", longitudDestino=" + longitudDestino +
                '}';
    }
}
