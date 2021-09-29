package BaiTap2;

import java.util.Scanner;

public class GiaiBT2P3 {

	public static void main(String[] args) {
		double i,m;
	     Scanner input= new Scanner(System.in);
	     System.out.println("Enter a value for inch:");
	     i =input.nextDouble();
	     m= i/39.37;
	     System.out.println("Value in meter is:" + m);
	    }
}