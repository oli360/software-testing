package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestRotateMethod {

	@Test
	void test2_1() {
		
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
		
		
		List<Character> myListForTest2_1 = new ArrayList<Character>();
		myListForTest2_1 .add('a');
		myListForTest2_1 .add('b');
		myListForTest2_1 .add('c');
		myListForTest2_1 .add('e');
		myListForTest2_1 .add('f');
		myListForTest2_1 .add('g');
		myListForTest2_1 .add('h');
		
		Collections.rotate(myListForTest2_1, 4);
		
		List<Character> ResultForMyListForTest2_1 = new ArrayList<Character>( 
				Arrays.asList('e', 'f', 'g', 'h', 'a', 'b', 'c'));	
		
		assertEquals("message", ResultForMyListForTest2_1, myListForTest2_1);
		
	}
	
	@Test
	void test2_2() {
		
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
		
		
		List<Integer> myListForTest2_2 = new ArrayList<Integer>();
		myListForTest2_2 .add(1);
		myListForTest2_2 .add(5);
		myListForTest2_2 .add(3);
		myListForTest2_2 .add(3);
		myListForTest2_2 .add(5);
		myListForTest2_2 .add(6);
		myListForTest2_2 .add(7);
		
		Collections.rotate(myListForTest2_2, (Integer) null);
		
		List<Integer> ResultForMyListForTest2_2 = new ArrayList<Integer>( 
				Arrays.asList(6, 7, 1, 5, 3, 3, 5));	
		
		assertEquals("message", ResultForMyListForTest2_2, myListForTest2_2);
		
	}
	
	@Test
	void test2_3() {
		
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
		
		
		List<String> myListForTest2_3 = new ArrayList<String>();
		myListForTest2_3 .add("Alpha");
		myListForTest2_3 .add("Bravo");
		myListForTest2_3 .add("Charlie");
		myListForTest2_3 .add("Delta");
		myListForTest2_3 .add("Echo");
		myListForTest2_3 .add("Foxtrot");
		myListForTest2_3 .add("Golf");
		
		Collections.rotate(myListForTest2_3.subList(1, 4), 2);
		
		List<String> ResultForMyListForTest2_3 = new ArrayList<String>( 
				Arrays.asList("Alpha","Charlie", "Delta", "Bravo","Echo", "Foxtrot", "Golf"));	
		
		assertEquals("message", ResultForMyListForTest2_3, myListForTest2_3);
		
	}
	
	@Test
	void test2_2Modified() {
		
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
		
		
		List<Integer> myListForTest2_2 = new ArrayList<Integer>();
		myListForTest2_2 .add(1);
		myListForTest2_2 .add(5);
		myListForTest2_2 .add(3);
		myListForTest2_2 .add(3);
		myListForTest2_2 .add(5);
		myListForTest2_2 .add(6);
		myListForTest2_2 .add(7);
		
		Collections.rotate(myListForTest2_2, 9);
		
		List<Integer> ResultForMyListForTest2_2 = new ArrayList<Integer>( 
				Arrays.asList(6, 7, 1, 5, 3, 3, 5));	
		
		assertEquals("message", ResultForMyListForTest2_2, myListForTest2_2);
		
	}


}
