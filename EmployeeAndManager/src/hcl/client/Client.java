package hcl.client;

import java.util.Iterator;
import java.util.Set;

import hcl.methodCalling.HclCompany;
import hcl.model.Employee;
import hcl.model.Manager;

public class Client {
	public static void main(String[] args) {
		HclCompany company = new HclCompany();
		Set<Object> list = company.getData();
		System.out.println(list);
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext())
		{
			Object next = iterator.next();
			if (next instanceof Employee)
			{
				Employee r = (Employee)next;
				System.out.println(r);
				System.out.println("============================================");
				
			}
			else if (next instanceof Manager)
			{
			Manager manager = (Manager)next;
			System.out.println(manager);
			}
			
		}
		
	}

}
