package MetamorphicTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

import org.junit.jupiter.api.Test;

import TestCases.StringWithId;

class MetamorphicSort {
	// 2 Metamophic relations have been found for the sort method:
	//		-Multiplying the list by -1 
	//      - Adding values to the all the list 
	//			-for strings add character before or after
	//			-for int add same randomm value to entire list
	
	
	//First Metamorphic Realtion (Multiplying the list by -1 )
	//can only be applied to test cases with in data type
	@Test
	void testMetamorphic1_1A() {
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None
		//Type			:ArrayList
		//Data Type		:Character
		//Comparator 	:Object can be compared to eachother in a coherent manner
		
			
		//Create list for test purposes
		List<Character>  myListForTest1_1 = new ArrayList<Character>();
		
		// add values to the list in random order
		myListForTest1_1.add('e');
		myListForTest1_1.add('%');
		myListForTest1_1.add('s');
		myListForTest1_1.add(']');
		myListForTest1_1.add('t');
		myListForTest1_1.add('r');
		myListForTest1_1.add('q');
		
		//Create list for test purposes
		List<Character>  myListForTest1_1Inverted = new ArrayList<Character>();
		
		// add values to the list in random order
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(0)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(1)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(2)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(3)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(4)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(5)));
		myListForTest1_1Inverted.add(MetamorphicHelper.charInverter(myListForTest1_1.get(6)));
		

		
		//sort the list
		Collections.sort(myListForTest1_1);
		Collections.sort(myListForTest1_1Inverted);
		
		//invert all charcater in sorted myListForTest1_1
		for(int i =0; i<myListForTest1_1.size(); i++) {
			myListForTest1_1.set(i,MetamorphicHelper.charInverter(myListForTest1_1.get(i)));
		}
		
		//inverse list
		List<Character>  myResultForTest1_1 = new ArrayList<Character>();
		for(int i =1; i<=myListForTest1_1.size(); i++) {
			myResultForTest1_1.add(myListForTest1_1.get(myListForTest1_1.size()-i));
		}
		
		
		//assert that the sorted test list is equal to the created sorted list
		assertEquals("message", myListForTest1_1Inverted, myResultForTest1_1);


	}

	@Test
	void testMetamorphic1_2A() {
		
		//Paramteters:
		
				//Size			:Multiple Data
				//Duplicates	:One duplicate
				//Nulls			:None NUll
				//Type			:Stack
				//Data Type		:Integer
				//Comparator 	:Object can be compared to eachother in a coherent manner
		//create normal list
		Stack<Integer> myStackForTest1_2 = new Stack<>();
		myStackForTest1_2.push(5);
		myStackForTest1_2.push(12);
		myStackForTest1_2.push(9);
		myStackForTest1_2.push(5);
		myStackForTest1_2.push(2);
		myStackForTest1_2.push(8);

		//creat inverted list
		Stack<Integer>  myStackForTest1_2Inverted = new Stack<>();
		myStackForTest1_2Inverted.push(-2);
		myStackForTest1_2Inverted.push(-5);
		myStackForTest1_2Inverted.push(-5);
		myStackForTest1_2Inverted.push(-8);
		myStackForTest1_2Inverted.push(-9);
		myStackForTest1_2Inverted.push(-12);
		
		//sort bothe lists
		Collections.sort(myStackForTest1_2);
		Collections.sort(myStackForTest1_2Inverted);
		
		//invert and flip list1
		Stack<Integer> result = new Stack<>();
		for(int i =1; i<=myStackForTest1_2.size(); i++) {
			result.push(-myStackForTest1_2.get(myStackForTest1_2.size()-i));
		}
		

		assertEquals("message", myStackForTest1_2Inverted, result);
	}

	@Test
	void testMetamorphic1_3A() {
		
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:Multiple duplicates
		//Nulls			:None
		//Type			:Stack
		//Data Type		:String with ID
		//Comparator 	:Object can be compared to each other in a coherent manner

		
		
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
		
		
		List<StringWithId> myListForTest1_3Inverted = new ArrayList<StringWithId>();
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("this"),31));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("is"),92));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("the"),36));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("solution"),10));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("to"),57));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("all"),46));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("yes"),17));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("hello"),78));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("no"),9));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("solution"),64));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("maybe"),111));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("test"),12));
		myListForTest1_3Inverted.add(new StringWithId(MetamorphicHelper.wordInverter("maybe"),13));
		
		System.out.println(Arrays.toString(StringWithId.getListId(myListForTest1_3)));
		System.out.println(Arrays.toString(StringWithId.getListId(myListForTest1_3Inverted)));
		
		Collections.sort(myListForTest1_3);
		Collections.sort(myListForTest1_3Inverted);
		
		System.out.println(Arrays.toString(StringWithId.getListId(myListForTest1_3)));
		System.out.println(Arrays.toString(StringWithId.getListId(myListForTest1_3Inverted)));
		
		int[] myListForTest1_3ID =StringWithId.getListId(myListForTest1_3);
		int[] myListForTest1_3InvertedID =StringWithId.getListId(myListForTest1_3Inverted);
		
		//flip the id of the non inverted List
		int[] myListForTest1_3IDFlipped = new int[myListForTest1_3ID.length];
		for(int i =0; i<myListForTest1_3ID.length; i++) {
			myListForTest1_3IDFlipped[i]=myListForTest1_3ID[myListForTest1_3ID.length-i-1];
		}
		System.out.println(Arrays.toString(myListForTest1_3IDFlipped));
		System.out.println(Arrays.toString(myListForTest1_3InvertedID));
		assertEquals("test1.3", myListForTest1_3InvertedID,myListForTest1_3IDFlipped );
	}

	
	//void testMetamorphic1_1B() {
	//Test 1_1B is not possible because character are a single value
	
	@Test
	void testMetamorphic1_2B() {
		
		//Paramteters:
		
				//Size			:Multiple Data
				//Duplicates	:One duplicate
				//Nulls			:None NUll
				//Type			:Stack
				//Data Type		:Integer
				//Comparator 	:Object can be compared to eachother in a coherent manner
		//create normal list
		Stack<Integer> myStackForTest= new Stack<>();
		myStackForTest.push(5);
		myStackForTest.push(12);
		myStackForTest.push(9);
		myStackForTest.push(5);
		myStackForTest.push(2);
		myStackForTest.push(8);

		//create  same list lwith 5 added 
		Stack<Integer>  myStackForTestWithAdedvalue = new Stack<>();
		myStackForTestWithAdedvalue.push(2+5);
		myStackForTestWithAdedvalue.push(5+5);
		myStackForTestWithAdedvalue.push(5+5);
		myStackForTestWithAdedvalue.push(8+5);
		myStackForTestWithAdedvalue.push(9+5);
		myStackForTestWithAdedvalue.push(12+5);
		
		//sort bothe lists
		Collections.sort(myStackForTest);
		Collections.sort(myStackForTestWithAdedvalue);
		
		//invert and flip list1
		Stack<Integer> result = new Stack<>();
		for(int i =0; i<myStackForTest.size(); i++) {
			result.push(myStackForTest.get(i)+5);
		}
		

		assertEquals("message", myStackForTestWithAdedvalue, result);
	}

	
	
	@Test
	void testMetamorphic1_3B() {
		
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:Multiple duplicates
		//Nulls			:None
		//Type			:Stack
		//Data Type		:String with ID
		//Comparator 	:Object can be compared to each other in a coherent manner

		
		//create list of 
		List<StringWithId> myListForTest = new ArrayList<StringWithId>();
		myListForTest.add(new StringWithId("this",31));
		myListForTest.add(new StringWithId("is",92));
		myListForTest.add(new StringWithId("the",36));
		myListForTest.add(new StringWithId("solution",10));
		myListForTest.add(new StringWithId("to",57));
		myListForTest.add(new StringWithId("all",46));
		myListForTest.add(new StringWithId("yes",17));
		myListForTest.add(new StringWithId("hello",78));
		myListForTest.add(new StringWithId("no",9));
		myListForTest.add(new StringWithId("solution",64));
		myListForTest.add(new StringWithId("maybe",111));
		myListForTest.add(new StringWithId("test",12));
		myListForTest.add(new StringWithId("maybe",13));
		
		
		List<StringWithId> myListForTest1_3WithStringAdded = new ArrayList<StringWithId>();
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"this",31));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"is",92));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"the",36));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"solution",10));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"to",57));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"all",46));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"yes",17));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"hello",78));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"no",9));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"solution",64));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"maybe",111));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"test",12));
		myListForTest1_3WithStringAdded.add(new StringWithId("addedText"+"maybe",13));
		
		
		Collections.sort(myListForTest);
		Collections.sort(myListForTest1_3WithStringAdded);
		
		

		assertTrue("test1.3",  StringWithId.isListEqual(myListForTest, myListForTest1_3WithStringAdded));
	}
}
