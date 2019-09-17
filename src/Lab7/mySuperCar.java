package Lab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input car brand : ");
        String cb = sc.nextLine();
        System.out.println("Input car color : ");
        String cc = sc.nextLine();
        System.out.println("Input car engine size : ");
        String es = sc.nextLine();
        System.out.println("Input car max speed : ");
        String ms = sc.nextLine();
        System.out.println("Input car of Country origin : ");
        String co = sc.nextLine();

        SuperCar car1 = new SuperCar(cb,cc,es,ms,co);
        System.out.println(car1.getsupercarinfo());

    }
}
