import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamsEx3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		System.out.println("Gerando 100 n�meros aleat�rios:");
		IntStream.range(0, 99)
		.forEach(e -> System.out.print(gerador.nextInt()+" "));
		System.out.println();
		System.out.println("Gerando 10 n�meros aleat�rios:");
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			lista.add(gerador.nextInt());
		}
		Optional<Integer> maiorNumero = lista.stream()
				.max(Comparator.naturalOrder());
		System.out.println("Maior n�mero gerado: "+maiorNumero.get());
		Optional<Integer> menorNumero = lista.stream()
				.min(Comparator.naturalOrder());
		System.out.println("Menor n�mero gerado: "+menorNumero.get());
		Long quantidade = lista.stream()
				.count();
		System.out.println(quantidade);
	}

}
