// UC6: Display Hello with multiple command-line arguments
class HelloApp {
    public static void main(String[] args) {

        // check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // create StringBuilder to store names
            StringBuilder nameBuilder = new StringBuilder();

            // enhanced for loop to append names
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // remove trailing ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);

                // print final greeting
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}