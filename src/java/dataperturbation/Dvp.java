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
@WebService(serviceName = "dvp")
public class Dvp {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "teste")
    public String teste(@WebParam(name = "nome") String nome, @WebParam(name = "alunoifsp") boolean alunoifsp, @WebParam(name = "idade") int idade) {
        String result = "Oi, sou " + nome + ", ";
        if(alunoifsp){
            result += "aluno(a) do IFSP, ";
        }
        
        if(idade<0)
            idade = 0;
        
        result +="tenho "+idade+ " ano(s) ";        
        return result;
    }
}
