package Quiz1;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your name : ");
        String n = sc.nextLine();

        System.out.println("Input your ID : ");
        String i = sc.nextLine();

        System.out.println("Input your major : ");
        String m = sc.nextLine();

        System.out.println("Input grade subject A : ");
        String a = sc.nextLine();

        System.out.println("Input grade subject B : ");
        String b = sc.nextLine();

        System.out.println("Input grade subject C : ");
        String c = sc.nextLine();

        double g1 = compareGrade(a);
        double g2 = compareGrade(b);
        double g3 = compareGrade(c);

        double gpas = (g1+g2+g3)/3;

        Student std1 = new Student(n,i,m,gpas);
        System.out.println(std1.toString());

    }

    private static double compareGrade(String g){
        if (g.equals("A") || g.equals("a")){
            return 4.00;
        }else if (g.equals("B+") || g.equals("b+")){
            return 3.5;
        }
        else if (g.equals("B") || g.equals("b")){
            return 3;
        }
        else if (g.equals("C+") || g.equals("c+")){
            return 2.5;
        }
        else if (g.equals("C") || g.equals("c")){
            return 2;
        }
        else if (g.equals("D+") || g.equals("d+")){
            return 1.5;
        }
        else if (g.equals("D") || g.equals("d")){
            return 1;
        }
        return 0;
    }

}
