public class TestApplication {

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setAge(20);
        int age = emp.getAge();
        System.out.println("current age" + age);
        int ageAfter20Year = emp.getAgeAfter20YearOnCurrentAge();
        System.out.println("Age after 20 year:" + ageAfter20Year);

        Employee emp1 = new Employee("Vijay", "Rathor", 200000, 28);

        int age1 = emp1.getAge();
        System.out.println("current age" + age1);
        int ageAfter20Year1 = emp1.getAgeAfter20YearOnCurrentAge();
        System.out.println("Age after 20 year:" + ageAfter20Year1);

        Department department = new Department(1, "Engineering");

        Employee emp2 = new Employee("Vijay", "Rathor", 200000, 28, department);

    }

}
