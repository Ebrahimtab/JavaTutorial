package ir.porteghali.javatutorial.p17_Libraries;

import com.google.gson.Gson;
import ir.porteghali.javatutorial.p10_OOP.E054_Student;

public class E090_Libraries {

    public E090_Libraries() {

        E054_Student student = new E054_Student("Ebrahim", 20);
        String json = new Gson().toJson(student);
        System.out.println(json);

        String test = "{\"age\":20,\"name\":\"Ebrahim\"}";
        E054_Student student1 = new Gson().fromJson(test, E054_Student.class);
        System.out.println(student1.getName());
    }
}
