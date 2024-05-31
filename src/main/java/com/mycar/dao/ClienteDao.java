package com.mycar.dao;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import com.mycar.dao.Conexao;
import com.mycar.modelo.Cliente;
import com.mycar.service.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ClienteDao {
    
    public boolean cadastrar (Cliente cliente) throws SQLException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        Util util = new Util();
                
        String query = "INSERT INTO cliente (Nome,dataNascimento,Cpf,Telefone,Email) values (" +
                "'" +   cliente.getNome()  + "'," +
                "'" +   util.dateToStringUsa(cliente.getDataNascimento()) + "'," +
                "'" +   cliente.getCpf() + "'," +
                "'" +   cliente.getTelefone() + "'," +
                "'" +   cliente.getEmail()+ "')";
        
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            conexao.desconectar(connection);
            return true;
        }catch (SQLException ex) {
            System.out.print(ex.initCause(ex));
            return false;
        } 
    }
        
        
  
    
    public Cliente consultar (Cliente cliente) throws SQLException{
        Cliente clienteRetorno = new Cliente();   
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM cliente where codigo = " + cliente.getCodigo();
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
              
                clienteRetorno.setCodigo(retorno.getInt("codigo"));
                clienteRetorno.setNome(retorno.getString("Nome"));
                clienteRetorno.setEmail(retorno.getString("Email"));
                clienteRetorno.setCpf(retorno.getString("Cpf"));
                clienteRetorno.setTelefone(retorno.getInt("Telefone"));
                clienteRetorno.setDataNascimento(retorno.getDate("dataNascimento"));
                
        }
        
        return clienteRetorno;
   
        
        
   
    }
    
    /*
    public boolean atualizar (Cliente cliente) throws SQLException{
        
        return false;
        
    }
    */
    
    public boolean excluir (Cliente cliente) throws SQLException{
        
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "DELETE FROM cliente where Codigo = " + cliente.getCodigo();
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
        }catch (SQLException ex) {
            retorno = true;
        } finally {
            conexao.desconectar(connection);
        }
        
        return retorno;
        
    }
    
    public ArrayList<Cliente> consultarNome(Cliente cliente) throws SQLException{
        ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM cliente where nome like '" + cliente.getNome() + "%'";
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
                Cliente clienteRetorno = new Cliente();     
                clienteRetorno.setCodigo(retorno.getInt("codigo"));
                clienteRetorno.setNome(retorno.getString("nome"));
                clienteRetorno.setDataNascimento(retorno.getDate("dataNascimento"));
                clienteRetorno.setCpf(retorno.getString("Cpf"));
                clienteRetorno.setEmail(retorno.getString("Email"));
                clienteRetorno.setTelefone(retorno.getInt("Telefone"));
                listCliente.add(clienteRetorno);
        }
        
        return listCliente;
    }
    
}

