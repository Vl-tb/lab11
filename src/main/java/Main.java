import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("abd", "asd", "bgf");
        GroupWordsTask obj = new GroupWordsTask();
        System.out.println(obj.groupIt(arr));
    }
}
