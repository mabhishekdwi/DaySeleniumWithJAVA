package dayJavaWithSelenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		
		
		HashSet<Integer>st = new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(1);
		for (Integer value : st) {
			System.out.println(value);
			
		}
		Iterator<Integer>it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
