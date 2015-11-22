/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import trabfinaltecnicas.Ticket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import trabfinaltecnicas.ConfiguracaoParquimetro;
import trabfinaltecnicas.ModuloOperacional;
import trabfinaltecnicas.Pagamento;
import trabfinaltecnicas.PagamentoComMoedas;

/**
 *
 * @author Mathias
 */
public class Parquimetro {
 private   int hour =0;
 private   LocalTime tempoAtual;
 private   double precoInicial;
 private   int idParquimetro;
 private   int[] moedasAceitas;
 private   int[] moedasDisponiveis;
 private   LocalTime inicioTarifacao;
 private   LocalTime finalTarifacao;
 private   LocalTime tempoMin;
 private   LocalTime tempoMax;
 private   int incremento;
 private   double tarifaPorIncremento;
 private ModuloOperacional modOperacional;
 private   PagamentoComMoedas pgm;
 private HashMap<Integer, Ticket> ids;
 private int IDSerial;
    Pagamento pagamento;

    public Parquimetro(ConfiguracaoParquimetro config, int idParquimetro, Pagamento pagamento) {
        this.inicioTarifacao = config.inicioTarifacao;
        this.finalTarifacao = config.finalTarifacao;
        this.tempoMax = config.tempoMax;
        this.tempoMin = config.tempoMin;
        this.incremento = config.incremento;
        this.tarifaPorIncremento = config.tarifaPorIncremento;
        this.idParquimetro = idParquimetro;
        modOperacional = new ModuloOperacional();
        this.pagamento = pagamento;
        ids = new HashMap<>();
    }

    public void setInicioTarifacao(LocalTime inicioTarifacao) {
        this.inicioTarifacao = inicioTarifacao;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    
    
    
    public void pagamentoMoeda(double valor) {

    }
/**
 * Tempo minimo de permanencia no parquimetro
 * @return 
 */
    public LocalTime getTempoMinimo() {
        return tempoMin.of(0, 30);
    }

    /**
 * Tempo maximo de permanencia no parquimetro
 * @return 
 */
    
    public LocalTime getTempoMaximo() {
        return tempoMax.of(2, 0);

    }

    public int getIDSerial() {
        return IDSerial++;
    }
    
    /**
    * Aumenta o tempo do Ticket em minutos de acorod com o incrimento
    * 
    */
    
    public int aumentarTempoAutal(){
        int aux = tempoAtual.getMinute()+incremento;
     return  aux;
    }
    /**
     * Aumenta o tempo do Ticket no parquimetro de acordo com o os valores
     * Fazer um modo que se chegar a 2:01 de erro
     * se nesse caso quando chegar em 2:00 da erro
     * 
    */
    public void aumentarTempo() throws Exception{
        int aux =aumentarTempoAutal();
     if(tempoAtual!=tempoMax){
        if(aux!=60){
         tempoAtual = tempoAtual.of(hour, aux);
        }else if(aux==60){
            hour++;
            aux=0;
            tempoAtual = tempoAtual.of(hour,aux);
        }
         precoInicial += tarifaPorIncremento;
    }else{
         throw new Exception("Valor Maximo De Hora Atingido");
     }
   }
    /**
     * TempoAtual mudar de nome para horaDaSaida
     * retorna o  horario que o cara ira sair
     * @return 
     */
    public LocalTime getTempoAtual() {
        return tempoAtual;
    }

    public void setTempoAtual(LocalTime tempoAtual) {
        this.tempoAtual = tempoAtual;
    }

    public double getPrecoInicial() {
        return precoInicial;
    }

    public void setPrecoInicial(double precoInicial) {
        this.precoInicial = precoInicial;
    }

    public double getTarifaPorIncremento() {
        return tarifaPorIncremento;
    }

    public void setTarifaPorIncremento(double tarifaPorIncremento) {
        this.tarifaPorIncremento = tarifaPorIncremento;
    }
   
    /**
     * 
     * Retorna as info dos parquimetros do ID X relatorio fazerum forpara pegar todos os numID do parqumetro
    */
     public String gerarRelatorio(int id){
        String aux =ids.get(id).toString();
        return  aux;
 
    } 
    
    public void teste(){
      
    }
    
    
    
    public Ticket emissaoTicket() {
        int aux = getIDSerial();
        Ticket tck = new Ticket(idParquimetro, aux);
        System.out.println(tempoAtual+" autal");
        tck.setMaxTime(tempoAtual);
        tck.setMaxDate(LocalDate.now());
        ids.put(aux, tck);
        return tck;
    }

}
