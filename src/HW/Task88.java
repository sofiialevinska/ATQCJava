package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashSet;

public class Task88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter value for n: ");
        int n = Integer.parseInt(br.readLine());
        int nc= n;

        char c;

        /** a) Check if number n^2 contains digit 3*/

        int n2= n*n;
        String str = Integer.toString(n2);
        if (str.contains("3")) System.out.println("Number n^2 contains digit 3");
        else System.out.println("Number n^2 DOES NOT contain digit 3");

        /** b) Print digits of n in the reverse direction*/
        System.out.print("Digits of n in the reverse direction: ");
        while (n>9) {
            int symbol = n-((n/10)*10);
            n=n/10;
            System.out.print(symbol);
        }
        System.out.println(n);

        /** c) Changed first and last digits in number n*/

        System.out.print("Changed first and last digits in number n: ");
        String strn= Integer.toString(nc);
        char [] chararr = new char[strn.length()];
        chararr = strn.toCharArray ();
        if (chararr.length<2) System.out.println(strn);
        else {
            System.out.print(chararr[strn.length() - 1]);
            for (int i = 1; i < strn.length() - 1; i++) {
                System.out.print(chararr[i]);
            }
            System.out.println(chararr[0]);
        }

        /** d) Add 1 in the beginning and in the end of number n*/

        System.out.print("Add 1 in the beginning and in the end of number n: ");
        System.out.print("1"+strn+"1");
    }
}
