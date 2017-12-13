package DBHelper;

import java.sql.*;
import inc.WebConfig;

/**
 * Created by cafe5hsang on 12/11/2017.
 */
public class DBHelper {
    private Connection _conn;

    private static DBHelper ourInstance = new DBHelper();

    public static DBHelper getInstance() {
        return ourInstance;
    }

    private DBHelper() {
        _conn = null;

        String url="jdbc:mysql://" + WebConfig.DB_HOST + "/" + WebConfig.DB_NAME;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            _conn = DriverManager.getConnection(url, WebConfig.DB_USERNAME, WebConfig.DB_PASSWORD);
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Error connection " + ex);
        }
    }

    public Connection getDbConnect() {
        return _conn;
    }
}
