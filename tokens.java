package interview;

public class tokens {

	public static void main(String [] args)
	{
		String str="He is a very very good boy, isn`t he?";
		
		String [] array;
		array=str.split(" ");
		for(String word:array) 
		System.out.println(word);

	}
}
