package dataStructure.array.max;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator<String> itr=al.iterator();
		System.out.println("aa");
		while(itr.hasNext()) {
			itr.next();
			al.add("A");
			System.out.println("added");
		}
System.out.println(al);
	}

}
