package ir.porteghali.javatutorial.p15_List;

import ir.porteghali.javatutorial.p10_OOP.E054_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E080_ListIterator {

    public E080_ListIterator() {
        List<E054_Student> studentList = new ArrayList<>();

        studentList.add(new E054_Student("Ebrahim", 20));
        studentList.add(new E054_Student("Saeed", 14));
        studentList.add(new E054_Student("Mohammad", 9));
        studentList.add(new E054_Student("Abdullah", 8));
        studentList.add(new E054_Student("Soheil", 6));

        ListIterator<E054_Student> listIterator = studentList.listIterator();

        while (listIterator.hasNext()) {
            E054_Student student = listIterator.next();
            System.out.println(student.getName() + ": " + student.getAge());
        }
    }
}
