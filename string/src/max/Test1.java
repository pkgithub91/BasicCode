package max;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(13, "Mahon", "9785563251", 70000, "UP"));
		arrayList.add(new Employee(16, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(18, "Kumar", "9785465461", 50000, "Rajpura"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(13, "Mahon", "9785563251", 70000, "UP"));
		arrayList.add(new Employee(16, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(18, "Kumar", "9785465461", 50000, "Rajpura"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(13, "Mahon", "9785563251", 70000, "UP"));
		arrayList.add(new Employee(16, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(18, "Kumar", "9785465461", 50000, "Rajpura"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(13, "Mahon", "9785563251", 70000, "UP"));
		arrayList.add(new Employee(16, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(18, "Kumar", "9785465461", 50000, "Rajpura"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		arrayList.add(new Employee(17, "Sonu", "9785462561", 80000, "Delhi"));
		arrayList.add(new Employee(12, "Tarun", "9785463251", 60000, "Bihar"));
		
		
	//	arrayList.stream().collect(Collectors.groupingBy(Employee : getName).Collectors.counting());
	 // Map<String, Long> collect = arrayList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
	  Map<String, Long> collect = arrayList.stream().collect(Collectors.groupingBy(Employee ::getName,Collectors.counting()));

		System.out.println(collect);
		
		
		
		Map<String, Integer> map = new HashMap<>();
		
		for( Employee e:arrayList)
		{
			if(!map.containsKey(e))
			{
				map.put(e.getName(), 1);
			}
			else {
				map.put(e.getName(), map.get(e.getName())+1);
			}
			
		}
		System.out.println(map);
		
	
		
		
		
		
		
		
	}
	

}
