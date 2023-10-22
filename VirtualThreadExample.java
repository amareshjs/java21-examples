public class VirtualThreadExample {
    public static void main(String[] args) {
        VirtualThread.create(() -> {
            System.out.println("Hello from a virtual thread!");
        });
    }
}
