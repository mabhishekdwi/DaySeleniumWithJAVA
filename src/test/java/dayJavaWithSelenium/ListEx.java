package dayJavaWithSelenium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String>lst=new ArrayList<String>();
		LinkedList<String>lst=new LinkedList<String>();
		
		lst.add("abc");
		lst.add("abc1");
		lst.add("abc2");
		for (String str : lst) {
			System.out.println(str);
		}
		System.out.println("index 1---"+lst.get(1)+"lst size is --"+lst.size());
		System.out.println("---------------------");
		lst.add(1, null);
		for (String str : lst) {
			System.out.println(str);
		}
		
		System.out.println("after adding size is --"+lst.size());
	}
	

}
