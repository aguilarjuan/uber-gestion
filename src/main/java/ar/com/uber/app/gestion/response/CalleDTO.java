package ar.com.uber.app.gestion.response;

import java.io.Serializable;

public class CalleDTO implements Serializable {

    private String nombre;
    private String alturaInicial;
    private String alturaFinal;

    public CalleDTO(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlturaInicial() {
        return alturaInicial;
    }

    public void setAlturaInicial(String alturaInicial) {
        this.alturaInicial = alturaInicial;
    }

    public String getAlturaFinal() {
        return alturaFinal;
    }

    public void setAlturaFinal(String alturaFinal) {
        this.alturaFinal = alturaFinal;
    }

    @Override
    public String toString() {
        return "CalleDTO{" +
                "nombre='" + nombre + '\'' +
                ", alturaInicial=" + alturaInicial +
                ", alturaFinal=" + alturaFinal +
                '}';
    }
}
