package static_keyword;

class Student {

	int id;
	String name;
	static String university = "RIT";
	
	 static void change() {
		
		university = "AL";
		
		
	}

	Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	void display() {

		System.out.println(id + " " + name + " " + university);

	}
}

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student (123, "Fadi");
		Student student2 = new Student (101, "Sam");
		Student.university = "UE";
		student1.university = "RIT";
		


		System.out.println(student1);
				student2.display();
				student1.display();
		
		
	}

}
