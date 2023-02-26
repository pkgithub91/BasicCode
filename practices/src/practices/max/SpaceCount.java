package practices.max;

public class SpaceCount {
	
	public  String sc(String s)
	{
		int spl=0;
		String[] sp = s.split("");
		
		for(String l:sp)
		{
			if(l.equals(" "))
			{
				spl++;
			}
		}
		return "" +spl;
	}
	
		
	public static void main(String[] args) {
		
		//System.out.println(SpaceCount.sc("s j k d"));
		SpaceCount spaceCount = new SpaceCount();
		String sc = spaceCount.sc("k d i k k ");
		System.out.println(sc);
		
	}

}
