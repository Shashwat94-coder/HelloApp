// UC7: Display Hello using String.join()
public class HelloApp {
    public static void main(String[] args) {

        // check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // join all names with ", "
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}