package HW;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {

    /**
     * Class Person
     */
    public static class Person {

        private static String name;
        private static String address;

        /**
         * Method for reading name and address from Console
         */
        public void ReadFromConsole() throws Exception {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("What is your name? ");
            name = bf.readLine();

            /* Checking for exceptions in name value*/
            if (name.isEmpty()) {
                throw new Exception("The field is empty. Please enter your name.");
            }
            if (name.matches(".*\\d+.*")) {
                throw new Exception("Name contains numbers. Please check if the name was entered correctly.");
            }

            System.out.println("Where are you live, " + name + "?");
            address = bf.readLine();

            /* Checking for exceptions in address value*/
            if (address.isEmpty()) {
                throw new Exception("The field is empty. Please enter your address.");
            }
        }

        /**
         * Method for writing message with name and address to Console
         */
        public void WriteToConsole() {
            System.out.println(name + " you live in " + address);
        }
    }

    public static void main(String[] args) {
        boolean trueSign = false;
        do {
            try {
                Person person = new Person();
                person.ReadFromConsole();
                person.WriteToConsole();
                trueSign = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (!trueSign);
    }
}
