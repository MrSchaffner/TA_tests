
public class MVCPatternDemo {

	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Whipporwill");
		
		controller.updateView();
		
	}
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("robert");
		student.setRollNo("11");
		return student;
	}
	
}
