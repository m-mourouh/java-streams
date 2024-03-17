package exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000, "HR"));
        employees.add(new Employee("Mark", 6000, "IT"));
        employees.add(new Employee("Fadi", 7000, "HR"));
        employees.add(new Employee("Salim", 8000, "IT"));
        employees.add(new Employee("Bader", 9000, "HR"));
        employees.add(new Employee("Ahmed", 10000, "IT"));

        //1. Use MapToDouble, calculate the sum of all salaries.
        double sumSalaries = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Salaries Sum = " + sumSalaries);

        //2. Use sorted to sort the list of employees alphabetically by name.
        List<Employee> sortedEmployeesList = employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).toList();
        sortedEmployeesList.forEach(System.out::println);

        //3. Use min to find the employee with the lowest salary.
        double lowestSalary = employees.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
        System.out.println("Lowest Salary = " + lowestSalary);

        //4. Use filter to obtain a list of employees with a salary greater than a given value.
        List<Employee>  filteredEmployees = employees.stream().filter(e -> e.getSalary() > 8000).toList();
        System.out.println("filteredEmployees = " + filteredEmployees );

        //5. Use reduce to find the employee with the highest salary
        double highestSalary = employees.stream().mapToDouble(Employee::getSalary).reduce((a, c) -> Math.max(c, a)).getAsDouble();
        System.out.println("highestSalary = " + highestSalary);

        //6. Use reduce to concatenate the names of all employees
        String names = employees.stream().map(Employee::getName).reduce("", (partialString, name) -> partialString + ' ' + name);
        System.out.println("Concatenated names = " + names);

    }
}
