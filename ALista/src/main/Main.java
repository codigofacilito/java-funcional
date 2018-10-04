package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Obtener todos los usuarios que tengan una edad mayor a 18.
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		
		List<User> newUsers = users.stream()
									.filter(user -> user.getAge() > 18)
									.collect( Collectors.toList() );
		
		System.out.println(newUsers);
	}		
}
