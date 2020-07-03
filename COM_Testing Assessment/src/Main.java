import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

	public static void main(String[] args) {
  
		List<RandomComparator> myList = new ArrayList<RandomComparator>();
		myList.add(new RandomComparator("a"));
		myList.add(new RandomComparator("b"));
		myList.add(new RandomComparator("c"));
		myList.add(new RandomComparator("d"));
		myList.add(new RandomComparator("e"));
		myList.add(new RandomComparator("f"));
		myList.add(new RandomComparator("g"));
		myList.add(new RandomComparator("h"));
		myList.add(new RandomComparator("i"));
		myList.add(new RandomComparator("j"));
		myList.add(new RandomComparator("k"));
		myList.add(new RandomComparator("l"));
		myList.add(new RandomComparator("m"));
		myList.add(new RandomComparator("n"));
		myList.add(new RandomComparator("o"));
		myList.add(new RandomComparator("p"));
		myList.add(new RandomComparator("q"));
		myList.add(new RandomComparator("r"));
		myList.add(new RandomComparator("s"));
		myList.add(new RandomComparator("t"));
		myList.add(new RandomComparator("u"));
		myList.add(new RandomComparator("v"));
		myList.add(new RandomComparator("w"));
		myList.add(new RandomComparator("x"));
		myList.add(new RandomComparator("y"));
		myList.add(new RandomComparator("z"));
		
		System.out.println(myList);
		System.out.println(Collections.min(myList));
		
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println(Collections.min(myList));
		
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println(Collections.min(myList));
		
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println(Collections.min(myList));
		System.out.println(Collections.min(myList));
		System.out.println(Collections.min(myList));
		
		// a couple interesting remarks about these tests :
		//- even thought all comparator are random the final list ressembles the input list
		// 			this is probably due to the merge sorting algorithm used by java
		//- the last entry after sort is not equal to the min output
		//- the min output depends of the order of the input list
		//- the min method stays consistend if the input is not modified




		
	}

}