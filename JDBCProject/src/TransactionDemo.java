import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		Connection con = null;
		String sql1 = "insert into product values(112,'White Board',500)";
		String sql2 = "update product set price=30 where code=123";
		String sql3 = "delete from product where code=121";

		try {
			con = JDBCUtil.getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			stmt.executeBatch();
			con.commit();
			System.out.println("Transaction complete");
		} catch (SQLException e) {
			System.out.println("Transaction failed");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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