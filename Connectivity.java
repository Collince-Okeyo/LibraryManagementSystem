import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connectivity {
private static final String USERNAME = "Collince Okeyo";
private static final String PASSWORD = "RamG";
private  static final String CONN = "";

    Connection conn=null;
    Statement stm= null;
    ResultSet rs= null;

public static Connection ConnectDb()
{
    try
    {
        Connection conn = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
        //JOptionPane.showMessageDialog(null,"Connected");
        return conn;
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }


}

}
