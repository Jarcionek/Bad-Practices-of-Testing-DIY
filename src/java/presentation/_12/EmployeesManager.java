package presentation._12;

import java.util.List;

public class EmployeesManager {

    public double sumSalaries(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

}
