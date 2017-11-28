/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataperturbation;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 */
@WebService(serviceName = "rcp")
public class Rcp {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usuario, @WebParam(name = "senha") String senha) throws UnsupportedEncodingException {
        
        //tratamento de inputs, convertendo caracteres especiais em representacao hexadecimal 
        usuario = URLEncoder.encode(usuario, "UTF-8");
        senha = URLEncoder.encode(senha, "UTF-8");
        
        
        String sql = "SELECT * FROM USUARIOS WHERE usuario='"+usuario+"' AND senha='"+senha+"'";
        return sql;
    }
}
