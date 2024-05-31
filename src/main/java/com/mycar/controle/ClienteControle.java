/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.controle;

import com.mycar.modelo.Cliente;
import com.mycar.service.ClienteService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ClienteControle {
    
    public boolean cadastrar (Cliente cliente) throws SQLException{
        ClienteService clienteService = new ClienteService();
        return clienteService.cadastrar(cliente);
    }
    
    public Cliente consultar (Cliente cliente) throws SQLException{
        ClienteService clienteService = new ClienteService();
        return clienteService.consultar(cliente);
    }
    
    /*
    public boolean atualizar (Cliente cliente) throws SQLException{
        ClienteService clienteService = new ClienteService();
        return clienteService.atualizar(cliente);
    }
    */
    
    public boolean excluir (Cliente cliente) throws SQLException{
        ClienteService clienteService = new ClienteService();
        return clienteService.excluir(cliente);
    }
    
    public ArrayList<Cliente> consultarNome (Cliente cliente) throws SQLException{
        ClienteService clienteService = new ClienteService();
        return clienteService.consultarNome(cliente);
    }
}
