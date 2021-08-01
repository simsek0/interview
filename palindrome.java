package interview;

public class palindrome {

	
	static boolean findPalindrome(String str)
	{
		boolean cond=false;
		
		int length=str.length();
		int half=length/2;
		char [] arr= str.toCharArray();
		
		String first="";
		String second="";
		for(int i=0;i<half;i++)
		{
			first +=arr[i];
		}
		if(length%2 ==0)
		{
			for (int i=length-1;i>=half;i--)
			{
				second +=arr[i];
			}
		}
		else {
			for(int i=length-1;i>half;i--)
			{
				second +=arr[i];
			}
		}
		
		if(first.contains(second))
		{
			cond =true;
		}
		else {
			cond =false;
		}
		
		return cond;
		}
	
	
	public static void main(String[] args) {
		
		String str = "madam";
		System.out.println(findPalindrome(str));
		
	}

}
