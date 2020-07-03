package TestCases;

import java.util.Comparator;
import java.util.List;

//myClass is created to create string values with id numbers

//This class is created to test the placement of duplicate values
//This class is the same as a string value however every 
//string has an ID attached to it
//this ID allows to very where duplicates strings are placed 
//within a list


public class StringWithId implements Comparable{

	private final String string;
	private final int id;
	
	//class contructor takes a string value and a id number
	public StringWithId(String string,int id) {
		this.id=id;
		this.string=string;
	}
	


	public String getString() {
		return string;
	}
	public int getId() {
		return id;
	}

	//static method used to recover the ID list from a List of StringWithID
	//this method is usefull when trying to compare List of StringWithID
	static public int[] getListId(List<StringWithId> list) {
		int[] result= new int[list.size()];
		int i =0;
		for (StringWithId input:list) {
			result[i]=input.id;
			i++;
		}
		return result;
	}
	
	//static method used to compar two list of StringWithId
	static public boolean isListEqual(List<StringWithId> list1,List<StringWithId> list2) {
		if (list1.size()!=list2.size()) {
			return false;
		}
		int i =0;
		for (StringWithId input:list1) {
			if (list1.get(i).id!=list2.get(i).id) {
				return false;
			}
		}
		return true;
		
	}
	
	// this class compares the two String with each other
	//throws ClassCastException if input is not a StringWithId
	@Override
	public int compareTo(Object o) {
		try {
			StringWithId ensureInputisStringWIthID = (StringWithId)o;
		}
		catch (ClassCastException e) {
			throw e;
		}
		
		return string.compareTo(o.toString());
	}


	@Override
	public String toString() {
		return string;
	}

}
