package reflectionweek7;

import week4ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeReader {
    private FileReader reader = new FileReader();

    public List<Employee> asList() {
        List<String> lines = getLines();
        List<Employee> employees = toEmployees(lines);
        return employees;
    }

    private List<String> getLines() {
        return reader.asLines("reflectionweek7/file");
    }

    private List<Employee> toEmployees(List<String> lines) {
        List<Employee> employees = new ArrayList<>();
        lines.remove(0);
        for (String line : lines) {
            employees.add(toEmployee(line));
        }
        return employees;
    }

    private Employee toEmployee(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String department = columns.get(1);
        String salary  = columns.get(2);
        String account  = columns.get(3);

        return new Employee(name, department, Integer.valueOf(salary), account);
    }

}
