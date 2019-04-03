/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbl.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class JBL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int escolhaprinc=10;
        int cadastroFabrica=0;
        int cadastroLoja=0;
        Liquidificador liquidificador2 = new Liquidificador();
        Batedeira batedeira2 = new Batedeira();
        Ferro ferro2 = new Ferro();
        Liquidificador liquidificador1 = new Liquidificador();
        Batedeira batedeira1 = new Batedeira();
        Ferro ferro1 = new Ferro();
        
        while(escolhaprinc!=0){
        
            escolhaprinc=Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar fabrica. \n 2-Cadastrar loja. \n 3-Sou cliente. \n 0-Sair"));
        
            switch(escolhaprinc){
                case 1:
                    if(cadastroFabrica==0){
                        Fabrica fabrica = new Fabrica();
                        cadastroFabrica=10;
                      
                        int voltagem_fabrica_liquidificador=Integer.parseInt(JOptionPane.showInputDialog("Qual a voltagem do liquidificador? 110V ou 220V?"));
                        String marca_fabrica_liquidificador=JOptionPane.showInputDialog("Qual a marca do liquidificador?");
                        liquidificador2.setCapacidade(Double.parseDouble(JOptionPane.showInputDialog("Qual a capacidade do liquidificador?")));
                        liquidificador1.setVoltagem(voltagem_fabrica_liquidificador);
                        liquidificador1.setMarca(marca_fabrica_liquidificador);
                        if(liquidificador1.ValidarVoltagem(voltagem_fabrica_liquidificador)){
                         
                        }
                    else{
                        JOptionPane.showMessageDialog(null, "Essa voltagem nao pode ser fabricada");
                        voltagem_fabrica_liquidificador=0;
                    }
                      
                        int voltagem_fabrica_batedeira=Integer.parseInt(JOptionPane.showInputDialog("Qual a voltagem da batedeira? 110V ou 220V?"));
                        String marca_fabrica_batedeira=JOptionPane.showInputDialog("Qual a marca da batederia?");
                        batedeira2.setCapacidade(Double.parseDouble(JOptionPane.showInputDialog("Qual a capacidade da batedeira?")));
                        batedeira1.setVoltagem(voltagem_fabrica_batedeira);
                        batedeira1.setMarca(marca_fabrica_batedeira);
                        if(batedeira1.ValidarVoltagem(voltagem_fabrica_batedeira)){
                         
                        }
                        else{
                           JOptionPane.showMessageDialog(null, "Essa voltagem nao pode ser fabricada");
                           voltagem_fabrica_batedeira=0;
                        }
                      
                        int voltagem_fabrica_ferro=Integer.parseInt(JOptionPane.showInputDialog("Qual a voltagem do ferro? 5V, 110V ou 220V?"));
                        String marca_fabrica_ferro=JOptionPane.showInputDialog("Qual a marca do ferro?");
                        ferro1.setVoltagem(voltagem_fabrica_ferro);
                        ferro1.setMarca(marca_fabrica_ferro);
                        if(ferro1.ValidarVoltagem(voltagem_fabrica_ferro)){
                         
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Essa voltagem nao pode ser fabricada");
                            voltagem_fabrica_ferro=0;
                        }
                        }
                    
                        else{
                        JOptionPane.showMessageDialog(null, "Ja foi cadastrado a fabrica");
                        }
                        break;
                    case 2:
                        if(cadastroFabrica!=10){
                            JOptionPane.showMessageDialog(null, "Como ainda nao existe uma fabrica, nao existe produto para ser vendido");
                        }
                        else{
                            if(cadastroLoja==0){
                                Loja loja = new Loja();
                                cadastroLoja=10;
                                
                                float preco_loja_liquidificador=Float.parseFloat(JOptionPane.showInputDialog("Qual o preco do liquidificador?"));
                                liquidificador2.setPreco(preco_loja_liquidificador);
                                liquidificador2.setVoltagem(liquidificador1.getVoltagem());
                                liquidificador2.setMarca(liquidificador1.getMarca());
                      
                                float preco_loja_batedeira=Float.parseFloat(JOptionPane.showInputDialog("Qual o preco da batedeira?"));
                                
                                batedeira2.setPreco(preco_loja_batedeira);
                                batedeira2.setVoltagem(batedeira1.getVoltagem());
                                batedeira2.setMarca(batedeira1.getMarca());
                                
                                ferro2.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Qual o preco do ferro?")));
                                ferro2.setVoltagem(ferro1.getVoltagem());
                                ferro2.setMarca(ferro1.getMarca());

                        }
                    
                        else{
                        JOptionPane.showMessageDialog(null, "Ja foi cadastrado a loja");
                        }
                    }
                        break;
                    case 3:
                        if(cadastroFabrica!=10){
                            JOptionPane.showMessageDialog(null, "Senhor cliente, ainda nao existe uma loja, logo, voce nao podera realizar a sua compra");
                        }
                        else{
                            int mes_compra=Integer.parseInt(JOptionPane.showInputDialog("Informe o mes que esta comprando o objeto: "));
                            int opcao=Integer.parseInt(JOptionPane.showInputDialog("Qual eletrodomestico voce deseja comprar? \n 1-Liquidificador. \n 2-Batedeira. \n 3-Ferro"));
                            switch(opcao){
                                case 1:
                                    if(mes_compra==8){
                                        JOptionPane.showMessageDialog(null, "O preco do liquidificador esta com o desconto do mes dos pais. Valor: R$" +liquidificador2.calcDesconto(mes_compra));
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "O preco do liquidificador esta: R$" +liquidificador2.getPreco());  
                                    }
                                    JOptionPane.showMessageDialog(null, "A voltagem do liquidificador eh: " +liquidificador2.getVoltagem());
                                    JOptionPane.showMessageDialog(null, "A marca do liquidificador eh: " +liquidificador2.getMarca());
                                    int quantMinL=Integer.parseInt(JOptionPane.showInputDialog("Qual a litragem que voce vai utilizar?"));
                                    JOptionPane.showMessageDialog(null, "A quantidade media de litro que pode ser batido por segundo nesse liquidificador eh: " +liquidificador2.Litragem(quantMinL, liquidificador2.getCapacidade()));
              
                                    break;
                                 
                                case 2:
                                    batedeira2.setQuantHelices(Integer.parseInt(JOptionPane.showInputDialog("Com quantas helices voce deseja? ")));
                                    if(mes_compra==12){
                                        JOptionPane.showMessageDialog(null, "O preco da batedeira esta com o desconto do natal. Valor: R$" +batedeira2.calcDesconto(mes_compra));
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "O preco da batedeira esta: R$" +batedeira2.getPreco());  
                                    }
                                    JOptionPane.showMessageDialog(null, "A voltagem ds batedeira eh: " +batedeira2.getVoltagem());
                                    JOptionPane.showMessageDialog(null, "A marca ds batedeira eh: " +batedeira2.getMarca()); 
                                    int quantMinB=Integer.parseInt(JOptionPane.showInputDialog("Qual a litragem que voce vai utilizar?"));
                                    JOptionPane.showMessageDialog(null, "A quantidade media de litro que pode ser batido por segundo nessa batedeira com ela toda cheia eh: " +batedeira2.Litragem(quantMinB, batedeira2.getCapacidade()));
                                    break;
           
                                case 3:
                                    if(mes_compra==5){
                                        JOptionPane.showMessageDialog(null, "O preco do ferro esta com o desconto do mes das maes. Valor: R$" +ferro2.calcDesconto(mes_compra));
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "O preco do ferro esta: R$" +ferro2.getPreco());  
                                    }
                                    JOptionPane.showMessageDialog(null, "A voltagem do ferro eh: " +ferro2.getVoltagem());
                                    JOptionPane.showMessageDialog(null, "A marca do ferro eh: " +ferro2.getMarca());
                                    break;
                            }
                        }
                }
            }
        }
        
    }
    

