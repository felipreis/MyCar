/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.dao;

import com.mycar.modelo.Carro;
import java.sql.Connection;
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
    
    public ArrayList<Carro> consultar (Carro carro) throws SQLException{
        
   
        return null;
        
   
    }
    
    public boolean atualizar (Carro carro) throws SQLException{
        
        return false;
        
    }
    
    public boolean excluir (Carro carro) throws SQLException{
        
        
        return false;
        
    }
    
}
