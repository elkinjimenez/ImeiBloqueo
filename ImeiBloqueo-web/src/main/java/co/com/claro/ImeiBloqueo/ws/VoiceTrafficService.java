/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.ImeiBloqueo.ws;


import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author omarMad
 */
@Path("ImeiBloqueo")
@Stateless
@TransactionManagement
public class ImeiBloqueoService {


    public ImeiBloqueoService() {
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("insertar/")
    public void insertar()
            throws JsonProcessingException {

    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("editar")
    public String editar() throws JsonProcessingException {
        String valor = "exitoso";
        return valor;
    }

}
