import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.ycpait.studentmanagementpp.entity.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			FileOutputStream fos =null;
			ObjectOutputStream oos =null;
		
			
			try {
				fos = new  FileOutputStream("students.txt");
				oos = new ObjectOutputStream(fos);	
				
				Student s = new Student("Chinmay",13); 
				oos.writeObject(s);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
	}

}
