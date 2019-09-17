package Lab8;

public class EmployeeApp {
    public static void main(String[] args) {

        //การสร้างพนักงานที่สืบทอดจากบุคคล
        Employee emp1 = new Employee("Frames","630","s049");
        System.out.println(emp1.toString());

        //การสร้างบุคคลที่เป็นพนักงาน
        Person p1 = new Employee("Tannalyn", "789","s055");
        System.out.println(p1.toString()); //เรียก toString ของคลาส Person
    }
}
