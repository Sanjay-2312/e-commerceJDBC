import java.sql.*;
public class GetDetails {
	public static void getDetails() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/e_commerce";
		String username = "root";
		String password = "2312";
		String Query = "select * from google";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(Query);
		while(rs.next()){
			System.out.println("prouct_ID: " + rs.getInt(1));
			System.out.println("product_Name: " + rs.getString(2));
			System.out.println("Quantity: " + rs.getInt(3));
			System.out.println("Price: " + rs.getInt(4));
		}
		con.close();
	}
	public static void main(String[]args) throws Exception {
		getDetails();
	}
}