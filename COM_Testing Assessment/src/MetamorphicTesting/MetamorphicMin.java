package MetamorphicTesting;

import static org.junit.Assert.assertEquals;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import TestCases.StringWithId;

class MetamorphicMin {


	@Test
void test3_1MetamorphicA() {
	//Paramteters:
	
	//Size			:Multiple Data
	//Duplicates	:None
	//Nulls			:None
	//Type			:ArrayList
	//Data Type		:Character
	//Comparator 	:Object can be compared to each other in a coherent manner
	
		
	List<Character>  myListForTest = new ArrayList<Character>();
	
	myListForTest.add('s');
	myListForTest.add('g');
	myListForTest.add('s');
	myListForTest.add('e');
	myListForTest.add('t');
	myListForTest.add('r');
	myListForTest.add('q');
	
	Character minFromCollection =Collections.min(myListForTest);
	Character minFromCollectionMulti =(char) (minFromCollection*2);
	
	List<Character>  myListForTestMultiplied = new ArrayList<Character>();
	
	myListForTestMultiplied.add((char) ('s'*2));
	myListForTestMultiplied.add((char) ('g'*2));
	myListForTestMultiplied.add((char) ('s'*2));
	myListForTestMultiplied.add((char) ('e'*2));
	myListForTestMultiplied.add((char) ('t'*2));
	myListForTestMultiplied.add((char) ('r'*2));
	myListForTestMultiplied.add((char) ('q'*2));
	
	Character minFromCollectionMultiplied =Collections.min(myListForTestMultiplied);
	
	
	
	assertEquals("message", minFromCollectionMulti, minFromCollectionMultiplied);
	}

	@Test
void test3_2MetamorphicA() {
	//Paramteters:
	
	//Size			:Multiple Data
	//Duplicates	:Multiple
	//Nulls			:one
	//Type			:ArrayList
	//Data Type		:Integer
	//Comparator 	:Object can be compared to each other in a coherent manner
	
		
	ArrayDeque<Integer>  myListForTest = new ArrayDeque<Integer>();
	
	myListForTest.add(8);
	myListForTest.add(3);
	myListForTest.add(4);
	//myListForTest.add(null);
	myListForTest.add(2);
	myListForTest.add(43);
	myListForTest.add(2);
	
	int minOftest = Collections.min(myListForTest);
	
	
	ArrayDeque<Integer>  myListForTestMultiplied = new ArrayDeque<Integer>();
	
	myListForTestMultiplied.add(8*2);
	myListForTestMultiplied.add(3*2);
	myListForTestMultiplied.add(4*2);
	//myListForTestMultiplied.add(null);
	myListForTestMultiplied.add(2*2);
	myListForTestMultiplied.add(43*2);
	myListForTestMultiplied.add(2*2);
	
	int minOftestMultiplied = Collections.min(myListForTestMultiplied);
	
	
	
	
	assertEquals("message", minOftestMultiplied, minOftest*2);
	}
	
	
//void test3_3MetamorphicA()
	// not possoble beacus impossible to multiply a String

	@Test
void test3_1MetamorphicB() {
	//Paramteters:
	
	//Size			:Multiple Data
	//Duplicates	:None
	//Nulls			:None
	//Type			:ArrayList
	//Data Type		:Character
	//Comparator 	:Object can be compared to each other in a coherent manner
	
		
	List<Character>  myListForTest = new ArrayList<Character>();
	
	myListForTest.add('s');
	myListForTest.add('g');
	myListForTest.add('s');
	myListForTest.add('e');
	myListForTest.add('t');
	myListForTest.add('r');
	myListForTest.add('q');
	
	Character minFromCollection =Collections.min(myListForTest);
	//Character minFromCollectionMulti =(char) (minFromCollection*2);
	
	List<Character>  myListForTestWithRemoved = (List<Character>) MetamorphicHelper.removeRandomValues(myListForTest, 0.5);
	
	Character minFromCollectionWithRemoved =Collections.min(myListForTestWithRemoved);
	
	Assert.assertTrue("message", minFromCollection <= minFromCollectionWithRemoved);
	
	}

	@Test
void test3_2MetamorphicB() {
	//Paramteters:
	
	//Size			:Multiple Data
	//Duplicates	:Multiple
	//Nulls			:one
	//Type			:ArrayList
	//Data Type		:Integer
	//Comparator 	:Object can be compared to each other in a coherent manner
	
		
	ArrayDeque<Integer>  myListForTest = new ArrayDeque<Integer>();
	
	myListForTest.add(8);
	myListForTest.add(3);
	myListForTest.add(4);
	//myListForTest.add(null);
	myListForTest.add(2);
	myListForTest.add(43);
	myListForTest.add(2);
	
	int minOftest = Collections.min(myListForTest);
		
	ArrayDeque<Integer>  myListForTestWithRemoved =(ArrayDeque<Integer>) MetamorphicHelper.removeRandomValues(myListForTest, 0.5);
	
	
	int minOftestMultiplied = Collections.min(myListForTestWithRemoved);
	
	
	
	
	Assert.assertTrue("message", minOftest <= minOftestMultiplied);
	}

	@Test
void test3_3MetamorphicB() {
	//Paramteters:
	
	//Size			:Multiple Data
	//Duplicates	:Multiple
	//Nulls			:None
	//Type			:ArrayList
	//Data Type		:StringWithId
	//Comparator 	:Object can be compared to each other in a coherent manner
	
		
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
	myListForTest.add(new StringWithId("all",12));
	myListForTest.add(new StringWithId("maybe",13));
	
	String MinofTest = Collections.min(myListForTest).getString();
	
	List<StringWithId>  myListForTestWithRemoved =(List<StringWithId>) MetamorphicHelper.removeRandomValues(myListForTest, 0.5);
	
	String MinOfTestWithRemoved = Collections.min(myListForTest).getString();
	
	Assert.assertTrue("message", MinofTest.compareTo(MinOfTestWithRemoved) <= 0);
	}	
}
