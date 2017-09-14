package Collection;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestExample1 {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x).parallel());

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        temp.flatMap(a -> Arrays.stream(a));
        
        stream.forEach(System.out::println);
        
		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/

    }

}