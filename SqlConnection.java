
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex1
 */
public class SqlConnection {
    
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdgc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://ALEXPC\\SQLEXPRESS;databaseName=SunLab;integratedSecurity=true";
            Connection connection = DriverManager.getConnection(dburl);
            Statement stat = connection.createStatement();
            String query = "Select * from SunLabCardData";
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(0)+rs.getString(1)+rs.getString(2));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
