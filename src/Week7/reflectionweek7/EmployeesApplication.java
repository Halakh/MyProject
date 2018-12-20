package reflectionweek7;

import week7ex3.MaxAndMin;

import java.util.*;

public class EmployeesApplication {
    public static void main(String[] args) {
        EmployeeReader reader = new EmployeeReader();
        List<Employee> employees = reader.asList();
        System.out.println(employees);

        Bank bank = new Bank();
        for (Employee employee : employees) {
            Integer salary = employee.getSalary();
            String account = employee.getAccount();
            bank.transfer(salary, account);
        }

        Collections.sort(employees, Comparator.comparing(Employee::getSalary));

        TotalCalculator calculator = new TotalCalculator();
        Integer total = calculator.calculateTotal(employees);
        System.out.println("Total amount paid: " + total);

        System.out.println("Highest salary employee: "+ );


    }
}
