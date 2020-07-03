package MetamorphicTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class AutomatedTests {

	@Test
	void testMetamorphic1_1A_Automated() {
		
		for(int i=0;i<10000;i++) {
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
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			myListForTest1_1.add(MetamorphicHelper.rndChar());
			
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
			for(int y =0; y<myListForTest1_1.size(); y++) {
				myListForTest1_1.set(y,MetamorphicHelper.charInverter(myListForTest1_1.get(y)));
			}
			
			//invert list
			List<Character>  myResultForTest1_1 = new ArrayList<Character>();
			for(int y =1; y<=myListForTest1_1.size(); y++) {
				myResultForTest1_1.add(myListForTest1_1.get(myListForTest1_1.size()-y));
			}
			
			
			//assert that the sorted test list is equal to the created sorted list
			assertEquals("Test Failed at attempt:"+Integer.toString(i), myListForTest1_1Inverted, myResultForTest1_1);
			System.out.println("Test "+Integer.toString(i)+" Passed");
	
		}
	}

	@Test
	void test3_1MetamorphicB_Automated() {

		for(int test=0;test<10000;test++) {
			//Paramteters:
			
			//Size			:Multiple Data
			//Duplicates	:None
			//Nulls			:None
			//Type			:ArrayList
			//Data Type		:Character
			//Comparator 	:Object can be compared to each other in a coherent manner
			
				
			List<Character>  myListForTest = new ArrayList<Character>();

			for (int i =0;i<30;i++) {
				myListForTest.add(MetamorphicHelper.rndChar());
			}

			
			
			Character minFromCollection =Collections.min(myListForTest);
			//Character minFromCollectionMulti =(char) (minFromCollection*2);
			
			List<Character>  myListForTestWithRemoved = (List<Character>) MetamorphicHelper.removeRandomValues(myListForTest, 0.5);
			
			Character minFromCollectionWithRemoved =Collections.min(myListForTestWithRemoved);
			
			Assert.assertTrue("message", minFromCollection <= minFromCollectionWithRemoved);
			
			}
		}
}
