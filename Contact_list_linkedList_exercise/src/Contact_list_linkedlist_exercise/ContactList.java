package Contact_list_linkedlist_exercise;

import java.util.LinkedList;
import java.util.List;

public class ContactList {

	List<Contact> contactList = new LinkedList<>();

	void addContact(String name, String phoneNumber) {
		Contact newContact = new Contact(name, phoneNumber);
		contactList.add(newContact);
	}

	Contact searchContact(String name) {
		for (Contact contact : contactList) {
			if (contact.name.equalsIgnoreCase(name)) {
				return contact;
			}
		}
		return null;
	}

	
		void displayContacts() {
	        System.out.println("Contact List:");
	        for (int i = 0; i < contactList.size(); i++) {
	            Contact contact = contactList.get(i);
	            System.out.println("Contact " + (i + 1) + ": " + contact.name + " - " + contact.phoneNumber);

			}

		}
	}

