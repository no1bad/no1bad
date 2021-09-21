package giaiptbac2;

import java.util.Scanner;

public class GiaiPTBac2 {
	       public static void main(String[] args){
	          Scanner sc=new Scanner(System.in);
	           System.out.println("Nhap tham so a:");
	           float a=sc.nextFloat();
	           System.out.println("Nhap tham so b:");
	           float b=sc.nextFloat();
	           System.out.println("Nhap tham so c:");
	           float c=sc.nextFloat();
	           if (a==0){      //Nếu a==0 thì phương trình sẽ trở thành phuong trình bậc 1 dưới dạng y=bx+c
	               if (b == 0){    //nếu b==0 thì
	                    if (c == 0){    //nếu c==0 thì
	                    System.out.println("Phuong trinh y=bx+c vo so nghiem");
	                    }
	                    else{       //nếu không thì (nếu (c!=0) thì)
	                    System.out.println("Phuong trinh y=bx+c vo nghiem");
	                    }
	                  }
	                else {      //nếu không thì (nếu (b!=0) thì)
	                System.out.println("Phuong trinh y=bx+c có nghiem x la" + -b/c);
	                }
	           }
	           else{
	               double delta=b*b-4*a*c;
	               if (delta < 0){
	                   System.out.println("Phuong trinh y=a(x*x)+bx+c vo nghiem");
	               }
	               else if (delta == 0) {
	                   System.out.println("Phuong trinh y=a(x*x)+bx+c co nghiem kep x1=x2="+ -b/(2*a));
	               }
	               else if (delta > 0){                 
	                   double x1=(-b+Math.sqrt(delta))/(2*a);
	                   double x2=(-b-Math.sqrt(delta))/(2*a);
	                   System.out.println("Phuong trinh y=a(x*x)+bx+c co 2 nghiem lan luot la\n" + "x1=" + x1 + "\nx2=" + x2);
	               }
	           }
	       }
	}
	
