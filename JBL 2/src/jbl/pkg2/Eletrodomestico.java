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
public abstract class Eletrodomestico {
    protected String marca;
    protected float preco;
    protected int voltagem;
    
    
    
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco=preco;
    }
    
    
    public int getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(int voltagem){
        this.voltagem=voltagem;
    }
    
    
    public abstract double calcDesconto(int mes);
    
    public abstract boolean ValidarVoltagem(int voltagem);
}
