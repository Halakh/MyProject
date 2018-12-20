package reflectionweek7;

import week7ex3.MaxAndMin;

import java.util.ArrayList;
import java.util.List;

public class HighestSalaryCalculator {
    public Integer calculateHighest(List<Employee> employees){
        List<Integer>saleries=new ArrayList<>();
        Employee employee = new Employee();
        for (Employee:employees) {
            saleries.add(employee.getSalary());
        }

        MaxAndMin determiner = new MaxAndMin();
        Integer highest= determiner.findMax(saleries);
        return highest;

}






