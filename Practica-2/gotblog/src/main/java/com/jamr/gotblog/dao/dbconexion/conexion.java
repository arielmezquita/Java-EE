
package com.jamr.gotblog.dao.dbconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    private static Connection con = null;
    public static Connection getConnection(){
        if(con !=null) {
                return con;
        }
        else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/blogs";
                    String user = "root";
                    String pass  = "";
                    
                 con = DriverManager.getConnection(url, user, pass);
                    System.out.println("Conexion efectiva");
                
                } catch (ClassNotFoundException cne) {
                    System.out.println("***Driver***");
                    cne.printStackTrace();
                } catch (SQLException e){
                    System.out.println("*******SQLException*******");
                    System.out.println(e);
                }
                return con; 
        }
    }
}
