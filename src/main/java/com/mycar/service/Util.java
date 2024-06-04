/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.service;

import com.google.protobuf.TextFormat.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author felip
 */
public class Util {
    
    
    // adicionar metodo string to date
    
    public Date stringToDate(String dataRecebida) throws ParseException, java.text.ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataRecebida);
        return dataFormatada;
    }
    
    //adicionar metodo calcular preço
    
    public String dateToString(Date dataRecebida){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(dataRecebida);
        return dataFormatada;
    }
    
    public String dateToStringUsa(Date dataRecebida){
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formato.format(dataRecebida);
        return dataFormatada;
    }
    
    public Date stringToDateUsa(String dataRecebida) throws ParseException, java.text.ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date dataFormatada = formato.parse(dataRecebida);
        return dataFormatada;
    }
    
    //Calculo diferenca de dias 
    
    public int diferencaDias( Date dataSaida, Date dataDevolucao){
        
        Calendar calSaida = Calendar.getInstance();
        calSaida.setTime(dataSaida);
        calSaida.set(Calendar.HOUR_OF_DAY,0);
        calSaida.set(Calendar.MINUTE,0);
        calSaida.set(Calendar.SECOND,0);
        calSaida.set(Calendar.MILLISECOND,0);
        
        Calendar calDevolucao = Calendar.getInstance();
        calDevolucao.setTime(dataDevolucao);
        calDevolucao.set(Calendar.HOUR_OF_DAY,0);
        calDevolucao.set(Calendar.MINUTE,0);
        calDevolucao.set(Calendar.SECOND,0);
        calDevolucao.set(Calendar.MILLISECOND,0);
        
        long diferencaDias = calDevolucao.getTimeInMillis() - calSaida.getTimeInMillis();
        return (int)diferencaDias/(1000*60*60*24);
        
    }
    
    public double calcularPreco(Date dataSaida, Date dataDevolucao,int ano){
        
        int numeroDias = diferencaDias(dataSaida,dataDevolucao);
        //double numeroDiasDouble = numeroDias;
        double preco;
        
        if(ano >= 2023){
            preco = 100.75*numeroDias;
        }else if( ano < 2023 && ano >= 2018){
            preco = 75.25*numeroDias;
        }else{
            preco = 50.15*numeroDias;
        }
        return preco;
    }
    
}
