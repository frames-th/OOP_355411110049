package Lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Input Your name : ");
        String a = scanner.nextLine();
        System.out.println("Your name is " +a);

        System.out.print("Input Your Lastname : ");
        String b = scanner.nextLine();
        System.out.println("Hello " +a+ " " +b);

        System.out.print("Please, input Your ID Card : ");
        double c = scanner1.nextDouble();

        System.out.print("Please, input Your address : ");
        String d = scanner.nextLine();

        System.out.print("Please, input Your E-mail address : ");
        String e = scanner.nextLine();

        System.out.print("Please, input Your phone number : ");
        double f = scanner1.nextDouble();

        System.out.println("So, your name is " +a+b +", your ID Card number " );
        System.out.println(c);
        System.out.println(", your address at " +d);
        System.out.println(", your E=mail is " +e +"and your phone number is ");
        System.out.println(f);
        System.out.println("Thank you !");

    }
}
