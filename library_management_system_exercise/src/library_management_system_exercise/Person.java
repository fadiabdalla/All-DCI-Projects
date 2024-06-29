
package library_management_system_exercise;

public class Person {
    private String name;
    private String contact;  // Changed to String for contact

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }
}
