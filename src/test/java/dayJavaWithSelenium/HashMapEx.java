package dayJavaWithSelenium;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	static HashMap<String,String>hmap=new HashMap<String,String>();
	static Hashtable<String, String>ht=new Hashtable<String, String>();
	//HashTable/HashMAP
	public static void main(String[] args) {
		hmap.put("Name", "abc");
		hmap.put("age", "abc1");
		hmap.put("data", "abc2");
		hmap.put(null, "abc3");
		ht.put(null, null);
		System.out.println(hmap);
		
		
		
		for (String mp1 : hmap.keySet()) {
			System.out.println(hmap.get(mp1));
		}
		
			}

}
