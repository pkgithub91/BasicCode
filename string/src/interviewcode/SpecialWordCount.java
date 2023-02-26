package interviewcode;

public class SpecialWordCount {
	public void wordcount(String s)
	{
		int d=0;int l=0;int sp=0; int lw=0;
		char[] ch = s.toCharArray();
		
		for(Character t:ch)
		{
			if(Character.isDigit(t))
			{
				d++;
				
			}
			
			else if (Character.isLetter(t)) {
				l++;
				
			}
			else if (Character.isSpace(t)) {
				sp++;
				
			}
			else if (Character.isWhitespace(t)) {
				lw++;
				
			}
			
		}
		System.out.println("Count Letter = "+l);
		System.out.println("Count Digit word = "+d);
		System.out.println("Count Space = "+sp);
		System.out.println("Count LowerCase = "+lw);
		
	}

	public static void main(String[] args) {
		SpecialWordCount specialWordCount = new SpecialWordCount();
		specialWordCount.wordcount("sdifjk@#$%^##$jf4SJUE'' FAUA UAEHFJDHKAH p kdjifa;evj ajjnrfi bsjenkfjr  65465 45v 4vv mkm 5c464v 64vfvkmvkm844");
	}
}
