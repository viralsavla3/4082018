import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {
		String sql = "insert into product values(?,?,?)";
		Connection con = null;

		try {
			con = JDBCUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			stmt.executeUpdate();
			System.out.println("Record inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
