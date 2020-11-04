package HW;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionTask1 {

    /**
     * Class for creating Rectangle object
     */
    public static class Rectangle {
        private int a;
        private int b;

        /**
         * Method for reading Rectangle's dimensions a,b from Console
         */
        public void ReadABFromConsole() throws Exception {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter rectangle dimensions.");
            System.out.print("a = ");
            a = Integer.parseInt(bf.readLine());
            System.out.print("b = ");
            b = Integer.parseInt(bf.readLine());

            /* Checking whether a or b is negative and throwing Exception*/
            if ((a < 0) || (b < 0)) {
                throw new Exception("Value is negative.");
            }
            bf.close();
        }

        /**
         * Method for calculating Rectangle's Area
         */
        public int squareRectangle() {
            return a * b;
        }
    }

    public static void main(String[] args) {
        boolean TrueMark = false;
        do {
            try {
                Rectangle rectangle = new Rectangle();
                rectangle.ReadABFromConsole();
                System.out.println("Rectangle area is: " + rectangle.squareRectangle());
                TrueMark = true;
            } catch (Exception e) {
                System.err.println(e.getMessage() + ". Please try again");
            }
        } while (!TrueMark);
    }
}
