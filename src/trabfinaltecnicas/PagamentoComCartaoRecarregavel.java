/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import trabfinaltecnicas.Pagamento;
import trabfinaltecnicas.Ticket;

/**
 *
 * @author Daniel
 */
public class PagamentoComCartaoRecarregavel implements  Pagamento {

    CartaoRecarregavel cartaoRecarregavel;

    public PagamentoComCartaoRecarregavel(CartaoRecarregavel cartaoRecarregavel) {
        this.cartaoRecarregavel = cartaoRecarregavel;
    }

    @Override
    public String toString() {
        return "PagamentoComCartaoRecarregavel{" + "cartaoRecarregavel=" + cartaoRecarregavel + '}';
    }
    
  public void pagar2(double pagar){
     cartaoRecarregavel.descontar(pagar);
    
  }
    
    
    @Override
    public Ticket pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
