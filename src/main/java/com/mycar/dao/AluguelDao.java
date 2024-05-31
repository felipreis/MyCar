/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.dao;

import com.mycar.modelo.Aluguel;
import com.mycar.modelo.Carro;
import com.mycar.service.Util;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felip
 */
public class AluguelDao {
    
    
    public boolean alugarCarro(Aluguel aluguel) throws SQLException{
        
         Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        Util util = new Util();
                
        String query = "INSERT INTO aluguel (Codigo,codCarro,codCliente,dataSaida,dataEntrega,preco,formaPagamento) values (" +
                "'" +   aluguel.getCodigo()  + "'," +
                "'" +   aluguel.getCodCarro()   + "'," +
                "'" +   aluguel.getCodCliente() + "'," +
                "'" +   util.dateToStringUsa(aluguel.getDataSaida()) + "'," +
                "'" +   util.dateToStringUsa(aluguel.getDataEntrega()) + "'," +
                "'" +   aluguel.getPreco() + "'," +
                "'" +   aluguel.getFormaPagamento()+ "')";
        
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
    
    public Aluguel consultarAluguel(Aluguel aluguel) throws SQLException{
        
        return null;
        
    }
    
    public boolean devolverCarro(Aluguel aluguel) throws SQLException{
        
        return false;
        
    }
}
