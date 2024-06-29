package Contact_list_linkedlist_exercise;
public class Main {

	public static void main(String[] args) {

		
		ContactList contactList = new ContactList();

       
        contactList.addContact("John", "123-456-7890");
        contactList.addContact("Jane", "987-654-3210");
        contactList.addContact("Alice", "555-123-4567");

  
        String searchName = "Jane Smith";
        Contact foundContact = contactList.searchContact(searchName);
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact.name + " - " + foundContact.phoneNumber);
        } else {
            System.out.println("Contact not found for " + searchName);
        }

      
        contactList.displayContacts();
    }
}