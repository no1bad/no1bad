package BT4p3;

import java.util.Scanner;

public class BaiTap4P3 {

	public static void main(String[] args) {

        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");                //3456789//

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}