package Lab4;

import java.util.Scanner;

public class Lab4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;

        System.out.print("กรุณาใส่ค่ารัศมี : ");
        r = sc.nextInt();

        double c = c (r);
        double a = a (r);
        double v = v (r);

        System.out.println("รัสมี = "+r);
        System.out.println("เส้นรอบวง = "+c);
        System.out.println("พื้นที่วงกลม = "+a);
        System.out.println("ปริมาตรวงกลม = "+v);


    }

    private static double v(double r) {
        double pi = 3.141;
        return ((4/3)*pi*(r*r*r));
    }

    private static double a(double r) {
        double pi = 3.141;
        return (pi*(r*r));
    }

    private static double c(double r) {
        double pi = 3.141;
        return (2*pi*r);
    }

}
