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
public class Compressor {

    void imprimirNome(float atual,float padrao) {
        if(atual>padrao){
            System.out.println(Compressor.class.getSimpleName() + " está ligado");
        }
        else{
            System.out.println(Compressor.class.getSimpleName() + " está desligado");
        }
    
}
