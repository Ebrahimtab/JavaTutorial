package ir.porteghali.javatutorial.p08_Classes;

public class E033_Cat extends E033_Pet{

    public void ChangePetName() {
        AnimalName = "Cat";
    }

    public void Sound() {
        System.out.println("Mew Mew");
    }

    @Override
    public void Walk() {
        System.out.println("Cat is jumping");
        super.Walk();
    }
}
