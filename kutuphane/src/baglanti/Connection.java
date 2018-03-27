
package baglanti;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection {

    
 
    private final String url = "jdbc:postgresql://localhost/sinema";
    private final String user = "postgres";
    private final String password = "12345";
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    }

   
    

