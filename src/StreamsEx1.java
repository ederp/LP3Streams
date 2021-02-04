import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamsEx1 {

	public StreamsEx1(Integer entrada) {
		super();
		List<Integer> lista = new ArrayList<>();
		
		// Gere uma lista com n�meros de 1 a n duplicados (1,1,2,2,3,3...)
		/*
		for(int i = 0; i <=entrada; i++) {
			lista.add(i);
			lista.add(i);
		}
		*/
		IntStream.range(1, entrada + 1).forEach(lista::add);
		lista.addAll(lista);
		Collections.sort(lista);
		// Mostre todos os n�meros
		lista.stream()
		.forEach(e -> System.out.print(e+" "));
		System.out.println();
		// Mostre todos os n�meros sem repeti��o
		lista.stream()
		.distinct()
		.forEach(e -> System.out.print(e+" "));
		System.out.println();
		// Mostre todos os n�meros �mpares sem repeti��o
		lista.stream()
		.distinct()
		.filter(e -> e % 2 == 1)
		.forEach(e -> System.out.print(e+" "));
		System.out.println();
		// Mostre todos os n�meros pares sem repeti��o
		lista.stream()
		.distinct()
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.print(e+" "));
		System.out.println();
		// Mostre todos os n�meros a partir do 5 algarismo sem repeti��o
		lista.stream()
		.distinct()
		.skip(4)
		.forEach(e -> System.out.print(e+" "));
		System.out.println();
		// Mostre todos os n�meros multiplicados por 4
		lista.stream()
		.map(e -> e * 4)
		.forEach(e -> System.out.print(e+" "));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero para o limite da lista: ");
		new StreamsEx1(sc.nextInt());
		sc.close();
	}
	
}
