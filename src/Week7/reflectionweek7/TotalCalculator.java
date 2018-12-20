package reflectionweek7;

import java.util.List;

public class TotalCalculator {
    public Integer calculateTotal(List<Employee> employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;
    }
}
