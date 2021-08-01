package interview;

import java.util.*;



public class factorial {

public static void main(String[] args) {
				
		methodFactorial obj = new methodFactorial();
		System.out.println(obj.method(3));
		

	}

	
	
	}
class methodFactorial implements InterfaceFactorial
{
	
	methodFactorial() {
	}
	@Override
	public int method(int number)
	{
		int result=1;
		while(number != 1)
		{
			result *=number;
			number--;
		}
		return result;
		
	}
}
