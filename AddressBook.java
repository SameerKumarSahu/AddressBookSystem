package AddressBookService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBook {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbookservice", "root",
					"Sameer@42");
			Statement stm = con.createStatement();
			String QUERY = "SELECT * FROM addressbook";
			ResultSet rs = stm.executeQuery(QUERY);

			// Display values
			while (rs.next()) {
				System.out.print("FirstName: " + rs.getString("FirstName"));
				System.out.print("| LastName: " + rs.getString("LastName"));
				System.out.print("| Address: " + rs.getString("Address"));
				System.out.print("| City: " + rs.getString("City"));
				System.out.print("| State: " + rs.getString("State"));
				System.out.print("| Zip: " + rs.getInt("Zip"));
				System.out.print("| PhoneNumber: " + rs.getString("PhoneNumber"));
				System.out.print("| Email_ID: " + rs.getString("Email_ID"));
				System.out.println("\n-----------------------------------------------------------");
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
