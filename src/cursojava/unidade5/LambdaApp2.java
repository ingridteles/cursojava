package cursojava.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp2 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		// Expressão Lambda
		integers.forEach((Integer x) -> {
			x = x + 10;
			System.out.println(x);
			});
	}
}
