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
class Congelador {
    private Ventilador ventilador = new Ventilador();
    private Sensor sensor = new Sensor();
    private Compressor compressor = new Compressor();
    
    public void imprimirElementos(){
        System.out.println("Eu sou o " + Congelador.class.getSimpleName() + " e contenho os itens:");

        ventilador.imprimirNome();
        sensor.imprimirNome();
        compressor.imprimirNome();
    }
}
