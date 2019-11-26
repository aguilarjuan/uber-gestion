package ar.com.uber.app.gestion.service;

import ar.com.uber.app.gestion.response.CalleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UberService {

    private final Logger log = LoggerFactory.getLogger(UberService.class);

    public UberService() {
    }

    public CalleDTO solicitarRuta1(){
        log.info("ingresando a la clase [UberService]");
        CalleDTO ruta1 = new CalleDTO();

        ArrayList<String> callesList = cargarCalle();
        String calle = callesList.get(0);
        ruta1.setNombre(calle);

        ArrayList<String> alturaInicalList = cargarAlturaInicial();
        String alturaInicial = alturaInicalList.get(0);
        ruta1.setAlturaInicial(alturaInicial);

        ArrayList<String> alturaFinalList = cargarAlturaFinal();
        String alturaFinal = alturaFinalList.get(0);
        ruta1.setAlturaFinal(alturaFinal);

        return ruta1;

    }

    public CalleDTO solicitarRuta2(){
        // desarrollar logica
        return null;
    }

    public CalleDTO solicitarRuta3(){
        // desarrollar logica
        return null;
    }

    private ArrayList<String> cargarCalle() {

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("Juan B Justo");
        ListaDeCalles.add("San Martin");
        ListaDeCalles.add("Nogoya");
        return ListaDeCalles;
    }

    private ArrayList<String> cargarAlturaInicial(){

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("1234");
        ListaDeCalles.add("4567");
        ListaDeCalles.add("3345");
        return ListaDeCalles;

    }

    private ArrayList<String> cargarAlturaFinal(){

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("2345");
        ListaDeCalles.add("6456");
        ListaDeCalles.add("8976");
        return ListaDeCalles;

    }

}