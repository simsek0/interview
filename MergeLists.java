package interview;
import java.util.*;
public class MergeLists {

	public static void main(String[] args) {

		
		List <String> list1=new ArrayList<>();
		list1.add("1");
		List<String>list2=new ArrayList<>();
		list2.add("2");
		
		List<String> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println(mergedList);
		
		
		//remove all occurrences of a given character
		//from input String
		
		String str1="abcdABCDabcdABCD";
		str1 =str1.replace("a"," ");
		System.out.println(str1);
	}

}
