/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import trabfinaltecnicas.Ticket;

/**
 *
 * @author Daniel
 */


public class PagamentoComCartaoResidente  implements  Pagamento {

    CartaoResidente cartaoResidente;

    public PagamentoComCartaoResidente(CartaoResidente cartaoResidente) {
        this.cartaoResidente = cartaoResidente;
    }
    
    
    
    
    
    
    @Override
    public Ticket pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
