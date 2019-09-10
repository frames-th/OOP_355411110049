package Lab7;

import java.util.Set;

public class PetApp {
    public static void main(String[] args) {

        //create class instant (object)
        Pet pet1 = new Pet();

        pet1.setOwnerName("Frames");
        pet1.setPetName("Charcoal");
        pet1.setPetAge(1);
        pet1.petColor = "black"; //public

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPetName());
        System.out.println(pet1.getPetAge());
        System.out.println(pet1.petColor); //public

        Pet pet2 = new Pet();

        pet2.setOwnerName("Oil");
        pet2.setPetName("Margy");
        pet2.setPetAge(4);
        pet2.petColor = "blue";

        System.out.println(pet2.getOwnerName());
        System.out.println(pet2.getPetName());
        System.out.println(pet2.getPetAge());
        System.out.println(pet2.petColor);

        //create getter,setter local variable
        Pet pet3 = new Pet("Sam","Lala",5);

        pet3.setOwnerName("Zin");

        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getPetName());
        System.out.println(pet3.getPetAge());

    }
}
