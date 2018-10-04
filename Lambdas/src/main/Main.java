package main;

public class Main {

	public static void main(String[] args) {
		//El compilador infiere el tipo de los parametros.
		//Podemos modificar el nombre de los parametros.
		//Siempre que tengamos un solo parametro podemos omitir el uso de parentesis.
		//Siempre que se ejecute una unica sentencia podemos omitir el uso de llaves.
		
		ISaludar saludar = nombre -> System.out.println("Hola Mundo " + nombre); 
		saludar.Saluda("Codi");
		
		ISuma suma = (val1, val2) -> val1 + val2;//return
		int resultado = suma.suma(10, 20);
		System.out.println(resultado);
		
		suma = (val1, val2) -> {
		
			int result = val1 + val2;
			System.out.println("El resultado dentro de la expresión es :" + result);
			return result;
			
		};
		
		resultado = suma.suma(100, 200);
		System.out.println(resultado);
		
	}
	
}
