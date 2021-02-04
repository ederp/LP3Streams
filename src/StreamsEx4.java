import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsEx4 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		System.out.print("Nomes que começam com a letra 'P': ");
		lista.stream()
			.filter(e -> e.startsWith("P"))
			.forEach(e -> System.out.print(e+" "));
		System.out.println("\nNomes dos clientes por tamanho: ");
		Map <Integer, List<String>> mapa = lista.stream()
				.collect(Collectors.groupingBy(e -> e.length()));
		System.out.print(mapa);
		System.out.println("\nNomes que começam ou não com a letra 'A': ");
		Map <Boolean, List<String>> mapa2 = lista.stream()
				.collect(Collectors.groupingBy(e -> e.startsWith("A")));
		System.out.print(mapa2);
		System.out.println("\nNomes agrupados por tamanho: ");
		//não está agrupado por tamanho
		String agrupamento = lista.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(agrupamento);
	}

}
