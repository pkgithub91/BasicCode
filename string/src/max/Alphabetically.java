package max;

import java.util.Arrays;

public class Alphabetically {
	
	public static String alfa(String alfb)
	{
		char[] ch = alfb.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
	public static void main(String[] args) {
		System.out.println(Alphabetically.alfa("veerpalkumarpradeepuser"));
		
	}

}
