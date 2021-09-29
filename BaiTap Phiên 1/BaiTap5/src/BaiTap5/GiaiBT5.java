package BaiTap5;

import java.util.Scanner;

public class GiaiBT5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");                                     //YOYO//	
        double x = in.nextDouble();                                                           //25 ;78 ; 87//
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");//Chúng giống nhau đến ba chữ số thập phân; dảk quá//
        }
        else
        {
            System.out.println("They are different");
        }
    }
}