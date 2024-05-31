/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.service;

import com.google.protobuf.TextFormat.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    
}
