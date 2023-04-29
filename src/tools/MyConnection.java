/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author famou
 */
public class MyConnection {
     final String URL="jdbc:mysql://localhost:3306/assuransea";
    final String USER="root";
    final String PWD="";
    private Connection cnx;
    private static MyConnection instance;
    
    private MyConnection(){
        try {
            cnx=DriverManager.getConnection(URL, USER, PWD);
            System.out.println("connecter");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MyConnection getInstance(){
        if(instance==null){
            instance=new MyConnection();
        }
        else{
            System.out.println("deja connecté");
        }
        return instance;
    }
    public Connection getCnx(){
        return cnx;
    }
}
