package com.ComparatorInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class funInterface implements Comparator<Integer>{
	

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	
	}
}

public class ComparatorInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(2);
		list.add(34);
		list.add(4);
		Collections.sort(list, (o1, o2) -> o2 - o1);          // lambda expressions
		Collections.sort(list, (o1, o2) -> o1 - o2);            //ascending order
		Collections.sort(list, (a,b)->b-a);

//		Collections.sort(list,new funInterface());
		System.out.println(list);
	}
	

}
