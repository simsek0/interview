package interview;

public class arrayreverse2 {

	static void reverseArray(String array[])
	{
		int length=array.length;
		
		
			int i=0;
			while(i<length/2)
			{
				String temp=array[i];
				
				array[i]=array[length-(1+i)];
				array[length-(1+i)]=temp;
				i++;
			
			}
		
		
	}
	
	public static void main(String [] args)
	{
		String [] array ={"1","2","3","4","5","6","7"};
	
		reverseArray(array);
		
		for(String word:array)
		{
			System.out.print(word);
		}
	}
}
