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
			// It will count the number of contact from a particular city or state
			String QUERY1 = "select count(City or State) from AddressBook where state = 'Odisha' and city = 'Cuttack'";
			ResultSet rs1 = stm.executeQuery(QUERY1);
			rs1.next();
			int count1 = rs1.getInt(1);
			System.out.println("Number of Contact from selected city or state is " + count1);
			// It will count the number of contacts in the address book
			String QUERY2 = "select count(*) from AddressBook";
			ResultSet rs2 = stm.executeQuery(QUERY2);
			rs2.next();
			int count2 = rs2.getInt(1);
			System.out.println("Number of Contact in the addressbook is " + count2);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
