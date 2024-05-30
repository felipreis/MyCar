/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.service;

import com.mycar.dao.CarroDao;
import com.mycar.modelo.Carro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class CarroService {
    
    public boolean cadastrar (Carro carro) throws SQLException{
        CarroDao carroDao = new CarroDao();
        return carroDao.cadastrar(carro);
    }
    
    public Carro consultar (Carro carro) throws SQLException{
        CarroDao carroDao = new CarroDao();
        return carroDao.consultar(carro);
    }
    
    public boolean atualizar (Carro carro) throws SQLException{
        CarroDao carroDao = new CarroDao();
        return carroDao.atualizar(carro);
    }
    
    public boolean excluir (Carro carro) throws SQLException{
        CarroDao carroDao = new CarroDao();
        return carroDao.excluir(carro);
    }
    
    public ArrayList<Carro> consultarMarca (Carro carro) throws SQLException{
        CarroDao carroDao = new CarroDao();
        return carroDao.consultarMarca(carro);
    }
    
}
