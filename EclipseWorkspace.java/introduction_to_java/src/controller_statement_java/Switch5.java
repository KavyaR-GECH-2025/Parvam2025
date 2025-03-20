package controller_statement_java;

public class Switch5 {
	public static void main(String[] args) {
		Object obj = 3;
		switch (obj) {
		case String s -> System.out.println("String Type");
		case Integer s -> System.out.println("Interger Type");
		default -> System.out.println("invalid");
		}
		}

}
