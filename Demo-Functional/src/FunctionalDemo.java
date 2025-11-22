import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

	public static void main(String[] args) {
		
		Predicate<String> p;
		p = s -> s.equals("Mumbai");
		System.out.println(p.test("Mumbai"));
		
		Function<String, Integer> f;
		f = s -> s.length();
		System.out.println(f.apply("Mumbai"));
		
		Supplier<String> s;
		s =() -> "Mumbai";
		System.out.println(s.get());
		
		Consumer<String> c;
		c = str ->  System.out.println(str);
		c.accept("Mumbai");	
	}
}
