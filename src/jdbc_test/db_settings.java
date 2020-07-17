//testfile, not important
package jdbc_test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/*this file is just to test the database connection, it has no use on the real project. 
You may ignore this file and use the My_CNX.java file for database settings*/
public class db_settings {
    private Connection conn;
    private Statement statement;
    
    public Connection openConnection()
    {
        if(conn == null)
        {
            String url = "jdbc:mysql://localhost/";
            String dbName = "unimas_palm";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try
            {
                Class.forName(driver);
                this.conn = (Connection)DriverManager.getConnection(url+dbName, userName, password);
                
                System.out.print("Connection Succesful");
            }
            catch (ClassNotFoundException | SQLException sqle)
            {
                System.out.print("Connection Failed");
            }
        }
        return conn;
    }
}
