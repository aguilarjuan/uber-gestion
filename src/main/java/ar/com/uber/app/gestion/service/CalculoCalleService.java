package ar.com.uber.app.gestion.service;

import ar.com.uber.app.gestion.request.ClientAddressDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculoCalleService {

    private final Logger log = LoggerFactory.getLogger(CalculoCalleService.class);

    @Autowired
    private UberService uberService;

    public CalculoCalleService() {
    }

    public CalleDTO returnStreet(ClientAddressDTO clientAddress) {
        log.info("ingresando a la clase [CalculoCalleService]");

        if ( clientAddress.getLatitudOrigen() < clientAddress.getLatitudDestino() && clientAddress.getLongitudOrigen() > clientAddress.getLongitudDestino() ) {
            CalleDTO calle1 = this.uberService.solicitarRuta1();
            return calle1;
        } else if (clientAddress.getLatitudDestino() > clientAddress.getLongitudOrigen()) {
            //desarrollar logica
            return null;
        } else {
            //desarrollar logica
            return null;
        }
    }

}
