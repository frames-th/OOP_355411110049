package Lab8;
public class Triangle extends GraphicObject{

    //attributes
    private double a;
    private double h;

    //constructor
    public Triangle(){}
    public Triangle(double a){
        this.a = a;
        this.h = h;
    }

    @Override
    void findArea() {
        double area = 0.5*(a*h);
        System.out.println("The area of Triangle : "+area);

    }
    //getter and setter

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setA(double a) {
        this.a = a;
    }
}
