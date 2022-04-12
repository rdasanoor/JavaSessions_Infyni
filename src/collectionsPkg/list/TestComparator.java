package collectionsPkg.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        List<Employee> employeeList1 = Arrays.asList(
                new Employee(1, "vijay"),
                new Employee(2, "vijay1"),
                new Employee(3, "ajay"),
                new Employee(4, "vinay", new Department(1, "CSE")));

//        Comparator<Employee> comparator = new Comparator<Employee>() {
//
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getEmpName().compareTo(emp2.getEmpName());
//            }
//        };

        Collections.sort(employeeList1, new SortingEmpName());

        System.out.println(employeeList1);
    }
}
