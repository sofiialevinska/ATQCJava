package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static class Person {

        private static String name;
        private static String address;

        public static void ReadFromConsole() throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is your name?");
            name = bf.readLine();
            System.out.println("Where are you live, " + name + "?");
            address = bf.readLine();
        }

        public static void WriteToConsole() {
            System.out.println(name + " you live in " + address);
        }
    }
    public static void main(String[] args) throws IOException {
    Person readwrite = new Person();
    readwrite.ReadFromConsole();
    readwrite.WriteToConsole();
    }
}
