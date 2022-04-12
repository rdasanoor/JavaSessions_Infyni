package collectionsPkg.set;

import javax.print.Doc;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DoctorTestClass {

    public static void main(String[] args) {

        Doctor doctor = new Doctor(1, "vijay");
        Doctor doctor1 = new Doctor(2, "ajay");

        Set<Doctor> set = new HashSet<>();
        set.add(doctor);
        set.add(doctor1);

        System.out.println(set);

        Set<Doctor> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(doctor);
        linkedHashSet.add(doctor1);

        System.out.println(linkedHashSet);

        Set<Doctor> treeSet = new TreeSet<>();
        treeSet.add(doctor);
        treeSet.add(doctor1);

        System.out.println(treeSet);
    }
}
