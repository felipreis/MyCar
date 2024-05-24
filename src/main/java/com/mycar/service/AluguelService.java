/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.service;

import com.mycar.dao.AluguelDao;
import com.mycar.modelo.Aluguel;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class AluguelService {
    
    public boolean alugarCarro (Aluguel aluguel) throws SQLException{
        AluguelDao aluguelDao = new AluguelDao();
        return aluguelDao.alugarCarro(aluguel);
    }
    
    public Aluguel consultarAlguel (Aluguel aluguel) throws SQLException{
        AluguelDao aluguelDao = new AluguelDao();
        return aluguelDao.consultarAluguel(aluguel);
    }
    
    public boolean devolverCarro (Aluguel aluguel) throws SQLException{
        AluguelDao aluguelDao = new AluguelDao();
        return aluguelDao.devolverCarro(aluguel);
    }
    
}
