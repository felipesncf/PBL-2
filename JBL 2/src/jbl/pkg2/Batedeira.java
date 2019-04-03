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
public class Batedeira extends Eletrodomestico implements MediaLitro {
    private int quantHelices;
    private double capacidade;

    
    

    public int getQuantHelices() {
        return quantHelices;
    }
    public void setQuantHelices(int quantHelices) {
        this.quantHelices = quantHelices;
    }
    
    
    
    public double calcDesconto(int mes){
        if(mes==12){
            this.preco *= 0.8;
        }
        return preco;
    }
    
    
    
    public double Litragem(double quant, double capacidade){
        return quant/capacidade*this.quantHelices;
    }
    
    
    public boolean ValidarVoltagem(int voltagem){
        if(voltagem==110 || voltagem==220){
            return true;
        }
        else{
            return false;
        }
    }

   
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
