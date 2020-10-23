package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter radius: ");
        double radius = Double.parseDouble(bf.readLine());
        double pi = 3.14;

        System.out.println("Circle perimeter is " + (2*pi*radius));
        System.out.println("Circle area is: " + pi*radius*radius);

    }
}
