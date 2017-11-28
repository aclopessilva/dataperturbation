/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataperturbation;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 */
@WebService(serviceName = "dcp")
public class Dcp {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "teste2")
    public String teste2(@WebParam(name = "carrinho") Carrinho carrinho) {
        if(carrinho.getProduto() == null || carrinho.getProduto().isEmpty())
            throw new RuntimeException("Nao possui produtos");
        return "Carrinho OK";
    }
}
