package hcl.methodCalling;

import java.util.HashSet;
import java.util.Set;

import hcl.model.Employee;
import hcl.model.Manager;

public class HclCompany {
	
	public Set<Object> getData() {
		
		Set<Object> list = new HashSet<Object>();
		
		Employee employee = new Employee(123, "pradeep", "Berger paint", 25000, "Noida");
		Employee employee1 = new Employee(124, "kumar","K-30", 36000, "Chhalera");
		Employee employee2 = new Employee(125, "hari", "KCPL", 56000, "Ladpura");
		Employee employee3 = new Employee(126, "veer", "web Tech", 45000, "Firozabad");
		Employee employee4 = new Employee(127, "shunil", "TCS", 85000, "Gr.Noida");
		
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		  Manager manager = new Manager(121, "Amit", "Berger paint", 26000);
		  Manager manager1 = new Manager(122, "Ankit kumar", "K-30", 51000);
		  Manager manager2 = new Manager(123, "Sourabh", "KCPL", 29625);
		  Manager manager3 = new Manager(124, "Shivam", "web Tech", 36154);
		  Manager manager4 = new Manager(125, "Mayank", "TCS", 45265);
		  
		  list.add(manager);
		  list.add(manager1);
		  list.add(manager2);
		  list.add(manager3);
		  list.add(manager4);
			return list;
		  
	}

	

}
