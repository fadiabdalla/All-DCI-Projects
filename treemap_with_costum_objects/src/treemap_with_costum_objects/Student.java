package treemap_with_costum_objects;

public class Student implements Comparable<Student>{
	
	Integer id;
	String name;
	
	public Student(Integer id, String name) {
		
		
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
	}
	
	

}
