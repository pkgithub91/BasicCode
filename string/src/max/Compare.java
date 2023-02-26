package max;

public class Compare {
	 public static void main(String[] args) {
	      String str1 = "pradeep kumar";
	      String str2 = "kumar";
	      int retval = str1.compareTo(str2);
	      if (retval < 0) {
	         System.out.println("str1 is greater than str2");
	      } else if (retval == 0) {
	         System.out.println("str1 is equal to str2");
	      } else {
	         System.out.println("str1 is less than str2");
	      }
	      
	      
	   }

}
