package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    /**
     * Class PhoneCall
     */
    public static class PhoneCall {
        private float c;
        private float t;
        public static int count = 1;

        /**
         * Constructor with setting cost and time of phone call to Object and counting number of Objects that are created
         */
        public PhoneCall() throws IOException {
            SetCallDetails();
            count++;
        }

        /**
         * Method for reading cost and time of phone call from Console
         */
        public void SetCallDetails() throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please enter cost of the call from country " + count + ": ");
            c = Float.parseFloat(bf.readLine());

            System.out.print("Please enter time of the call with country " + count + ": ");
            t = Float.parseFloat(bf.readLine());
        }

        /**
         * Method for calculating cost of phone call
         */
        public float Cost() {
            return c * t;
        }

    }

    public static void main(String[] args) throws IOException {

        /** Reading number of calls from Console*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of countries you want to call: ");
        int number = Integer.parseInt(bf.readLine());
        int SumCost = 0;


        /** Creating array with Objects PhoneCall with details about each PhoneCall*/
        PhoneCall[] CallCountry = new PhoneCall[number];

        for (int i = 0; i < CallCountry.length; i++) {
            CallCountry[i] = new PhoneCall();
            SumCost += CallCountry[i].Cost();

            /** Calculating Cost of each Phone Call*/
            System.out.println("Cost of call with country " + i + 1 + " is " + CallCountry[i].Cost());
            System.out.println();
        }

        /** Calculating Cost of all Phone Calls*/
        System.out.println("Cost of calls to all " + number + " countries is: " + SumCost);
        System.out.println("----------------------");
    }
}
