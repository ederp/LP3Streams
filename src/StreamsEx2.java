import java.util.Arrays;
import java.util.List;

public class StreamsEx2 {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		lista.stream()
		.filter(e -> e % 2 == 0)
		.skip(2)
		.limit(2)
		.map(e -> e * 2)
		.forEach(e -> System.out.print(e+" "));
	}

}
