package max;

import java.util.stream.Stream;

public class RecursionExample4 {
	
	public static void main(String[] args) {
		Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
	      .limit(5) // short-circuit
	      .map(s -> s[0])
	      .forEach(System.out::println); 
		
		//Stream.iterate(new Integer[]);
		
	}

}
