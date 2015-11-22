/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.time.LocalTime;
import java.util.ArrayList;
import trabfinaltecnicas.ConfiguracaoParquimetro;

/**
 *
 * @author Mathias
 */
public class TrabFinalTecnicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       /*
         ModuloOperacional mo = new ModuloOperacional();
         System.out.println(mo.ticket());
         for(int i =0;i<10;i++){
         mo.gerarEmissao();
         System.out.println(mo.ticket());
         }
         */

        ConfiguracaoParquimetro conf = new ConfiguracaoParquimetro(
                LocalTime.of(8, 30),
                LocalTime.of(18,30),
                LocalTime.of(0,30),
                LocalTime.of(2,0),
                10,
                0.25);
        
       ArrayList<Double> moedasAceitas = new ArrayList<>();
       moedasAceitas.add(0.01);
       moedasAceitas.add(0.10);
       moedasAceitas.add(0.25);
       moedasAceitas.add(0.50);
       moedasAceitas.add(1.00);

       PagamentoComMoedas pccr = new PagamentoComMoedas(moedasAceitas);
       Parquimetro par = new Parquimetro(conf, 1, pccr);
       par.setTempoAtual(par.getTempoMinimo());
       par.setIncremento(10);
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       par.aumentarTempo();
       
       
       System.out.println(par.emissaoTicket());
      
       
       
        
       
       
             
        
    }

}
