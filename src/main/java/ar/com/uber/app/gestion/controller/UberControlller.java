package ar.com.uber.app.gestion.controller;

import ar.com.uber.app.gestion.request.ClientAddressDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import ar.com.uber.app.gestion.service.CalculoCalleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller
 */

@RestController
@RequestMapping("/V1/uber")
public class UberControlller {

    private final Logger log = LoggerFactory.getLogger(UberControlller.class);

    @Autowired
    private CalculoCalleService calculoCalleService;

    @RequestMapping(value = "/SolicitarRuta", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.GET)
    public CalleDTO  calcularCalles(@RequestBody ClientAddressDTO clientAddress) {
        log.info("ingresando a la clase [UberControlller]");
        CalleDTO response = calculoCalleService.returnStreet(clientAddress);
        log.info("se devuelve el Objeto --> " + response.toString());
        return response;
    }

}
