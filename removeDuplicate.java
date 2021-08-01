package interview;
import java.util.*;
public class removeDuplicate {

	public static void main(String[] args) {
		Set<Integer> setArray = new HashSet<Integer>();

		int array [] = {1,2,3,4,5,6,7,4,5,6,8,1,34,54,65,76,78};
		
		int length = array.length;
		
		for(int i=0;i<length;i++)
		{
			setArray.add(array[i]);
		}
		
		System.out.println(setArray);
	}

}
