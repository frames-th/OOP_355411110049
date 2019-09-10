package Lab7;

public class Pet {
    //Class Attributes
    private String ownerName;
    private String petName;
    private int petAge;
    public String petColor;

    //constructor
    public Pet(){}
    //local variable
    public Pet(String ownerName, String petName, int petAge){
        this.ownerName = ownerName;
        this.petName = petName;
        this.petAge = petAge;
    }

    //getter and setter methods
    public String getOwnerName() {
        return this.ownerName;
    }
    public void setOwnerName(String newownerName){
        this.ownerName = newownerName;
    }

    public String getPetName(){
        return  this.petName;
    }
    public void setPetName(String newpetName) {
        this.petName = newpetName;
    }

    public int getPetAge(){
        return this.petAge;
    }
    public void setPetAge(int newpetAge) {
        this.petAge = newpetAge;
    }

}