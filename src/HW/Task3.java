package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static class PhoneCall {
        private float c;
        private float t;
        public static int count=1;

        public PhoneCall () throws IOException {
            SetCallDetails();
            count++;
        }

        public void SetCallDetails () throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print ("Please enter cost of the call from country " + count + ": ");
            c = Float.parseFloat(bf.readLine());

            System.out.print ("Please enter time of the call with country " + count + ": ");
            t = Float.parseFloat(bf.readLine());
        }

        public float Cost () {
            return c*t;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("Please enter number of countries you want to call: ");
        int number = Integer.parseInt(bf.readLine());
        int SumCost = 0;

        PhoneCall [] CallCountry = new PhoneCall[number];

        for (int i =0; i< CallCountry.length; i++ )
        {
            CallCountry[i] = new PhoneCall();
            SumCost += CallCountry[i].Cost();
            System.out.println("Cost of call with country " + i+1 + " is " + CallCountry[i].Cost());
            System.out.println();
        }
        System.out.println("Cost of calls to all " + number + " countries is: " +SumCost);
        System.out.println("----------------------");

    }
}
