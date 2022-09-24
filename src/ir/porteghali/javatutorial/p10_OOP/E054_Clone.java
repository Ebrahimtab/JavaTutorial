package ir.porteghali.javatutorial.p10_OOP;

public class E054_Clone {

    public E054_Clone() {

        E054_Student student1 = new E054_Student();
        student1.name = "Ebrahim";
        System.out.println("student1: " + student1.name);

        E054_Student student2 = null;
        try {
            student2 = (E054_Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        student2.name = "Ahmad";
        System.out.println("student2: " + student2.name);
        System.out.println("student1: " + student1.name);
    }
}
