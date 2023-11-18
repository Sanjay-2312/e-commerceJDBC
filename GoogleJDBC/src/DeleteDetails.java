import java.sql.*;
public class DeleteDetails {
	public static void deleteDetails() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/e_commerce";
		String username = "root";
		String password = "2312";
		String Query = "delete from google where product_ID=4";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception {
		deleteDetails();
	}
}