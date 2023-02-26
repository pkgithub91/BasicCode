package max;

public class WordRev {
	
	public static void main(String[] args) {
		
		String s="welcome to java";
		String[] split = s.split(" ");
		String revString = " ";
		for(String w:split)
		{
			String ss = " ";
			for(int i=w.length()-1; i>=0; i--)
			{
				ss = ss+w.charAt(i);
			}
			revString = revString+ss+"";
		}
		System.out.println(revString);
		
		
	}
	

}
