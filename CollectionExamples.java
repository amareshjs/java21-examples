import java.util.Arrays;
import java.util.List;

public class CollectionExamples {

    public static void main(String[] args) {
        // RemoveIf example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println(numbers); // Prints [1, 3, 5]

        // ReplaceAll example
        numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.replaceAll(n -> n * n);

        System.out.println(numbers); // Prints [1, 4, 9, 16, 25]

        // Merge example
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(4, 5, 6);

        List<Integer> mergedNumbers = List.merge(numbers1, numbers2, (a, b) -> a + b);

        System.out.println(mergedNumbers); // Prints [1, 2, 3, 4, 5, 6]

        // Of example
        List<String> names = List.of("John", "Mary", "Alice");

        System.out.println(names); // Prints [John, Mary, Alice]

        // CopyOf example
        names = Arrays.asList("John", "Mary", "Alice");

        List<String> copyOfNames = List.copyOf(names);

        System.out.println(copyOfNames); // Prints [John, Mary, Alice]
    }
}
