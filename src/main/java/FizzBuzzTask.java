import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public List<String> fizzBuzzIt(int n) {
        return IntStream
                .range(1, n+1)
                .mapToObj(i -> {
                    if (i % 15 == 0) return "FizzBuzz";
                    else if (i % 3 == 0) return "Fizz";
                    else if (i % 5 == 0) return "Buzz";
                    return Integer.toString(i);
                }).collect(Collectors.toList());
    }
}
