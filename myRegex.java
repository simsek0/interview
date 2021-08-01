package interview;

import java.util.*;
public class myRegex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Please enter IP:");
		str=scan.next();
		
		String [] array=str.split("\\.");
	
		
		boolean cond = true;
		
		for(String arr:array)
		{
			if(arr.length()<=3 && arr.length() != 0 )
			{
				arr=arr.replaceAll("[a-zA-Z]","***");
				if(arr.contains("***"))
				{
					cond=false;
				}
			}
			else
			{
				cond = false;
			}
		}
		
		if(cond)
		{
			System.out.println("Valid input...");
		}
		else
		{
			System.out.println("invalid..");
		}
	}

}
