import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into product values (123,'Marker',25)";
		Connection con = null;

		try {
			con = JDBCUtil.getConnection();
			Statement start = con.createStatement();
			start.executeQuery(sql);
			System.out.println("record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
