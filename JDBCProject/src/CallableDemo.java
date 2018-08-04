import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = JDBCUtil.getConnection();
			CallableStatement stmt = con.prepareCall("{call getname(?,?)}");
			stmt.setInt(1, 123);
			stmt.registerOutParameter(2, Types.VARCHAR);
			stmt.execute();
			System.out.println("Name: " + stmt.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
