package max;

public class RemoveString {
	
	public static void main(String[] args) {
		
		String s = "pradeep";
		StringBuilder sb = new StringBuilder();
		
		s.chars().distinct().forEach(e ->sb.append((char)e));
		System.out.println(sb);
		
		
	}

}
