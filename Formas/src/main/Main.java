package main;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Colección
		List<User> users = new ArrayList<>();
		Stream<User> stream = users.stream(); //Abstracción
		
		//Stream
		Stream<User> filter = stream.filter(user -> user.getAge() > 18);
		System.out.println(filter);
		
		//Arreglo
		int[] numbers = { 1,2,3,4 };
		Stream numbersS = Stream.of(numbers);
		
		//Secuencia
		Stream names = Stream.of("Codi 1", "Codi 2", "Codi 3");
	
	}

}
