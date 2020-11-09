/*
 * Copyright (c) Sofiia Levinska
 * This is homework for SoftServe CrashCourse "Automation QC Java 2020"
 */

package HW;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Task 1 from 19 October 2020
 *
 * @author Sofiia Levinska
 * @version 09 November 2020
 */

public class Task1Circle {

    /**
     * Method for reading Radius value from Console
     *
     * @return Circle radius in double type
     */
    private static double ReadRadius() throws Exception {
        System.out.print("Please enter radius: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double bf_radius = Double.parseDouble(bf.readLine());
        if (bf_radius < 0) {
            throw new Exception("n<0");
        }
        return bf_radius;
    }

    /**
     * Class Circle for calculating Circle Perimeter and area
     */
    private static class Circle {
        private static final double PI = 3.14;
        private final double radius;

        /**
         * Circle Constructor sets radius
         *
         * @param radius is a Circle radius.
         */
        private Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Method for calculating Circle Perimeter
         */
        private String CalculateCirclePerimeter() {
            return String.format("%.2f", 2 * PI * radius);
        }

        /**
         * Method for calculating Circle Area
         */
        private String CalculateCircleArea() {
            return String.format("%.2f", PI * radius * radius);
        }
    }

    public static void main(String[] args) {
        try {
            double radius = ReadRadius();
            Circle circle = new Circle(radius);
            System.out.println("Circle perimeter is " + circle.CalculateCirclePerimeter());
            System.out.println("Circle area is " + circle.CalculateCircleArea());
        } catch (Exception e) {
            System.err.println(e.getMessage() + ". Please enter radius>=0.");
        }
    }
}
