package max;

public class Employee {
	
	private int id;
	private String name;
	private String phone;
	private double salary;
	private String address;
	
	public Employee(int id, String name, String phone, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
	

}
