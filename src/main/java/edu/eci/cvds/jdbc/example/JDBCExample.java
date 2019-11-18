/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class JDBCExample {
    
    public static void main(String args[]){
        try{
            String url="jdbc:postgres://glvzbgwxbgikqg:ceac137fa64cad171a1c55103a1af7af47e8989fb6bbffccb165ff90506d4daf@ec2-174-129-253-27.compute-1.amazonaws.com:5432/daiod6a6dfp838";
            String driver="com.postgresql.jdbc.Driver";
            String user="glvzbgwxbgikqg";
            String pwd="ceac137fa64cad171a1c55103a1af7af47e8989fb6bbffccb165ff90506d4daf";
            
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,user,pwd);
            con.setAutoCommit(false);
            
            List<String> conRecursos = getRecurso(con);
            
            System.out.println("nombre de los recursos---------------------------------------------");
            
            for(String nomRe:conRecursos){
                System.out.println(nomRe);
            }
            
            
            
            
        
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<String> getRecurso(Connection con) throws SQLException{
        List<String> gr = new LinkedList<>();
        PreparedStatement consultarNombresRecursos = null;
        
        String cn = "SELECT nombre FROM recurso;";
        
        try{
            consultarNombresRecursos = con.prepareStatement(cn);
            
            ResultSet nombresRecursos = consultarNombresRecursos.executeQuery();
            
            while(nombresRecursos.next()){
                gr.add(nombresRecursos.getString("nombre"));
            }
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
        
        }finally{
            if(consultarNombresRecursos != null){
                consultarNombresRecursos.close();
            }
        }
        
        
        return gr;
    }
    
}
