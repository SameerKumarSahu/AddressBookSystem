package AddressBookService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBook {

	public static void main(String[] args) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbookservice", "root",
					"Sameer@42");
			Statement stm = con.createStatement();
			//FirstName.LastName,Address,City,State,Zip,PhoneNumber,EmailID
			String sql = "INSERT INTO addressbook VALUES ('Rishi', 'Kumar','HousingBoard', 'Hyderabad','Telengana',400856,'9658741365','rishi456@gmail.com')";
			stm.executeUpdate(sql);
			System.out.println("Contact added successfully...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
