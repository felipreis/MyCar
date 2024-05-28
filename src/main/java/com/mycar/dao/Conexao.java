/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class Conexao {
     private static final String URL = "jdbc:mysql://localhost:3306/mycar";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    
//    public static void main(String[] args) {
//            Conexao conexao = new Conexao();
//            Connection connection = conexao.conectar();
//            conexao.desconectar(connection);
//    }

    

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    
  public Connection conectar() {
    Connection connection = null;
    try {
      connection = Conexao.getConnection();
      System.out.println("Conectou no banco de dados.");
    } catch (SQLException ex) {
      System.out.println("Erro: Não conseguiu conectar no BD.");
    } 

    return connection;
  }

  public void desconectar(Connection conn) {
    try {
      if(conn != null && !conn.isClosed()) {
        conn.close();
        System.out.println("Desconectou do banco de dados.");
      }
    } catch (SQLException ex) {
      System.out.println("Não conseguiu desconectar do BD.");
    }
  }
}
