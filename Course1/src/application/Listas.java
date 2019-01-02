package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Adriano");
		list.add("Carlos");
		list.add(0, "Daniel");
		
		System.out.println(list.size());
		
		list.remove("Maria");
		
		for (String o : list) {
			System.out.println(o);
		}
		System.out.println("------------------------------");
		System.out.println("Index of Carlos: " + list.indexOf("Carlos"));
		List<String> resultado = list.stream().filter(o -> o.charAt(0) == 'A').collect(Collectors.toList());
		
		
		

	}

}
