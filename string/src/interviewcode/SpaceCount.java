package interviewcode;

public class SpaceCount {
	
	public String count(String s)
	{
		int spl = 0;
		String[] sp = s.split("");
		for(String ch:sp)
		{
			if(ch.equals(" "))
			{
				spl++;
			}
		}
		return "Total Space  "+spl;
	}

	public static void main(String[] args) {
		SpaceCount count = new SpaceCount();
		String count2 = count.count("Rame is good boy kjuhbn bhnnm");
		System.out.println(count2);
		
	}
}
