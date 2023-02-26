package max;

public class R {
	
	public static void main(String[] args) {
		String s1 ="   pradeep kumar";
		String t=" ";
		int lng = s1.length();
		for(int i=lng-1; i>=0; i--)
		{
			t = t+s1.charAt(i);
		}
		System.out.println(t);
	}

}
