/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;

/**
 *
 * @author udesc
 */
public class Geladeira {
    //Atributos
    private Congelador congelador;
    private Refrigerador refrigerador;

    //Metodo construtor.
    public Geladeira() {
        refrigerador = new Refrigerador();
        congelador = new Congelador();
        
    }
    
    void imprimirElementos(){
        System.out.println("Os elementos do(a) " + Geladeira.class.getSimpleName() + " são:");
        congelador.imprimirElementos();
        refrigerador.imprimirElementos();
    }
    
    
    
}
