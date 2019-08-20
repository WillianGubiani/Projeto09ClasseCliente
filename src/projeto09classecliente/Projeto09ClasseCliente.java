/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author Willian
 */
public class Projeto09ClasseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Um OBJETO c1 do tipo da classe cliente
        //sendo instanciado por meio do operador NEW
        //Que chama o metodo construtor Cliente()
        Cliente c1 = new Cliente("1122", "Willian", "8877-04", "Toledo", "Parana");
        c1.setRG("5566");
        System.out.println(c1.getRG());
    }
    
}
