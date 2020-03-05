/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;
import java.util.Scanner;

/**
 *
 * @author udesc
 */
public class Geladeira {
    //Atributos
    Scanner in = new Scanner(System.in);
    float[] temps = new float[3];
    private Congelador congelador;
    private Refrigerador refrigerador;
    public float temp_baixa;
    public float temp_media;
    public float temp_alta;
    public float maior=0;
    public float aux=0;
    public int pos=0;
    public int escolha;
    public float temp_atual;
    public float temp_padrao=25;


    //Metodo construtor.
    public Geladeira() {
        refrigerador = new Refrigerador();
        congelador = new Congelador();
        
    }

    public void imprimirElementos() {
       System.out.println("Sou a Geladeira. Contenho:");
       congelador.imprimirElementos();
       refrigerador.imprimirElementos();
    }
    
    void imprimirElementos(){
        System.out.println("Eu sou a " + Geladeira.class.getSimpleName() + " e possuo os seguintes itens:" );
        congelador.imprimirElementos(temp_atual,temp_padrao);
        refrigerador.imprimirElementos(temp_atual,temp_padrao);
    }
    
    void askInfo(){
        System.out.println("A temperatura padrão é " + temp_padrao);
        System.out.println("Insira três temperaturas, elas serão escolhidas como baixa,média e alta");
        System.out.println("Temperatura 1");
        temps[0] = in.nextFloat();
        System.out.println("Temperatura 2");
        temps[1] = in.nextFloat();
        System.out.println("Temperatura 3:");
        temps[2] = in.nextFloat();
        
        
        for(int i=0;i<3;i++){
            maior=0;
            for(int j=i;j<3;j++){
                if(temps[j]>maior){
                    pos=j;
                    maior = temps[j];
                }
            }
            aux=temps[pos];
            temps[pos]= temps[i];
            temps[i]=aux;
        }
        
        System.out.println("1. Temperatura Alta :" + temps[0]);
        System.out.println("2. Temperatura Média :" + temps[1]);
        System.out.println("3. Temperatura Baixa :" + temps[2]);
        
        System.out.println("Escolha a temperatura:");
        escolha = in.nextInt();
        
        switch(escolha){
            case 1:
                temp_atual=temps[0];
                System.out.println("Você escolheu a temperatura alta " + temp_atual);
                break;
            case 2:
                temp_atual=temps[1];
                System.out.println("Você escolheu a temperatura média " + temp_atual);
                break;
            case 3:
                temp_atual=temps[2];
                System.out.println("Você escolheu a temperatura baixa " + temp_atual);
                break;
            default:
                System.out.println("Digite SOMENTE números entre 1 e 3");
                break;
        }
        
        
    }
    
    
    
}
