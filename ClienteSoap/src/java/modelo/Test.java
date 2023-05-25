/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args){
        WSOperaciones_Service service = new WSOperaciones_Service();
        WSOperaciones cliente= service.getWSOperacionesPort();
        System.out.println(cliente.login("Marilyn", "maii"));
        System.out.println(cliente.saldo(1000, 200));
    }
    
}
