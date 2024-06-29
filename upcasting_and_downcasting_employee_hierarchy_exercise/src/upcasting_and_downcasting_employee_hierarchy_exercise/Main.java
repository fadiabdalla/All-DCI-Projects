package upcasting_and_downcasting_employee_hierarchy_exercise;

public class Main {

	public static void main(String[] args) {

		Employee manager = new Manager("Bob",1001,6500,11);
		Employee engineer = new Engineer("Fadi",1002,3750,"Java");
		Employee intern = new Intern("Mo",1003,900,8);
		
		System.out.println(manager.name + "'s Bonus :" + manager.calculateBonus() + "$");
		System.out.println(engineer.name + "'s Bonus :" + engineer.calculateBonus() + "$");
		System.out.println(intern.name + "'s Bonus :" + intern.calculateBonus() + "$");
		
		
		
		Manager m = (Manager) manager;
		System.out.println(m.name);
        System.out.println("Team Size: " + m.teamSize);
        System.out.println("----------------------------------------");
        
        Engineer e = (Engineer) engineer;
        System.out.println(e.name);
        System.out.println("Programming Language: " + e.programmingLanguage);
        System.out.println("----------------------------------------");
        
        Intern i = (Intern) intern;
        
        System.out.println(i.name);
        System.out.println("Duration (weeks): " + i.durationInWeeks);
        
        
        
        
	}

}
