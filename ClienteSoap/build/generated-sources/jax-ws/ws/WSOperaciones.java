
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSOperaciones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSOperaciones {


    /**
     * 
     * @param total
     * @param pago
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Saldo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Saldo", targetNamespace = "http://ws/", className = "ws.Saldo")
    @ResponseWrapper(localName = "SaldoResponse", targetNamespace = "http://ws/", className = "ws.SaldoResponse")
    @Action(input = "http://ws/WSOperaciones/SaldoRequest", output = "http://ws/WSOperaciones/SaldoResponse")
    public int saldo(
        @WebParam(name = "total", targetNamespace = "")
        int total,
        @WebParam(name = "pago", targetNamespace = "")
        int pago);

    /**
     * 
     * @param password
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://ws/", className = "ws.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://ws/", className = "ws.LoginResponse")
    @Action(input = "http://ws/WSOperaciones/LoginRequest", output = "http://ws/WSOperaciones/LoginResponse")
    public Boolean login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
