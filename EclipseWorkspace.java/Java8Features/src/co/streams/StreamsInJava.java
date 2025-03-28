package co.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(66);
		list.add(64);
		list.add(90);
		
		// to filter based on the add numbers and generate a list.
		
//		List<Integer> no = list.stream().filter((i) -> i%2 != 0).collect(Collectors.toList());
//		System.out.println(no);
//		
	
		Stream<Integer> stream = list.stream();
		List<Integer> no = stream.filter((i) -> i%2 != 0).collect(Collectors.toList());
		System.out.println(no);
		
		
	}

}
