package student_management_system_exersice;

public class GraduateStudent extends Student{
	
	private String researchTopic;

	public String getResearchTopic() {
		return researchTopic;
	}

	public void setResearchTopic(String researchTopic) {
		this.researchTopic = researchTopic;
	}
	
	@Override
    public String toString() {
        return super.toString() + "\nResearch Topic: " + researchTopic;
    }

}
