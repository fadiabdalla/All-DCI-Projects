package student_management_system_exersice;

public class UndergraduateStudent extends Student{
	
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
    public String toString() {
        return super.toString() + "\nYear of Study: " + year;
    }
	
	
}
