/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import trabfinaltecnicas.Cartao;

/**
 *
 * @author Daniel
 */
public class CartaoRecarregavel implements Cartao {

    private double saldo;
    private String codigoCartao;

    public CartaoRecarregavel(double saldo, String codigoCartao) {
        this.saldo = saldo;
        this.codigoCartao = codigoCartao;
    }
/**
 * Retorna o  codigo do cartão
 * 
 *  
 */
    public String getCodigoCartao() {
        return codigoCartao;
    }

    /**
     * Retorna o Ssaldo do cartão
     * 
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Recarrega o cartão
     * 
     * 
     * @param saldo  
     */
    
    public void recarregar(double saldo) {
        this.saldo += saldo;
    }

    /**
     * Desconta o valor do ticket do cartão
     * 
     * 
     * @param saldo 
     */
    
    protected  void descontar(double saldo){
        this.saldo -= saldo;
    }
    
    
    @Override
    public String toString() {
        return "CartaoRecarregavel{" + "saldo=" + saldo + ", codigoCartao=" + codigoCartao + '}';
    }


}
