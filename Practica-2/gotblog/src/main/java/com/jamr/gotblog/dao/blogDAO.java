
package com.jamr.gotblog.dao;

import java.sql.Connection;
import com.jamr.gotblog.dao.dbconexion.conexion;
import com.jamr.gotblog.model.blog;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class blogDAO {

        private Connection conn;
        public blogDAO(){
            conn = conexion.getConnection();
        }
        
        public void addBlog(blog add){
            try{
                String sql = "INSERT INTO blogs(title, body, autor)"+ "VALUES (?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, add.getTitle());
                ps.setString(2, add.getBody());
                ps.setString(3, add.getAutor());
                ps.executeUpdate();
            
            } catch (SQLException ex) {
                System.out.println("***SQLException***");
                ex.printStackTrace();
            }
        }
        
        
        public void removeBlog(int id_blog){
            try {
                   String sql = "DELETE FROM blogs WHERE id_blog=?";
                   PreparedStatement ps;
                
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, id_blog);
                    ps.executeUpdate();    
                } catch (SQLException ex) {
                    System.out.println("Inserta exception");
                    ex.printStackTrace();
                }
            
        }
    
    
}
