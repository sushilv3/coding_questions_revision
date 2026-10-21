package streamQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Sushil Kumar", 85000.0, "IT Development"),
                new Employee(2, "Amit Sharma", 65000.0, "IT Support"),
                new Employee(3, "Priya Singh", 95000.0, "IT Development"),
                new Employee(4, "Rahul Verma", 55000.0, "HR"),
                new Employee(5, "Neha Gupta", 72000.0, "Finance"),
                new Employee(6, "Vikram Malhotra", 110000.0, "Management"),
                new Employee(7, "Anjali Das", 68000.0, "Quality Assurance"),
                new Employee(8, "Deepak Kumar", 60000.0, "IT Support"),
                new Employee(9, "Sneha Roy", 88000.0, "IT Development"),
                new Employee(10, "Manish Pandey", 75000.0, "Finance")
        );

        Employee higestSalriedEmployee = employees.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))).get();
        System.out.println("higestSalriedEmployee : " + higestSalriedEmployee);
        System.out.println("higestSalriedEmployee : "
                + employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(() -> new RuntimeException("no employee found")));
        System.out.println("get highest salary : "
                + employees.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
//        higest salaried employee by each department
        Map<String, Employee> highestPaidByDept = employees.stream().collect(Collectors
                .groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get)));
        System.out.println("higest salaried employee by each department :" + highestPaidByDept);
        System.out.println("higest salaried employee by each department :" +
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
//   partition the employee in two group : employee earning morethen 55000 and employees earning 55000 or less
        Map<Boolean, List<Employee>> partitionedEmployee = employees.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 72000));

        System.out.println(partitionedEmployee.get(true));
        System.out.println(partitionedEmployee.get(false));
        partitionedEmployee.entrySet().forEach(System.out::println);
//   for each department partition the employee in two group : employee earning morethen 55000 and employees earning 55000 or less

        Map<String, Map<Boolean, List<Employee>>> empGroupWIthPartition = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.partitioningBy(emp -> emp.getSalary() > 72000)));
        System.out.println("empGroupWIthPartition : " + empGroupWIthPartition);
    }
}
