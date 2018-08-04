import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String driver = "oracle.jdbc.OracleDriver";
	
	Connection con = null;
	try {
		
		Class.forName(driver);
		con=DriverManager.getConnection(url,"hr","oracle");
		System.out.println("Connection Successful");
		DatabaseMetaData meta = con.getMetaData();
		System.out.println("DB name: "+ meta.getDatabaseProductName());
		System.out.println("DB ver: "+ meta.getDatabaseProductVersion());
		System.out.println("Driver name: "+ meta.getDriverName());
		System.out.println("Driver ver:"+ meta.getDriverVersion());
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
	
		try {
			if(con !=null)
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
