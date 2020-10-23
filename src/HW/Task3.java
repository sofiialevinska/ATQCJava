package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("Please enter cost of the call from country1: ");
        float c1 = Float.parseFloat(bf.readLine());
        System.out.print ("Please enter cost of the call from country2: ");
        float c2 = Float.parseFloat(bf.readLine());
        System.out.print ("Please enter cost of the call from country3: ");
        float c3 = Float.parseFloat(bf.readLine());

        System.out.print ("Please enter time of the call with country1: ");
        float t1 = Float.parseFloat(bf.readLine());
        System.out.print ("Please enter time of the call with country2: ");
        float t2 = Float.parseFloat(bf.readLine());
        System.out.print ("Please enter time of the call with country3: ");
        float t3 = Float.parseFloat(bf.readLine());

        System.out.println("Cost of call with country1 is " +c1*t1);
        System.out.println("Cost of call with country2 is " +c2*t2);
        System.out.println("Cost of call with country3 is " +c3*t3);

        System.out.println("Cost of call with country1, country2 and country3  is " +(c1*t1+c2*t2+c3*t3));

    }
}
