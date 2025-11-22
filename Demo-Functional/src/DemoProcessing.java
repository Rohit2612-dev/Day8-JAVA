import java.util.ArrayList;
import java.util.List;


public class DemoProcessing {

	public static void main(String[] args) {
		
		ArrayList<String>s = new ArrayList();
		
		s.add("Mumbai");
		s.add("Nagpur");
		s.add("Cheenai");
		s.add("Mysore");
		s.add("Manglore");
		
		s.forEach(str -> System.out.println(str)); //Accepting Consumer function  
		
		System.out.println("List of cities: "+s);
		
		List<String> str= new ArrayList<String>();
		for(String a: s) {
			if(a.startsWith("M")) {
				str.add(a);
			}
		}
		System.out.println("New List of cities: "+str); 
		
		List<Integer> cl = new ArrayList<Integer>();
		
		for(String a : s) {		
			cl.add(a.length());	
		}
		System.out.println("Length of cities: "+cl);	
	}
}
