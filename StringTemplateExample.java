public class StringTemplateExample {

    public static void main(String[] args) {
        String name = "John Doe";
        String formattedDate = StringTemplate.of("$name{dd MMM yyyy}", "name", name);

        System.out.println(formattedDate); // Prints "John Doe 22 Oct 2023"
    }
}
