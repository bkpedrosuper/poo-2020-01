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
class Refrigerador {
    private Ventilador ventilador = new Ventilador();
    private Sensor sensor = new Sensor();
    
    public void imprimirElementos(float atual,float padrao){
        System.out.println("Eu sou o " + Refrigerador.class.getSimpleName() + " e contenho os itens:");
        ventilador.imprimirNome(atual,padrao);
        sensor.imprimirNome(atual,padrao);
    }
}
