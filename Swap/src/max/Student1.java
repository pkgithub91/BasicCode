package max;

public class Student1 implements Cloneable {

	int id;
	String name;

	Student1(int id, String name){  
	this.id = id;  
	this.name = name;  
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(101, "John");
		System.out.println(s.id + " " + s.name);
		try {
			Student1 s1 = (Student1) s.clone();
			System.out.println(s1.id + " " + s1.name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(s.toString());
		}
	}

}
