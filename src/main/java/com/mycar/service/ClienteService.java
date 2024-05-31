/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.service;

import com.mycar.dao.ClienteDao;
import com.mycar.modelo.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ClienteService {
    
    public boolean cadastrar (Cliente cliente) throws SQLException{
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.cadastrar(cliente);
    }
    
    public Cliente consultar (Cliente cliente) throws SQLException{
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.consultar(cliente);
    }
    
    /*
    public boolean atualizar (Cliente cliente) throws SQLException{
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.atualizar(cliente);
    }
    */
    
    public boolean excluir (Cliente cliente) throws SQLException{
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.excluir(cliente);
    }
    
    public ArrayList<Cliente> consultarNome (Cliente cliente) throws SQLException{
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.consultarNome(cliente);
    }
    
}
