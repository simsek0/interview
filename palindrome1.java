package interview;
//Mufasa Simsek
//7/19/2020
//Palindrome interview question
import java.util.*;
public class palindrome1 {

	void palindrome(String str)
	{
		char [] array = str.toCharArray();
		String reverse="";
		for(int i=array.length-1;i>=0;i--)
		{
			reverse +=array[i];
		}
		if(reverse.equals(str))
		{
			System.out.println(str +" is palindrome");
		}
		else
			
		{
			System.out.println(str +" is not palindrome");
		}
	
	}
		void numberPalindrome(int number)
		{
			Integer a= number;
			
		}
		
	
		public static void main(String [] args)
	{
		
		palindrome1 obj = new palindrome1();
		obj.palindrome("mamam");
		obj.palindrome("fifa");
		obj.palindrome("object");
		obj.palindrome("level");
		
	}
}
