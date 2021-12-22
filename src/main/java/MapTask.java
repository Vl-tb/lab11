import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> list) {
        return list.stream().filter(x -> x.matches("[0-9]+")).map(Integer::parseInt).collect(Collectors.toList());
    }
}