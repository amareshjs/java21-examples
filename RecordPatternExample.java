public class RecordPatternExample {
  public static void main(String[] args) {
    record Person(String name, int age) {}

    Person person = new Person("John Doe", 42);

    switch (person) {
      case Person(String name, int age):
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        break;
    }
  }
}
