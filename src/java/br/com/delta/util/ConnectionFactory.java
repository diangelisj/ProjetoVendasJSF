package br.com.delta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 *  @author Reinaldo Jr
 * 
 */
public class ConnectionFactory {
    public static Connection getConnection( ) throws Exception {

        try {
            
            // Mysql
            
         Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/vendas_final","root","");
                        
   // Postegres
   //Class.forName("org.postgresql.Driver");
   //return DriverManager.getConnection("jdbc:postgresql://localhost/orcamento","postgres","alt256");

        } catch (Exception e) {
            throw new Exception(e.getMessage( ));
        }
    }

    public static void closeConnection(Connection conn,
            Statement stmt, ResultSet rs) throws Exception {
        close(conn, stmt, rs);
    }

    public static void closeConnection(Connection conn, Statement stmt)
    throws Exception {
        close(conn, stmt, null);
    }

    public static void closeConnection(Connection conn)
    throws Exception {
        close(conn, null, null);
    }

    private static void close(Connection conn,
            Statement stmt, ResultSet rs)
            throws Exception {
        try {
            if (rs != null) rs.close( );
            if (stmt != null)stmt.close( );
            if (conn != null)conn.close( );
        } catch (Exception e) {
            throw new Exception(e.getMessage( ));
        }
      }
    }