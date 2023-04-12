/*how to sort the data*/
/*(2,Programming) (3, Databases) (4,ETL) (1,Docker) (5,Cloue)*/

import java.util.Set;
import java.util.TreeMap;

public class Demo6 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree= new  TreeMap<Integer, String>();
		tree.put(2, "Programming");
		tree.put(3, "Database");
		tree.put(4, "ETL");
		tree.put(1, "Docker");
		tree.put(5, "cloud");
		
		Set<Integer> str= tree.keySet();
		
		for( Integer i: str) {
			System.out.println("Keys"+" "+ i);
			System.out.println("Values"+" "+ tree.get(i));
		}
	}

}
