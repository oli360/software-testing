package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.relation.RoleList;

import org.junit.jupiter.api.Test;

class TestMinMethod {
		
		//test 3_1 is designed to make sure the min method 
		//correctly identifies the min a list of char
	
		@Test
	void test3_1() {
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:None
		//Nulls			:None
		//Type			:ArrayList
		//Data Type		:Character
		//Comparator 	:Object can be compared to each other in a coherent manner
		
			
		List<Character>  myListForTest3_1 = new ArrayList<Character>();
		
		myListForTest3_1.add('s');
		myListForTest3_1.add('g');
		myListForTest3_1.add('s');
		myListForTest3_1.add('e');
		myListForTest3_1.add('t');
		myListForTest3_1.add('r');
		myListForTest3_1.add('q');
		
		Character minFromCollection3_1 =Collections.min(myListForTest3_1);
		
		Character expectedMinFromCollection3_1 ='e';
		
		
		
		assertEquals("message", expectedMinFromCollection3_1, minFromCollection3_1);
		}
	
		
		//Test3_2 
		@Test
	void test3_2() {
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:Multiple
		//Nulls			:one
		//Type			:ArrayList
		//Data Type		:Integer
		//Comparator 	:Object can be compared to each other in a coherent manner
		
			
		ArrayDeque<Integer>  myListForTest3_2 = new ArrayDeque<Integer>();
		
		myListForTest3_2.add(8);
		myListForTest3_2.add(3);
		myListForTest3_2.add(4);
		myListForTest3_2.add(null);
		myListForTest3_2.add(2);
		myListForTest3_2.add(43);
		myListForTest3_2.add(2);
		
		Collections.min(myListForTest3_2);
		
		ArrayDeque<Integer> ResultForMyListForTest3_1 = new ArrayDeque<Integer>();	
		myListForTest3_2.add(2);
		
		
		assertEquals("message", ResultForMyListForTest3_1, myListForTest3_2);
		}
		
	
	
		@Test
	void test3_3() {
		//Paramteters:
		
		//Size			:Multiple Data
		//Duplicates	:Multiple
		//Nulls			:None
		//Type			:ArrayList
		//Data Type		:StringWithId
		//Comparator 	:Object can be compared to each other in a coherent manner
		
			
		List<StringWithId> myListForTest3_3 = new ArrayList<StringWithId>();
		myListForTest3_3.add(new StringWithId("this",31));
		myListForTest3_3.add(new StringWithId("is",92));
		myListForTest3_3.add(new StringWithId("the",36));
		myListForTest3_3.add(new StringWithId("solution",10));
		myListForTest3_3.add(new StringWithId("to",57));
		myListForTest3_3.add(new StringWithId("all",46));
		myListForTest3_3.add(new StringWithId("yes",17));
		myListForTest3_3.add(new StringWithId("hello",78));
		myListForTest3_3.add(new StringWithId("no",9));
		myListForTest3_3.add(new StringWithId("solution",64));
		myListForTest3_3.add(new StringWithId("maybe",111));
		myListForTest3_3.add(new StringWithId("all",12));
		myListForTest3_3.add(new StringWithId("maybe",13));
		
		int idOfMin = Collections.min(myListForTest3_3).getId();
		
		
		int ResultForMyListForTest3_1 = 46;
		
		assertEquals("message", ResultForMyListForTest3_1,idOfMin );
		}
	
	

}
