package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    /**
     * Method for reading Radius value from Console
     */
    public static double ReadRadius() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bf.readLine());
    }

    /**
     * Class Circle for creating Object Circle
     */
    public static class Circle {
        private final double pi = 3.14;
        private final double radius;

        /**
         * Circle Radius Setter
         */
        public Circle (double radius) {
            this.radius = radius;
        }

        /**
         * Method for calculating Circle Perimeter
         */
        public String Perimeter () {
            return String.format("%.2f", 2 * pi * radius);
        }

        /**
         * Method for calculating Circle Area
         */
        public String Area() {
            return String.format("%.2f", pi * radius * radius);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter radius: ");
        double radius = ReadRadius();

        Circle circle = new Circle(radius);
        System.out.println("Circle perimeter is " + circle.Perimeter());
        System.out.println("Circle area is " + circle.Area());

    }
}
