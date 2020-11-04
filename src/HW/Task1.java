package HW;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {

    /**
     * Method for reading Radius value from Console
     */
    public static double ReadRadius() throws Exception {
        System.out.print("Please enter radius: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double bf_radius = Double.parseDouble(bf.readLine());
        if (bf_radius < 0) {
            throw new Exception("n<0");
        }
        return bf_radius;
    }

    /**
     * Class Circle for creating Object Circle
     */
    public static class Circle {
        private final double PI = 3.14;
        private final double radius;

        /**
         * Circle Radius Setter
         */
        public Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Method for calculating Circle Perimeter
         */
        public String Perimeter() {
            return String.format("%.2f", 2 * PI * radius);
        }

        /**
         * Method for calculating Circle Area
         */
        public String Area() {
            return String.format("%.2f", PI * radius * radius);
        }
    }


    public static void main(String[] args) {
        try {
            double radius = ReadRadius();
            Circle circle = new Circle(radius);
            System.out.println("Circle perimeter is " + circle.Perimeter());
            System.out.println("Circle area is " + circle.Area());
        } catch (Exception e) {
            System.err.println(e.getMessage()+ ". Please enter radius>=0.");
        }
    }
}
