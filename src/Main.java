import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("rafael", "yasmin", "yasmin", "meg", "nutella", "nutella");

        palavras.stream()
                .distinct()
                .forEach(System.out::println);
    }
}