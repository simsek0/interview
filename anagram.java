package interview;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1="lidsten";
		String word2="silent";
		
		//convert both String to char[]
		char [] arrStr = word1.toCharArray();
		char [] arrStr1= word2.toCharArray();
		
		//sort both char[] arrays
		Arrays.sort(arrStr);
		Arrays.sort(arrStr1);
		
		boolean cond= Arrays.equals(arrStr, arrStr1);
		
		System.out.println("cond = "+cond);
	
		
		
		
		}

}
