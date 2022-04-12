package collectionsPkg.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            list1.add(i);
//        }
//
//        for (Integer value: list1) {
//            System.out.println(value);
//        }
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(1, "vijay"));
//        employeeList.add(new Employee(2, "vijay1"));
//        employeeList.add(new Employee(3, "vijay2"));
//
//        int count = 0;
//        for (Employee employee: employeeList) {
//            count += 1;
//            System.out.println("Printing object::" + count);
//            System.out.println(employee.getEmpId());
//            System.out.println(employee.getEmpName());
//        }

        List<Employee> employeeList1 = Arrays.asList(new Employee(1, "vijay"),
                new Employee(2, "vijay1"),
                new Employee(3),
                new Employee(4, "vinay", new Department(1, "CSE")));

//        for (Employee employee: employeeList1) {
//            if (employee.getDepartment() != null) {
//                System.out.println(employee.getEmpId() + " have any department.." + employee.getDepartment().getDepartmentName());
//            }else{
//                System.out.println(employee.getEmpId() + " does not have any department..");
//            }
//        }

        Collections.sort(employeeList1);

        System.out.println(employeeList1);

//        List<Integer> list = Arrays.asList(30,4,5);
////        List<Integer> list1 = Arrays.asList(8,90,0);
////        list1.addAll(list);
//        Collections.sort(list, Collections.reverseOrder());
//
//        System.out.println(list);
    }
}
