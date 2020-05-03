
/* 
 * Danny Do
 * CS141
 * Assignment 2
 * 4-15-18
 */
import java.util.ArrayList;

public class Student {
	private String studentName;
	private int id;
	private ArrayList<Grade> gradesList;
	
	public void addGrade(Grade grade) {
		if(gradesList == null) {
			gradesList = new ArrayList<Grade>();
		}
		gradesList.add(grade);
	}
	public String toString() {
		String str1 = studentName + " " + id + " ";
		String str2 = " ";
		for(int i= 0; i<gradesList.size(); i++) {
			Grade g1 = gradesList.get(i);
			str2 += g1.toString();
			
		}
		return str1 +str2; 
	}
	

	//constructor for student name and id and array list
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
		}
	
	//setters and getters for student name and id
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}
	public ArrayList<Grade> getGradesList() {
		return gradesList;
	}
}
