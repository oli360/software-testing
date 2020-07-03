

public class RandomComparator implements Comparable {

	public String name;
	public int compa;
	
	
	public RandomComparator(String name) {
		this.name=name;
		double firstRandomValue = Math.random();
		this.compa=((firstRandomValue<0.5)?1:-1);
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		
		double firstRandomValue = Math.random();

		//return ((firstRandomValue<0.5)?1:-1);
		return this.compa;
	}
	@Override
	public String toString()
	{
		return name;
		
	}
	
}
