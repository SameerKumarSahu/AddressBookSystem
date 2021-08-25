package MySQL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Read_Write_Contact_asCSV {
	public static void main(String args[]) throws IOException {

		FileOutputStream fos = new FileOutputStream("AddressBook.csv");
		PrintWriter pw = new PrintWriter(fos);
		pw.println("FirstName, LastName, Address, City, State, Zip, PhoneNumber, Email");
		pw.println("Sanjaya, Kumar, FirstGate, Brahmapur, Odisha, 760006, 7896541256, sahus5@gmail.com");
		pw.println("Sidhant, Kumar, Gatebazar, Bhubaneswar, Odisha, 760016, 9874563698, sidku518@gmail.com");
		pw.println("Srikant, Kumar, Gandhi Nagar, Cutack, Odisha, 760506, 9698521478, srikant8@gmail.com");
		pw.println("Laxmi, Kumar, Bhaba Nagar, Mohona, Odisha, 760406, 6398547120, laxmi@gmail.com");
		pw.println("Suraj, Kumar, Om Nagar, Gajapati, Odisha, 766506, 7006549870, kumar90@gmail.com");
		pw.println("Vishal, Kumar, Santi Nagar, Brahmapur, Odisha, 760001, 9337503191, vishankumar@gmail.com");
		pw.println("Akshya, Kumar, Dharma Nagar, Brahmapur, Odisha, 768886, 8997505962, akshya567@gmail.com");
		pw.close();
		System.out.println("Writting into CSV file successfully");

		Scanner sc = new Scanner(new File("C:\\Users\\ACER\\eclipse-workspace\\Java JDBC\\AddressBook.csv"));
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.print(sc.next());
		}
		sc.close();

	}

}
