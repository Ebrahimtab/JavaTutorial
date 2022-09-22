package ir.porteghali.javatutorial.p10_OOP;

public class E050_Encapsulation {

    public E050_Encapsulation() {
        E050_Model model = new E050_Model();
        model.setAge(20);
        model.setfName("Ebrahim");
        model.setlName("Tab");
        model.setDate("22/09/2022");
        model.setAdmin(true);
        model.setEmail("ebrahimtab81@gmail.com");
        model.setPhoneNumber("09033309432");

        System.out.println(model.getAge());
        System.out.println(model.getfName());
        System.out.println(model.getlName());
        System.out.println(model.getDate());
        System.out.println(model.getAdmin());
        System.out.println(model.getEmail());
        System.out.println(model.getPhoneNumber());
    }
}
