package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("What is your name?");
        String name = bf.readLine();
        System.out.println ("Where are you live, " + name + "?");
        String address = bf.readLine();

        System.out.println(name + " you live in " + address);
    }
}
