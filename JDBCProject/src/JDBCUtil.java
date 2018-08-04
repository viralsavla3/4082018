import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;



public final class JDBCUtil {
	public static Connection getConnection() throws SQLException {
		Properties p = new Properties();
		try {
			p.load(new FileReader("src/Database.info"));
		} catch (Exception e) {
		}

//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String driver = "oracle.jdbc.OracleDriver";

		Connection con = null;

		try {
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		con = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("pass") );
		return con;

	}
}
