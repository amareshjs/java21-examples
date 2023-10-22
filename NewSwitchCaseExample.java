public class NewSwitchCaseExample {

  public static void main(String[] args) {
    int number = 15;

    switch (number) {
      case 1..10:
        System.out.println("The number is between 1 and 10.");
        break;
      case 11..20:
        System.out.println("The number is between 11 and 20.");
        break;
      default:
        System.out.println("The number is outside the range of 1 to 20.");
    }
  }
}
