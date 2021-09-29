package BaiTap1;

import java.util.Scanner;

public class GiaiBT1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);                        //35//
        System.out.print("Input number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }

	}


