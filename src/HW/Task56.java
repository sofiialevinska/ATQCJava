package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Task56 {

    /** Class for creating Object Brick and checking whether Brick can enter hole*/
    public static class Brick {

        private double a;
        private double b;
        private double c;
        private double x;
        private double y;
        private Boolean bool = false;

        /** Constructor for creating Object Brick with a,b,c dimensions */

        public Brick ( double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        /** Method for setting dimensions x,y of the hole*/
        public void Hole (double x, double y) {
            this.x = x;
            this.y = y;
        }

        /** Method for checking whether Brick can enter hole*/
        public void PassHole () {
            if ((a<=x & b<=y) || (a<=x & c<=y) || (b<=x & c<=y) ||
                    (b<=x & a<=y) || (c<=x & a<=y) || (c<=x & b<=y))
            { bool = true; }
            if (bool) System.out.println("Brick can enter the hole");
            else System.out.println("Brick can NOT enter the hole");
        }
    }

    public static void main(String[] args) throws IOException {

       /** Read a,b,c,x,y from Console*/

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

        /** Create object brick and set hole dimentions */

        Brick brick = new Brick (a,b,c);
        brick.Hole(x,y);

        /** Run method PassHole that checks wheather brick can pass the hole */
        brick.PassHole();

    }
}