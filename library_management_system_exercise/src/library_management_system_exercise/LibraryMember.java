package library_management_system_exercise;

public class LibraryMember extends Person {
    private int memberID;

    public LibraryMember(String name, String contact, int memberID) {
        super(name, contact);
        this.memberID = memberID;
    }

    public int getMemberID() {
        return memberID;
    }
}

