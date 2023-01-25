package pacote;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(-3, -10, 4, 7, 12, 16);
		
		OptionalInt obj = stream.max();
		
		if (obj.isPresent()) {
			System.out.println(obj.getAsInt());
		} else {
			System.out.println("-1");
		}

	}

}
