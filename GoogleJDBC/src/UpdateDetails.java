import java.sql.*;
public class UpdateDetails {
	public static void updateDetails() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/e_commerce";
		String username = "root";
		String password = "2312";
		String Query = "update google set product_Name='ChromePad' where product_ID=2";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception {
		updateDetails();
	}
}