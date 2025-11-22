package org.ycpait.studentmanagementpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.studentmanagementpp.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundExceptiont;

public class StudentManagementApplication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		//1. create a reference of Student type
		Student s=null;
	//	int indexCount=0;
	//	Student[] students = new Student[2];
		
		List<Student> students = new ArrayList<Student>();
		
		
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("3.Enter Roll Number");
			System.out.println("4.Delete student by Roll Number");
			System.out.println("5.Sort Student by marks");
			System.out.println("6.Sort Student by names");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
//				if(indexCount <= students.length)
//				{
//					students[indexCount] = new Student(1,"Amaan", 78.78f);
//					indexCount++;
//				}
//				else
//				{
//					System.err.println("Limit exceeded");
//				}
//				break;
//===================================================================================================
				System.out.println("Enter Your Name:");
				String name = sc.next();
				System.out.println("Enter Your Marks:");
				float marks = sc.nextFloat();
				Student s1 =new Student(name, marks);
				students.add(s1);
				break;
			}
			case 2: {
					//s.display();
					for(Student stu : students)
					{
						if(students!=null)
							System.out.println(stu);
					}
				break;
			}
			case 3: {
				boolean isFound = false;
				// seraching array  for syudent
				System.out.println("Enter Roll Number");
				int r = sc.nextInt();
				for(Student foundStudent : students) {
					if(foundStudent !=null && foundStudent.getRollNumber()==r) {
						System.out.println(foundStudent);
						isFound=true;
						break;
					}
				}
				if(!isFound) {
					//Generate Exception
					StudentNotFoundExceptiont e=new StudentNotFoundExceptiont("Student with RollNo "+ r +" Not Found!");
					try {
						throw e;
					}
					catch (StudentNotFoundExceptiont ex) {
						ex.printStackTrace();
					}
			}
				
				
				
			}
			break;
			
			case 4:
				System.out.println("Enter the roll number");
				int rollNumberToDelete = sc.nextInt();
				Iterator<Student> i = students.iterator();
				
				while(i.hasNext()) {
					Student studentTobeDeleted = i.next();
					if(studentTobeDeleted .getRollNumber()==rollNumberToDelete)
						i.remove();
				}
				break;
				
			case 5:
			System.out.println("Sorted marks are");
			Collections.sort(students);
			for(Student stu : students) {
				if(stu != null)
					System.out.println(stu);
			}
			break;
			
			case 6:
				System.out.println("Sorted by name");
				Collections.sort(students,(s1,s2)-> s1.getName().compareTo(s2.getName()));
				
				for(Student stu : students) {
					if(stu != null)
						System.out.println(stu);
				}
				break;
				
		
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");

	}

}