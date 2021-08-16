package com.AddressBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

	public static void displayAll() {
		boolean is_Empty = contactList.isEmpty();
		if (is_Empty == true)
			System.out.println("Array List is Empty");
		else
			for (Contact c : contactList) {
				System.out.println("Contact Details are :-\n" + c.getFirstName() + "\n" + c.getLastName() + "\n"
						+ c.getAddress() + "\n" + c.getCity() + " \n" + c.getState() + " \n" + c.getPhoneNumber()
						+ " \n" + c.getZip() + " \n" + c.getEmail());
			}
	}

	public static boolean checkDuplicate(String f_name, List<Contact> contact) {
		for (Contact c : contact) {
			if (c.getFirstName().equals(f_name)) {
				return true;
			}
		}
		return false;
	}

	public static void searchByCityOrState(List<Contact> contact) {
		System.out.println("Enter CityName: ");
		String city = sc.next();
		contact.stream().filter(c -> c.getCity().equals(city)).forEach(System.out::println);
	}

	public static void viewPersonByCityOrState(List<Contact> contact) {
		System.out.println("Enter CityName: ");
		String city = sc.next();
		contact.stream().filter(c -> c.getCity().equals(city)).forEach(
				cn -> System.out.println("First Name : " + cn.getFirstName() + "  Last Name : " + cn.getFirstName()));
	}

	public static void countByCity(List<Contact> contact) {

		System.out.println("Enter the name of the city:");
		String city = sc.next();
		Long countNamesByCity = contact.stream().filter(e -> city.equals(e.getCity())).count();
		System.out.println(city + " : " + countNamesByCity);

	}

	public static void countByState(List<Contact> contact) {

		System.out.println("Enter the name of the State:");
		String state = sc.next();
		Long countNamesByState = contact.stream().filter(e -> state.equals(e.getState())).count();
		System.out.println(state + " : " + countNamesByState);
	}

	public static void sortedContactByFirstName(List<Contact> contact) {

		List<Contact> sortedContact = contact.stream().sorted(new compareFirstName()).collect(Collectors.toList());
		System.out.println(sortedContact);
	}

}

class compareFirstName implements Comparator<Contact> {
	@Override
	public int compare(Contact o1, Contact o2) {

		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}