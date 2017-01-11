package gmail.yarnik75.Learners;

import java.util.Set;
import java.util.TreeMap;

public class Learner {
	private TreeMap <String, Integer[]> map = new TreeMap<String, Integer[]>();
	
	public void add(String name, int r1, int r2, int r3, int r4, int r5){
		Integer [] rating = {r1, r2, r3, r4, r5};
		map.put(name, rating);
	}
	
	public Set<String> view(){
		return map.keySet();
	}
}
