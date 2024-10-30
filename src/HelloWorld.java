public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("Application interrupted.");
        }
    }
}
