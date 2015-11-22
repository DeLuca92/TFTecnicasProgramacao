package trabfinaltecnicas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalTime;

/**
 *
 * @author Mathias
 */
public class ConfiguracaoParquimetro {
    LocalTime inicioTarifacao;
    LocalTime finalTarifacao;
    LocalTime tempoMin;
    LocalTime tempoMax;
    int incremento;
    double tarifaPorIncremento;
    
    public ConfiguracaoParquimetro(LocalTime inicioTarifacao,LocalTime finalTarifacao,LocalTime tempoMin,LocalTime tempoMax,int incremento,double tarifaIncremento ){
        this.inicioTarifacao = inicioTarifacao;
        this.finalTarifacao = finalTarifacao;
        this.tempoMax = tempoMax;
        this.tempoMin = tempoMin;
        this.incremento = incremento;
        this.tarifaPorIncremento = tarifaIncremento;
    }
    /**
     * retorna quando começa a Tarifacao
     * 
     *  
     */
    
  public LocalTime getInicioTarifacao(){
      return inicioTarifacao;
  }
  
      /**
     * retorna quando termina a Tarifacao
     * 
     *  
     */
    
  
  public LocalTime getFinalTarifacao(){
      return finalTarifacao;
  }
  
       /**
     * retorna o tempo minimdo da  Tarifacao
     * 
     *  
     */
  
  public LocalTime getTempoMin(){
      return tempoMin;
  }
  
    /**
     * retorna o tempo maximo da  Tarifacao
     * 
     *  
     */
  
  public LocalTime getTempoMax(){
      return tempoMax;
  }
  
    /**
     * retorna quantos minutos ira aumentar a tarifação aos 
     * inserir uma moeda
     *  
     */
  
  public int getIncremento(){
      return incremento;
  }
  
   /**
     * retorna o preço por  incrmento que  ira aumentando da tarifação  
     * 
     *  
     */
  
  public double tarifaPorIncremento(){
      return tarifaPorIncremento;
  }
  
  
  public void setInicioTarifacao(LocalTime inicioTarifacao){
      this.inicioTarifacao = inicioTarifacao;
  }
  
  public void setFinalTarifacao(LocalTime finalTarifacao ){
      this.finalTarifacao = finalTarifacao;
  }
  
  public void setTempoMin(LocalTime tempoMin){
      this.tempoMin = tempoMin;
  }
  
  public void setTempoMax(LocalTime tempoMax){
      this.tempoMax = tempoMax;
  }
  
  public void setIncremento(int incremento){
      this.incremento = incremento;
  }
  
  public void setTarifaPorIncremento(double tarifaPorIncremento){
      this.tarifaPorIncremento = tarifaPorIncremento;
  }
  
}
