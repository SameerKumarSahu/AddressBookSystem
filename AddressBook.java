package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> contactList = new ArrayList<Contact>();

	public static void addContact() {
		Contact contact = new Contact();

		System.out.println("Enter the First Name : ");
		String firstName = sc.next();
		contact.setFirstName(firstName);

		System.out.println("Enter the Last Name : ");
		String lastName = sc.next();
		contact.setLastName(lastName);

		System.out.println("Enter the Address : ");
		String address = sc.next();
		contact.setAddress(address);

		System.out.println("Enter the City : ");
		String city = sc.next();
		contact.setCity(city);

		System.out.println("Enter the State : ");
		String state = sc.next();
		contact.setState(state);

		System.out.println("Enter the ZIP Code : ");
		long zipCode = sc.nextLong();
		contact.setZip(zipCode);

		System.out.println("Enter the Phone Number : ");
		long phoneNumber = sc.nextLong();
		contact.setPhoneNumber(phoneNumber);

		System.out.println("Enter the E-mail: ");
		String email = sc.next();
		contact.setEmail(email);

		contactList.add(contact);

		for (Contact c : contactList) {
			System.out.println("Contact Details are :-\n" + c.getFirstName() + "\n" + c.getLastName() + "\n "
					+ c.getAddress() + "\n " + c.getCity() + " \n" + c.getState() + " \n" + c.getPhoneNumber() + " \n"
					+ c.getZip() + " \n" + c.getEmail());
		}
	}

	public static void editContact() {
		System.out.println("Enter first name that you want to Edit:");
		String firstName = sc.next();

		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				Contact c = contactList.get(i);
				System.out.print("Enter new First Name: ");
				c.setFirstName(sc.next());
				System.out.print("Enter  new Last Name : ");
				c.setFirstName(sc.next());
				System.out.print("Enter new City : ");
				c.setCity(sc.next());
				System.out.print("Enter new State : ");
				c.setState(sc.next());
				System.out.print("Enter new zip : ");
				c.setZip(sc.nextLong());
				System.out.print("Enter new PhoneNumber: ");
				c.setPhoneNumber(sc.nextLong());
				System.out.print("Enter new Email ID : ");
				c.setEmail(sc.next());
				contactList.set(i, c);
				System.out.println("Edited Successfully!");
			} else if (firstName != (contactList.get(i).getFirstName())) {
				System.out.println("Not Found!");
			}
		}
	}

	public static void deleteContact() {
		System.out.println("Enter first name that you want to Delete:");
		String firstName = sc.next();
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				contactList.remove(i);
				System.out.println("Deleted Successfully !");
				break;
			} else if (firstName != (contactList.get(i).getFirstName())) {
				System.out.println("Not Found!");
			}
		}
	}

}