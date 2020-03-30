package structuralPatterns.filterPattern.employeeUsingPredicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.toList());
    }
}
