package HomeworkWeek4;


import java.util.*;

public class Organization {

    public static void main(String[] args) {
        setUpEmployees();
        addEmployeeToList();
        searchByName("Andrei");
        searchByAge(29);
        searchByDepartment("community");
        searchByGender("female");
        searchByJob("DEV");
        updateEmployeeName(employee1, "Adrian");
        removeEmployee(employee2);
    }

    public static UUID uuid = UUID.randomUUID();
    public static List<Employees> employees = new LinkedList<>();
    public static Employees employee1 = new Employees();
    public static Employees employee2 = new Employees();
    public static Employees employee3 = new Employees();

    public static void setUpEmployees() {
        employee1.addEmployees(uuid, "George", 29, "male", "community", "QA"  );
        employee2.addEmployees(uuid, "Andrei", 34, "male", "delivery", "DEV");
        employee3.addEmployees(uuid, "Raluca", 31, "female", "HR", "HR");
    }

    public static void addEmployeeToList() {
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("Successfully added these employees: " + employees);
    }

    public static void searchByName(String name) {

        System.out.println("Search results for name \"" + name + "\":");
        for (Employees e : employees) {
            if (e.getName().contains(name)) {
                System.out.println("Employee found: Name: " + e.getName() + ", gender: " + e.getGender() + ", age: " + e.getAge() + ", Department:" + e.getDepartment() + ", Job Title: " + e.getJobTitle());
            }
        }
    }

    public static void searchByAge(Integer age) {

        System.out.println("Search results for age \"" + age + "\":");
        for (Employees e : employees) {
            if (Objects.equals(e.getAge(), age)) {
                System.out.println("Employee found: Name: " + e.getName() + ", gender: " + e.getGender() + ", age: " + e.getAge() + ", Department:" + e.getDepartment() + ", Job Title: " + e.getJobTitle());
            }
        }
    }

    public static void searchByGender(String gender) {

        System.out.println("Search results for employee gender \"" + gender + "\":");
        for (Employees e : employees) {
            if (e.getGender().contains(gender)) {
                System.out.println("Employee found: Name: " + e.getName() + ", gender: " + e.getGender() + ", age: " + e.getAge() + ", Department:" + e.getDepartment() + ", Job Title: " + e.getJobTitle());
            }
        }
    }

    public static void searchByDepartment(String department) {

        System.out.println("Search results for employee's department \"" + department + "\":");
        for (Employees e : employees) {
            if (e.getDepartment().contains(department)) {
                System.out.println("Employee found: Name: " + e.getName() + ", gender: " + e.getGender() + ", age: " + e.getAge() + ", Department:" + e.getDepartment() + ", Job Title: " + e.getJobTitle());
            }
        }
    }

    public static void searchByJob(String job) {

        System.out.println("Search results for job title \"" + job + "\":");
        for (Employees e : employees) {
            if (e.getJobTitle().contains(job)) {
                System.out.println("Employee found: Name: " + e.getName() + ", gender: " + e.getGender() + ", age: " + e.getAge() + ", Department:" + e.getDepartment() + ", Job Title: " + e.getJobTitle());
            }
        }
    }

    public static void updateEmployeeName(Employees employee, String name) {
        System.out.println("Search results for employee with name \"" + employee.getName() + "\":");
        employee.setName(name);
        System.out.println("Employee name was successfully changed to \"" + employee.getName());
    }

    public static void removeEmployee(Employees employee) {
        System.out.println("Current employees are: " + employees);
        System.out.println("Going to remove employee: " + employee.getName());
        employees.remove(employee);
        System.out.println("Employee was successfully removed, current employees are: " + employees);
    }
}

