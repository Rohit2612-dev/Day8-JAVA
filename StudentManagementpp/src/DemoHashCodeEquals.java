import java.util.HashSet;
import java.util.Set;

import org.ycpait.studentmanagementpp.entity.Student;

public class DemoHashCodeEquals {

	public static void main(String[] args) {
		
		Set <Student> students = new HashSet<Student>();
		
		Student s1 = new Student("Rohit", 78);
		Student s2 = new Student("Rohit", 77);
		Student s3 = new Student("Rohit", 79);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students.size());
	}
}
