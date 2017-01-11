package gmail.yarnik75.AutoOwnerDirectory;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AutoOwnerDirectory {
	private TreeMap <String, String> map = new TreeMap<String, String>();
	
	public void add(String k, String v){
		map.put(k, v);
	}
	
	public void deleteKey(String k){
		if (map.containsKey(k)){
			map.remove(k);
		}else {
			System.out.printf("Number %s is not in this directory", k);
			System.out.println();
		}
	}	
	
	public void changeKey(String k, String v){
		if(map.containsKey(k)){
			map.put(k, v);
		}else {
			System.out.printf("Number %s is not in this directory", k);
			System.out.println();
		}
	}
	
	public String foundKey(String k){
		return map.get(k);
	}
	
	public void printDirectory(){
		Iterator <Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<String, String> me = (Map.Entry<String, String>)it.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}
	
}
