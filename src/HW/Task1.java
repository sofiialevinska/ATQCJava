package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static double ReadRadius () throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(bf.readLine());
        return radius;
    }

    public static class Circle {
        private double pi = 3.14;
        private double radius;

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void Perimeter () {
            System.out.println("Circle perimeter is " + String.format("%.2f",2*pi*radius));
        }

        public void Area () {
            System.out.println("Circle area is " + String.format("%.2f",pi*radius*radius));
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter radius: ");
        double radius = ReadRadius();

        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.Perimeter();
        circle.Area();
    }
}
