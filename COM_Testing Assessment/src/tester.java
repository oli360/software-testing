import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import TestCases.StringWithId;
import MetamorphicTesting.MetamorphicHelper;
public class tester {

	public static void main(String[] args) {
		List<Character> myListForTest2_1 = new ArrayList<Character>();
		myListForTest2_1 .add('a');
		myListForTest2_1 .add('b');
		myListForTest2_1 .add('c');
		myListForTest2_1 .add('e');
		myListForTest2_1 .add('f');
		myListForTest2_1 .add('g');
		myListForTest2_1 .add('h');
		
		Collections.rotate(myListForTest2_1, 4);
		
		
		System.out.println(MetamorphicHelper.wordInverter("vrxjoeq"));

	}



}
