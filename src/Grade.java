/* 
 * Danny Do
 * CS141
 * Assignment 2
 * 4-15-18
 */
public class Grade {
	private String assignmentName;
	private int grade;
	
	public String toString() {
		
		String message = assignmentName + grade;
		return message;
	}
	
	//constructor for assignment name and grade
	public Grade(String assignmentName, int grade) {
		this.assignmentName = assignmentName;
		this.grade = grade;
		}
	//setters and getters for assignment name and grade
	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}	
}
