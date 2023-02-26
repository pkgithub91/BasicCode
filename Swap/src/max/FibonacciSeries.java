package max;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		
		for(int i=0; i<=10; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
			System.out.println();
		}
		
		String s="I am pradeep kumar";
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		
	}
	

}
