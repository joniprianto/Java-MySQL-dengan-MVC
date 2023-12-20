
package Helper;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;


public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("akademikdb");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
                System.out.println("Koneksi berhasil");
            } catch(Exception e){
                System.out.println("Gagal Koneksi");
            }
        } return con;
    }
}
