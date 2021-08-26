/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPO_system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LENOVO
 */
public class mysqlConnection {
    Connection con;
    Statement stmt;
    public mysqlConnection(){
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","ADMIN"); 
    this.stmt=this.con.createStatement();  
    }
    catch(Exception e){System.out.println(e);}
    }
    
    public ResultSet mysqlConnectionQuery(String query){
    try{
    ResultSet rs=stmt.executeQuery(query);  
    return rs; 
    }
    catch(Exception e){System.out.println(e);}
    return null;
    }
    
    public int mysqlConnectionUpdate(String query)
    {
    try{
    this.stmt.executeUpdate(query);
    return 1;
    }
    catch(Exception e){System.out.println(e);}    
    return 0;
    }
    public void closeConn(){
      try {this.con.close();} catch (Exception e){System.out.println(e);}
    }
}
