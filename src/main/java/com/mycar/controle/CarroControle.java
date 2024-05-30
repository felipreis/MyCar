/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.controle;

import com.mycar.modelo.Carro;
import com.mycar.service.CarroService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class CarroControle {
    
    public boolean cadastrar (Carro carro) throws SQLException{
        CarroService carroService = new CarroService();
        return carroService.cadastrar(carro);
    }
    
    public Carro consultar (Carro carro) throws SQLException{
        CarroService carroService = new CarroService();
        return carroService.consultar(carro);
    }
    
    public boolean atualizar (Carro carro) throws SQLException{
        CarroService carroService = new CarroService();
        return carroService.atualizar(carro);
    }
    
    public boolean excluir (Carro carro) throws SQLException{
        CarroService carroService = new CarroService();
        return carroService.excluir(carro);
    }
    
    public ArrayList<Carro> consultarMarca (Carro carro) throws SQLException{
        CarroService carroService = new CarroService();
        return carroService.consultarMarca(carro);
    }
    
}
