package interview;
import java.util.*;
import java.lang.Math;

public class Armstrong {

	
	
	public static void main(String[] args) {
	
		String strNumber = null;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number to see if Armstrong:");
		
		long inputNumber=scan.nextLong();
		strNumber=strNumber.valueOf(inputNumber);
	
		char [] array = strNumber.toCharArray();
		
		//
		long numberArray[];
		numberArray = new long[array.length];
		long result=0;
		for(int i=0;i<array.length;i++)
		{
			switch(array[i])
			{
			case '0':
				numberArray[i]=0;
				break;
			case '1':
				numberArray[i]=1;
				break;
			case '2':
				numberArray[i]=2;
				break;
			case '3':
				numberArray[i]=3;
				break;
			case '4':
				numberArray[i]=4;
				break;
			case '5':
				numberArray[i]=5;
				break;
			case '6':
				numberArray[i]=6;
				break;
			case '7':
				numberArray[i]=7;
				break;
			case '8':
				numberArray[i]=8;
				break;
			case '9':
				numberArray[i]=9;
				break;
			default:
				break;	
			}
		}
		for (int i=0;i<numberArray.length;i++)
		{
			result += Math.pow(numberArray[i],numberArray.length);
		}
		if(result==inputNumber)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}

}
