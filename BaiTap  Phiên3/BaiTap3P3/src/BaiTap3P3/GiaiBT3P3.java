package BaiTap3P3;

import java.util.Scanner;

public class GiaiBT3P3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");              //565//
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}
