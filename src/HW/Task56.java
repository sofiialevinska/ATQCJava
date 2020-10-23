package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Task56 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter brick dimensions");
        System.out.print("Width: ");
        double a = Double.parseDouble(bf.readLine());
        System.out.print("Height: ");
        double b = Double.parseDouble(bf.readLine());
        System.out.print("Thickness: ");
        double c = Double.parseDouble(bf.readLine());

        System.out.println("Please enter hole dimensions");
        System.out.print("Width: ");
        double x = Double.parseDouble(bf.readLine());
        System.out.print("Height: ");
        double y = Double.parseDouble(bf.readLine());

        Boolean bool = false;
        if ((a<=x & b<=y) | (a<=x & c<=y) | (b<=x & c<=y) | (b<=x & a<=y) | (c<=x & a<=y) | (c<=x & b<=y))
            bool = true;
        if (bool) System.out.println("Brick can enter the hole");
        else System.out.println("Brick can NOT enter the hole");

    }
}