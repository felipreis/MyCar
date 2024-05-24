/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.controle;

import com.mycar.modelo.Aluguel;
import com.mycar.service.AluguelService;
import com.mycar.dao.AluguelDao;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class AluguelControle {
    
    public boolean alugarCarro (Aluguel aluguel) throws SQLException{
        AluguelService aluguelService = new AluguelService();
        return aluguelService.alugarCarro(aluguel);
    }
    
    public Aluguel consultarAluguel (Aluguel aluguel) throws SQLException{
        AluguelService aluguelService = new AluguelService();
        return aluguelService.consultarAluguel(aluguel);
    }
    
    public boolean devolverCarro (Aluguel aluguel) throws SQLException{
        AluguelService aluguelService = new AluguelService();
        return aluguelService.devolverCarro(aluguel);
    }
    
}
