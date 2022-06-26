package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		
		List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		
		IntStream mapToInt = collect.stream().mapToInt(val -> val);
		
	}
}