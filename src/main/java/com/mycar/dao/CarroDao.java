/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.dao;

import com.mycar.modelo.Carro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class CarroDao {
    
    
    public boolean cadastrar (Carro carro) throws SQLException{
        
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
                
        String query = "INSERT INTO Carro (Codigo,Modelo,Placa,Marca,Cor,Ano) values (" +
                "'" +   carro.getCodigo()  + "'," +
                "'" +   carro.getModelo()   + "'," +
                "'" +   carro.getPlaca() + "'," +
                "'" +   carro.getMarca() + "'," +
                "'" +   carro.getCor() + "'," +
                carro.getAno()+ ")";
        
        //INSERT INTO Livro (Titulo,Autor,Editora,quantidade) values ('O Rei','João','Caminho das letras',2)
        //INSERT INTO Livro (Titulo,Autor,Editora,quantidade) values (O Rei,João,Caminho das letras,2)
        
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
    
    public Carro consultar (Carro carro) throws SQLException{
        
        Carro carroRetorno = new Carro();   
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM Carro where codigo = " + carro.getCodigo();
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
              
                carroRetorno.setCodigo(retorno.getInt("codigo"));
                carroRetorno.setModelo(retorno.getString("Modelo"));
                carroRetorno.setPlaca(retorno.getString("Placa"));
                carroRetorno.setMarca(retorno.getString("Marca"));
                carroRetorno.setCor(retorno.getString("Cor"));
                carroRetorno.setAno(retorno.getInt("Ano"));
                carroRetorno.setStatus(retorno.getString("Status"));
                
        }
        
        return carroRetorno;
   
    }
    
    public boolean atualizar (Carro carro) throws SQLException{
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "UPDATE CARRO SET "
                + " Status = " + "'" +   carro.getStatus()  + "'" 
                + " where codigo = " + "'" + carro.getCodigo() + "'";
        
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
    
    public boolean excluir (Carro carro) throws SQLException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "DELETE FROM carro where Codigo = " + carro.getCodigo();
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
    
    public ArrayList<Carro> consultarMarca (Carro carro) throws SQLException{
         ArrayList<Carro> listCarro = new ArrayList<Carro>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM carro where marca like '" + carro.getMarca() + "%'";
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
                Carro carroRetorno = new Carro();     
                carroRetorno.setCodigo(retorno.getInt("codigo"));
                carroRetorno.setModelo(retorno.getString("modelo"));
                carroRetorno.setPlaca(retorno.getString("placa"));
                carroRetorno.setMarca(retorno.getString("marca"));
                carroRetorno.setCor(retorno.getString("cor"));
                carroRetorno.setAno(retorno.getInt("ano"));
                carroRetorno.setStatus(retorno.getString("status"));
                listCarro.add(carroRetorno);
        }
        
        return listCarro;
    }
    
}
