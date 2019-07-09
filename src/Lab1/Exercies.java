package Lab1;

import java.util.Scanner;

public class Exercies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่ค่าฐาน : ");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.print("กรุณาใส่ค่าความสูง : ");
        int h = scanner.nextInt();
        System.out.println(h);

        System.out.println("พื้นที่สามเหลี่ยมเท่ากับ : " +(0.5*i*h));


    }
}
