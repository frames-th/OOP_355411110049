package Lab8;

public class Sheriff extends PersonEx {

    String workState;

    public Sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I'm a Sheriff and work in "+workState+".");
    }
}
