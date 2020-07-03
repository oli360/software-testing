package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.jupiter.api.Test;

class TestSortMethod {
	
	//test 3_1 is designed to make sure the sort method 
	//correctly sorts a list of char
	
	@Test
	void test1_1() {
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None
		//Type			:ArrayList
		//Data Type		:Character
		//Comparator 	:Object can be compared to each other in a coherent manner
		
			
		//Create list for test purposes
		List<Character>  myListForTest1_1 = new ArrayList<Character>();
		
		// add values to the list in random order
		myListForTest1_1.add('e');
		myListForTest1_1.add('g');
		myListForTest1_1.add('s');
		myListForTest1_1.add('!');
		myListForTest1_1.add('t');
		myListForTest1_1.add('r');
		myListForTest1_1.add('q');
		
		//sort the list
		Collections.sort(myListForTest1_1);
		
		//create list with the same character as the test list but in alphabetical order
		List<Character> ResultForMyListForTest1_1 = new ArrayList<Character>( 
			Arrays.asList('!', 'e', 'g', 'q', 'r', 's', 't'));	
		
		//assert that the sorted test list is equal to the created sorted list
		assertEquals("message", ResultForMyListForTest1_1, myListForTest1_1);


	}
	
	//test 1_2 is designed to test weather the sort method can handle nulls in its input list
	
	@Test
	void test1_2() {
		
		//Paramteters:
		
				//Size			:Multiple Data
				//Duplicates	:One duplicate
				//Nulls			:one NUll
				//Type			:Stack
				//Data Type		:Integer
				//Comparator 	:Object can be compared to each other in a coherent manner
		
		Stack<Integer> myStackForTest1_2 = new Stack<>();
		myStackForTest1_2.add(5);
		myStackForTest1_2.add(12);
		myStackForTest1_2.add(9);
		myStackForTest1_2.add(5);
		myStackForTest1_2.add(null);
		myStackForTest1_2.add(2);
		myStackForTest1_2.add(8);
		
		
		Collections.sort(myStackForTest1_2);
		
		Stack<Integer>  ResultForTest1_2 = new Stack<>();
		ResultForTest1_2.push(2);
		ResultForTest1_2.push(5);
		ResultForTest1_2.push(5);
		ResultForTest1_2.push(8);
		ResultForTest1_2.push(9);
		ResultForTest1_2.push(12);	
		myStackForTest1_2.add(null);

		assertEquals("message", myStackForTest1_2, ResultForTest1_2);
	}

	//test1_2Modified is a modified version of test 1_2
	@Test
	void test1_2modified() {
		//create stack for test purposes
		Stack<Integer> myStackForTest1_2 = new Stack<>();
		myStackForTest1_2.add(5);
		myStackForTest1_2.add(12);
		myStackForTest1_2.add(9);
		myStackForTest1_2.add(5);
		myStackForTest1_2.add(null);
		myStackForTest1_2.add(2);
		myStackForTest1_2.add(8);
		
		
		Collections.sort(myStackForTest1_2,Comparator.nullsLast(Comparator.naturalOrder()));
		
		//create expected result
		Stack<Integer>  ResultForTest1_2 = new Stack<>();
		ResultForTest1_2.push(2);
		ResultForTest1_2.push(5);
		ResultForTest1_2.push(5);
		ResultForTest1_2.push(8);
		ResultForTest1_2.push(9);
		ResultForTest1_2.push(12);		
		ResultForTest1_2.push(null);	

		
		//assert the sorted test stack is equal to the created one
		assertEquals("message", myStackForTest1_2, ResultForTest1_2);
	}

	@Test
	void test1_3() {
		
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:Multiple duplicates
		//Nulls			:None
		//Type			:Stack
		//Data Type		:String with ID
		//Comparator 	:Object can be compared to each other in a coherent manner
		
		//create list for test purposes
		List<StringWithId> myListForTest1_3 = new ArrayList<StringWithId>();
		myListForTest1_3.add(new StringWithId("this",31));
		myListForTest1_3.add(new StringWithId("is",92));
		myListForTest1_3.add(new StringWithId("the",36));
		myListForTest1_3.add(new StringWithId("solution",10));
		myListForTest1_3.add(new StringWithId("to",57));
		myListForTest1_3.add(new StringWithId("all",46));
		myListForTest1_3.add(new StringWithId("yes",17));
		myListForTest1_3.add(new StringWithId("hello",78));
		myListForTest1_3.add(new StringWithId("no",9));
		myListForTest1_3.add(new StringWithId("solution",64));
		myListForTest1_3.add(new StringWithId("maybe",111));
		myListForTest1_3.add(new StringWithId("test",12));
		myListForTest1_3.add(new StringWithId("maybe",13));
		
		//sort the created list
		Collections.sort(myListForTest1_3);
		
		
		
		//create same list in order
		List<StringWithId> resultForMyListForTest1_3 = new ArrayList<StringWithId>();
		resultForMyListForTest1_3.add(new StringWithId("all",46));
		resultForMyListForTest1_3.add(new StringWithId("hello",78));
		resultForMyListForTest1_3.add(new StringWithId("is",92));
		resultForMyListForTest1_3.add(new StringWithId("maybe",111));
		resultForMyListForTest1_3.add(new StringWithId("maybe",13));
		resultForMyListForTest1_3.add(new StringWithId("no",9));
		resultForMyListForTest1_3.add(new StringWithId("solution",10));
		resultForMyListForTest1_3.add(new StringWithId("solution",64));
		resultForMyListForTest1_3.add(new StringWithId("test",12));
		resultForMyListForTest1_3.add(new StringWithId("the",36));
		resultForMyListForTest1_3.add(new StringWithId("this",31));
		resultForMyListForTest1_3.add(new StringWithId("to",57));
		resultForMyListForTest1_3.add(new StringWithId("yes",17));
		
		//compare both lists
		assertTrue("test1.3",  StringWithId.isListEqual(myListForTest1_3, resultForMyListForTest1_3));
	}
}
