package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Marcio");
		list.add("Marcos");
		list.add("Mauricio");
		list.add(2, "Laura");
		
		
		
		System.out.println(list.size());
		
				
		for (String x : list ) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		
		
		list.removeIf(x -> x.charAt(0) == 'L');
		
		for (String x : list ) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		
	}

}
