package Lab2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Fahrenheit : ");
        double f = scanner.nextDouble();
        System.out.println(f);


        System.out.println("The Celsius is : " +((5.0/9.0)*(f -32.0)));
    }
}
