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
public class Ferro extends Eletrodomestico{
    
    
    
    
    
    public double calcDesconto(int mes){
        if(mes==5){
            this.preco *= 0.85;
        }
        return preco;
    }
    
    
    public boolean ValidarVoltagem(int voltagem){
        if(voltagem==110 || voltagem==220 || voltagem==5){
            return true;
        }
        else{
            return false;
        }
    }
    
}
