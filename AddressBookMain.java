package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System...");
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Adding Contact Details" + "\n2.Editing the Contact details"
					+ "\n3.Deleting the Contact details" + "\n4.Press 0 for exit");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				AddressBook.addContact();
				break;
			case 2:
				AddressBook.editContact();
				break;
			case 3:
				AddressBook.deleteContact();
				break;
			default:
				flag = false;
				System.out.println("Thank You");
			}

		}
	}
}
