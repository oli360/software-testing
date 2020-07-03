package MetamorphicTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MetamorphicRotate {

	@Test
	void test2_1A() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None 
		//Type			:Stack
		//Data Type		:Character
		
		//For Int:
		//Value		:4	
		//Nulls		:None
		//Magintude :Smaller than List.lenght
		
		
		List<Character> myListForTest = new ArrayList<Character>();
		myListForTest.add('a');
		myListForTest.add('b');
		myListForTest.add('c');
		myListForTest.add('e');
		myListForTest.add('f');
		myListForTest.add('g');
		myListForTest.add('h');
		
		Collections.rotate(myListForTest, 4);
		
		List<Character> myListForTestduplicate = new ArrayList<Character>();
		myListForTestduplicate.add('a');
		myListForTestduplicate.add('b');
		myListForTestduplicate.add('c');
		myListForTestduplicate.add('e');
		myListForTestduplicate.add('f');
		myListForTestduplicate.add('g');
		myListForTestduplicate.add('h');
		
		Collections.rotate(myListForTestduplicate, 4+myListForTestduplicate.size());
		

		
		assertEquals("message", myListForTest, myListForTestduplicate);
		
	}
	
	@Test
	void test2_2A() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:Multiple Duplicates
		//Nulls			:None 
		//Type			:ArrayList
		//Data Type		:Integer
		
		//For Int:
		//Value		:4	
		//Nulls		:None
		//MAgintude :Larger than List.lenght
		
		
		List<Integer> myListForTest = new ArrayList<Integer>();
		myListForTest.add(1);
		myListForTest.add(5);
		myListForTest.add(3);
		myListForTest.add(3);
		myListForTest.add(5);
		myListForTest.add(6);
		myListForTest.add(7);
		
		Collections.rotate(myListForTest, 9);
		
		List<Integer> myListForTest2_2Duplicate = new ArrayList<Integer>();
		myListForTest2_2Duplicate.add(1);
		myListForTest2_2Duplicate.add(5);
		myListForTest2_2Duplicate.add(3);
		myListForTest2_2Duplicate.add(3);
		myListForTest2_2Duplicate.add(5);
		myListForTest2_2Duplicate.add(6);
		myListForTest2_2Duplicate.add(7);
		
		Collections.rotate(myListForTest2_2Duplicate, 9+myListForTest2_2Duplicate.size());
	
		
		assertEquals("message", myListForTest2_2Duplicate, myListForTest);
		
	}
	
	@Test
	void test2_3A() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None 
		//Type			:ArrayList subset
		//Data Type		:String
		
		//For Int:
		//Value		:2	
		//Nulls		:None
		//MAgintude :Smaller than List.lenght
		
		
		List<String> myListForTest = new ArrayList<String>();
		myListForTest.add("Alpha");
		myListForTest.add("Bravo");
		myListForTest.add("Charlie");
		myListForTest.add("Delta");
		myListForTest.add("Echo");
		myListForTest.add("Foxtrot");
		myListForTest.add("Golf");
		
		Collections.rotate(myListForTest.subList(1, 4), -1);
		
		List<String> myListForTestDuplicate = new ArrayList<String>();
		myListForTestDuplicate.add("Alpha");
		myListForTestDuplicate.add("Bravo");
		myListForTestDuplicate.add("Charlie");
		myListForTestDuplicate.add("Delta");
		myListForTestDuplicate.add("Echo");
		myListForTestDuplicate.add("Foxtrot");
		myListForTestDuplicate.add("Golf");
		
		Collections.rotate(myListForTestDuplicate.subList(1, 4), -1+myListForTestDuplicate.subList(1, 4).size());
		
		assertEquals("message", myListForTest, myListForTestDuplicate);
		
	}

	@Test
	void test2_1B() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None 
		//Type			:Stack
		//Data Type		:Character
		
		//For Int:
		//Value		:4	
		//Nulls		:None
		//Magintude :Smaller than List.lenght
		
		
		List<Character> myListForTest = new ArrayList<Character>();
		myListForTest.add('a');
		myListForTest.add('b');
		myListForTest.add('c');
		myListForTest.add('e');
		myListForTest.add('f');
		myListForTest.add('g');
		myListForTest.add('h');
		

		
		List<Character> myListForTestduplicate = new ArrayList<Character>();
		myListForTestduplicate.add('a');
		myListForTestduplicate.add('b');
		myListForTestduplicate.add('c');
		myListForTestduplicate.add('e');
		myListForTestduplicate.add('f');
		myListForTestduplicate.add('g');
		myListForTestduplicate.add('h');
		
		
		Collections.rotate(myListForTestduplicate, 4);
		Collections.rotate(myListForTestduplicate, -4);

		
		assertEquals("message", myListForTest, myListForTestduplicate);
		
	}
	
	@Test
	void test2_2B() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:Multiple Duplicates
		//Nulls			:None 
		//Type			:ArrayList
		//Data Type		:Integer
		
		//For Int:
		//Value		:4	
		//Nulls		:None
		//MAgintude :Larger than List.lenght
		
		
		List<Integer> myListForTest = new ArrayList<Integer>();
		myListForTest.add(1);
		myListForTest.add(5);
		myListForTest.add(3);
		myListForTest.add(3);
		myListForTest.add(5);
		myListForTest.add(6);
		myListForTest.add(7);
		
		
		List<Integer> myListForTest2_2Duplicate = new ArrayList<Integer>();
		myListForTest2_2Duplicate.add(1);
		myListForTest2_2Duplicate.add(5);
		myListForTest2_2Duplicate.add(3);
		myListForTest2_2Duplicate.add(3);
		myListForTest2_2Duplicate.add(5);
		myListForTest2_2Duplicate.add(6);
		myListForTest2_2Duplicate.add(7);
		
		
		Collections.rotate(myListForTest2_2Duplicate, 9);
		Collections.rotate(myListForTest2_2Duplicate, -9);
		
		assertEquals("message", myListForTest2_2Duplicate, myListForTest);
		
	}
	
	@Test
	void test2_3B() {
		
		//Paramteters:
		
		//For List:
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None 
		//Type			:ArrayList subset
		//Data Type		:String
		
		//For Int:
		//Value		:2	
		//Nulls		:None
		//MAgintude :Smaller than List.lenght
		
		
		List<String> myListForTest = new ArrayList<String>();
		myListForTest.add("Alpha");
		myListForTest.add("Bravo");
		myListForTest.add("Charlie");
		myListForTest.add("Delta");
		myListForTest.add("Echo");
		myListForTest.add("Foxtrot");
		myListForTest.add("Golf");
		

		
		List<String> myListForTestDuplicate = new ArrayList<String>();
		myListForTestDuplicate.add("Alpha");
		myListForTestDuplicate.add("Bravo");
		myListForTestDuplicate.add("Charlie");
		myListForTestDuplicate.add("Delta");
		myListForTestDuplicate.add("Echo");
		myListForTestDuplicate.add("Foxtrot");
		myListForTestDuplicate.add("Golf");
		
		Collections.rotate(myListForTestDuplicate.subList(1, 4), 7);
		Collections.rotate(myListForTestDuplicate.subList(1, 4), -7);
		
		assertEquals("message", myListForTest, myListForTestDuplicate);
		
	}
	
}
