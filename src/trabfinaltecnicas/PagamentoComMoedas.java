/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import trabfinaltecnicas.Ticket;
import java.util.ArrayList;
import trabfinaltecnicas.Pagamento;

/**
 *
 * @author Daniel
 */
public class PagamentoComMoedas implements Pagamento {

    private ArrayList<Double> moedasAceitas;
    private ArrayList<Double> moedasInseridas = new ArrayList<>();
    private double troco = 1000000;

    public PagamentoComMoedas(ArrayList<Double> moedasAceitas) {
        this.moedasAceitas = moedasAceitas;
    }

    public void addMoedasAceitas(double moeda) {
        moedasAceitas.add(moeda);
    }

    public void removeMoedasAceita(double moeda) {
        moedasAceitas.remove(moeda);
    }

    public void inserirMoeda(double moeda) {
        moedasInseridas.add(moeda);
    }

    public int totalMoedasInseridas() {
        return moedasInseridas.size();
    }

    public double totalValorArrecadado() {
        double aux = 0;
        for (int i = 0; i < moedasInseridas.size(); i++) {
            aux += moedasInseridas.get(i);
        }
        return aux;
    }

@Override
        public String toString() {
        return "Pagamento{" + "moedasAceitas=" + moedasAceitas + '}';
    }

    @Override
        public Ticket pagar() {
     Ticket tck = new Ticket(0, 0);
        double aux=0;
        
       for(int i=0;i<moedasInseridas.size();i++){
        
           aux +=    moedasInseridas.get(i);
       }
    return tck;
    }
}
