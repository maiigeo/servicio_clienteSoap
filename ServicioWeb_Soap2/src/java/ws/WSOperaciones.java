/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        if(usuario.equals("Marilyn") && password.equals("maii")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Saldo")
    public int Saldo(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        //TODO write your implementation code here:
        if(pago>= total){
            return pago-total;
        }else{
            return -1;
        }
    }
}
