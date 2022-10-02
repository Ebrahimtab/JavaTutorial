package ir.porteghali.javatutorial.p15_List;

import java.util.HashMap;

public class E082_HashMap {

    public E082_HashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "student");
        hashMap.put(12, "engineer");
        hashMap.put(15, "doctor");
        hashMap.put(18, "teacher");
        hashMap.put(20, "teacher");
        hashMap.put(0, null);
        hashMap.put(null, "infant");

        System.out.println(hashMap);
        System.out.println(hashMap.get(12));
        System.out.println(hashMap.get(0));
        System.out.println(hashMap.get(null));
    }
}
