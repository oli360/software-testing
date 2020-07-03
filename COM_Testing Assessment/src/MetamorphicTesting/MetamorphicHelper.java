package MetamorphicTesting;

import java.util.Collection;
import java.util.Iterator;

public class MetamorphicHelper {

	public static String wordInverter(String str) {
		String invertedWord="";
		
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i)<32 || str.charAt(i)==127) {
				throw new IllegalArgumentException("this input is not authorised") ;
			}
			invertedWord = invertedWord + (char)(79-(str.charAt(i) - 79));
        }
		
		return invertedWord;
	}
	
	public static char charInverter(char charr) {

		if (charr<32 || charr==127) {
			throw new IllegalArgumentException("this input is not authorised") ;
		}
			
		return (char)(79-(charr - 79));

	}
	
	public static Collection removeRandomValues(Collection coll,double ods) {
		Iterator i = coll.iterator();
		
		for (int y =0;y< coll.size();y++) {
			i.next();
			if (Math.random() <ods) {i.remove();}
		}
		
		return coll;
	}
	public static char rndChar () {
	    int rnd = (int) (Math.random() * 52); 
	    char base = 'a';
	    return (char) (base + rnd % 25);
	}
}
