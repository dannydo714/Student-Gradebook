/* 
 * Danny Do
 * CS141
 * Assignment 2
 * 4-15-18
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	private ArrayList<Student>studentList;
	
	
	//creates a file of fileName and reads the file and prints out the lines
	public void readFile(String filename) {
		// Open the file.
		File file = new File(filename);
		Scanner inputFile;
	
		try {
			inputFile = new Scanner(file);
			while(inputFile.hasNext()) {
				 
				String str = inputFile.nextLine();
				System.out.println(str);
				String[] data = str.split(",");
				String studentName = data[0] + " " + data[1];
				Student s1 = new Student(studentName, Integer.parseInt(data[2]));
				int j;
				for(int i=3;  i<data.length;i+=2) {
					j=i+1;
					Grade grade = new Grade(data[i],Integer.parseInt(data[j]));
					s1.addGrade(grade);
				}
				this.addStudent(s1);

			}
			
			// Close the file.
			inputFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public GradeBook(String filename) {
		readFile(filename);
	}
		
	
	public void addStudent(Student student) {
		if(studentList == null) {
			studentList = new ArrayList<Student>();
		}
		studentList.add(student);		
	}
	
	public void removeStudent(int id) {
		for(int i=0; i<studentList.size(); i++) {
			Student s = studentList.get(i);
			if(s.getId() ==id) {
				studentList.remove(i);
			}
		}	
	}
	
	public String toString() {
		String str = " ";
		for(int i = 0;i<studentList.size();i++) {
			Student s1 = studentList.get(i);
			str += s1.toString();
		}
		return str;
	}
	
	//main method
	public static void main(String[]args) throws IOException{
		//creating an object of Gradebook  to call the method readFile() to scan the file that is passed
		GradeBook test = new GradeBook("src/cs141grades.csv");
		//Student s1 = new Student("Bob", 1252567);
		//Grade g1 = new Grade("Hw 3", 96);
		System.out.println(test);
		test.removeStudent(12827761);
		System.out.println("Gradebook after removing student");
		System.out.println("");// for organization 
		System.out.print(test);
		}
}
