// UC6: Display Hello with multiple command-line arguments using substring
public class HelloApp {
    public static void main(String[] args) {

        // check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // create StringBuilder
            StringBuilder nameBuilder = new StringBuilder();

            // loop through arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // remove last ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}