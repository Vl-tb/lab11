import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public Map<Character, Long> groupIt(List<String> arr) {
        HashMap<Character, List<String>> first = arr
                .stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        HashMap::new,
                        Collectors.toList()
                    )
                );

        Map<Character, Long> second = first
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                    entry -> entry.getKey(),
                    entry -> entry.getValue()
                            .stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(""))
                            .chars()
                            .filter(ch -> ch == entry.getKey().charValue())
                            .count()
        ));
        return second;
    }
}
