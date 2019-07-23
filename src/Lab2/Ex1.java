package Lab2;

public class Ex1 {

    public static void main(String[] args) {

        //date type in java
        //integer
        int x; //ตัวแปล x เก็บค่าจำนวนเต็ม
        x = 10;
        System.out.println("X = " +x);
        x = 20;
        int a, b, c = 30; //ตัวแปร c=30 แต่ตัวแปร a และ b ยังไม่ได้กำหนดค่า

        //real number
        double n = 20.5;
        float m = 10;
        System.out.println(n);
        System.out.println(m);

        //charecter
        char d = '#';
        System.out.println(d);

        //string
        String s = "Tannalyn";
        System.out.println(s);
        String l = "Tassanakowit";
        String Fullname = s + l;

        System.out.println(Fullname);
        System.out.println(Fullname.length());
        String t = Fullname.concat("RUTS");
        System.out.println(t);

        //boolean
        boolean w = true;
        boolean o = false;
        System.out.println(!w);

    }
}
