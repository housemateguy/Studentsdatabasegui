/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OraclePreparedStatement;
/**
 *
    * @author HOUSSEM CHOUIA
 */
public class Projetbdda {
    
     /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException {

    /**
     *
     */
            // TODO code application logic a
            Login login = new Login();
            login.setVisible(true);
            
           
       /*     Class.forName("oracle.jdbc.driver.OracleDriver");
            
           
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement s = connection.createStatement();
            
           ResultSet rs = s.executeQuery("SELECT * from hr.students");
            
            while(rs.next()) {System.out.println(rs.getString("last_name")); System.out.println(rs.getString("first_name"));
            System.out.println(rs.getString("date_of_birth")); }
      String sql = "insert into students (last_name,first_name,date_of_birth) values(?,?,?)";
        OraclePreparedStatement pst = (OraclePreparedStatement) connection.prepareStatement(sql);
     pst.setString(1,"Houssem");
     pst.setString(2,"Chouia");
     pst.setString(3,"18/01/1998");
     rs = s.executeQuery("SELECT last_name from hr.students");
            
            while(rs.next()) {System.out.println(rs.getString("last_name")); }
    */
    
    }
    
}
