package co.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","four");
		List<String> new_list = list.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(new_list);
	}
}