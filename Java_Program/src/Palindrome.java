public class Palindrome
{
	public static void main (String[]args)
	
{
	String str ="RAR";
	 String rev="";
	 int length= str.length();
	 for (int i = length-1; i >=0; i--) 
	 {
		 rev= rev+str.charAt(i);
		 
		 if (str.equals(rev)) 
		 {
		System.out.println("palindrome");	
		} else 
		{
          System.out.println("NO");
		}
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
}