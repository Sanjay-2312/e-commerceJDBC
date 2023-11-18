import java.sql.*;
public class InsertDetails {
	public static void insertDetails() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/e_commerce";
		String username = "root";
		String password = "2312";
		String Query = "insert into google values(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 1);
		pst.setString(2, "Pixel");
		pst.setInt(3, 200);
		pst.setInt(4, 37000);
		pst.executeUpdate();
		pst.setInt(1, 2);
		pst.setString(2, "ChromeBook");
		pst.setInt(3, 100);
		pst.setInt(4, 63000);
		pst.executeUpdate();
		pst.setInt(1, 3);
		pst.setString(2, "Watch");
		pst.setInt(3, 300);
		pst.setInt(4, 13000);
		pst.executeUpdate();
		pst.setInt(1, 4);
		pst.setString(2, "TWS");
		pst.setInt(3, 150);
		pst.setInt(4, 8000);
		pst.executeUpdate();
		con.close();
		}
	public static void main(String[]args) throws Exception {
		insertDetails();
	}
}