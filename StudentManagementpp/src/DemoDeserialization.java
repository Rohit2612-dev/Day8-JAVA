import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.ycpait.studentmanagementpp.entity.Student;

public class DemoDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				FileInputStream fis =null;
				ObjectInputStream ois = null;
				
				try {
					fis = new FileInputStream ("students.txt");
					ois = new ObjectInputStream(fis);
					Student s = (Student) ois.readObject();
					System.out.println(s);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

}
