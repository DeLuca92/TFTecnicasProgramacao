/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinaltecnicas;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Coc-Dell
 */
public class Ticket {
    
    private int numParquimetro = 0;
    private int numSerial = 0;
    private String nomeParq,enderecoParq;
    private LocalDate  emissaoDate,maxDate;
    private LocalTime  emisaoTime,maxTime;
    private double preco;
  
    /**
     *   Metodo abiaxo usado para gerar o id 
     *  1 = pram sempre %05d
     *  2= o ID
     * String aux = String.format("%05d", i);
     */
    
    public Ticket(int numParquimetro,int numSerial){
        emissaoTime();
        emissaoDate();
        preco();
        this.numParquimetro = numParquimetro;
        this.numSerial = numSerial;
    }
    
    
     public int getNumParquimetro(){
        return numParquimetro;
    }
    
     public int getNumSerial(){
        return numSerial;
    }
   
     /**
      * Data exata que foi emitida o ticket
      * 
      */
     public void emissaoDate(){
           emissaoDate = LocalDate.now();
     }
     /**
      * Hora exara que foi emitido o ticket
      * 
      */
     
     public void emissaoTime(){
         emisaoTime = LocalTime.now();
     }
     
     public void emissaoFinalDate(){
    //   maxTime=  LocalTime.of(10, 25);
         
     }
     
      public void preco(){
          preco = preco;
      }
     
      public void setPreco(double d){
          preco =d;
      }
      /**Time final que o usuraio ira sair
       * 
       * 
       * @param maxTime 
       */
    public void setMaxTime(LocalTime maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * Data final que o usurario ira sair
     * 
     * @param maxDate 
     */
    
    public void setMaxDate(LocalDate maxDate) {
        this.maxDate = maxDate;
    }
      
      
 
      
      //Somente isso deve sair no Ticket infoormação tirada do enunciado
    @Override
    public String toString() {
        return "Ticket de Parquimetro" + "\n"
                +"Numero do Parquimetro: " + numParquimetro + "\n"
                +"Numero Serial: " + numSerial + "\n"
                +"Endereço Parqumetro: " + enderecoParq +"\n"
                +"Data da Emissao: " + emissaoDate  +"\n"
                +"Hora da Emissao: " + emisaoTime+"\n"
                +"Data Maxima: " + maxDate +"\n"
                +"Hora Maxima: " + maxTime +"\n"
                +"*********************";
    }
     
     
    
    
    
}
