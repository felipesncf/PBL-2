/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbl.pkg2;

/**
 *
 * @author pioca_000
 */
public class Liquidificador extends Eletrodomestico implements MediaLitro {
    private Tampa tampa;
    private double capacidade;
    
   
    
    
    public double calcDesconto(int mes){
        if(mes==8){
            this.preco *= 0.9;
        }
        return preco;
    }
    
    
    public double Litragem(double quant, double capacidade){
        return quant/capacidade;
    }
    
    
    public boolean ValidarVoltagem(int voltagem){
        if(voltagem==110 || voltagem==220){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public Tampa getTampa(){
        return tampa;
    }
    public void setTampa(Tampa tampa){
        this.tampa=tampa;
    }
    
    
    public void pinta(String cor){
        this.tampa.setCor(cor);
    }
    
    
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
}
