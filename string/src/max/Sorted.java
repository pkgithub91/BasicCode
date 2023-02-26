package max;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,4,5,3,6,8,7,9,4,1,5,6,8,4,5,12,15,14,19,18,55);
	List<Integer> collect = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
	//list.stream().filter();
	System.out.println(collect);
		
		
	}

}
