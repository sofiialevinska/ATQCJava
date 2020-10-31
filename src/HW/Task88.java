package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashSet;

public class Task88 {

    public static class Number {
        private static int n;
        private static String str;

        /**
         * Constructor Number
         */
        public Number() {
            this.n = n;
        }

        /**
         * a) Check if number n^2 contains digit 3
         */
        public void N2Contains3() {
            int n2 = n * n;
            String strn2 = Integer.toString(n2);
            if (strn2.contains("3")) {
                System.out.println("Number n^2 contains digit 3");
            } else {
                System.out.println("Number n^2 DOES NOT contain digit 3");
            }
        }

        /**
         * b) Print digits of n in the reverse direction
         */

        public void Reverse() {
            System.out.print("Digits of n in the reverse direction: ");
            while (n > 9) {
                int symbol = n - ((n / 10) * 10);
                n = n / 10;
                System.out.print(symbol);
            }
            System.out.println(n);
        }

        /**
         * c) Changed first and last digits in number n
         */

        public void ChangeFirstLastDigit() {
            System.out.print("Changed first and last digits in number n: ");
            str = Integer.toString(n);
            char[] chararr = new char[str.length()];
            chararr = str.toCharArray();
            if (chararr.length < 2) System.out.println(str);
            else {
                System.out.print(chararr[str.length() - 1]);
                for (int i = 1; i < str.length() - 1; i++) {
                    System.out.print(chararr[i]);
                }
                System.out.println(chararr[0]);
            }
        }

        /**
         * d) Add 1 in the beginning and in the end of number n
         */

        public void AddFirstLastDigit(int i) {
            System.out.print("Add 1 in the beginning and in the end of number n: ");
            System.out.print(i + str + i);
        }
    }


    public static void main(String[] args) throws IOException {

        /** Reading number n from Console */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter value for n: ");
        int n = Integer.parseInt(br.readLine());

        Number number = new Number();

        /** a) Check if number n^2 contains digit 3*/

        number.N2Contains3();

        /** b) Print digits of n in the reverse direction*/

        number.Reverse();

        /** c) Changed first and last digits in number n*/

        number.ChangeFirstLastDigit();

        /** d) Add 1 in the beginning and in the end of number n*/

        System.out.print("Add 1 in the beginning and in the end of number n: ");
        number.AddFirstLastDigit(1);
    }
}
