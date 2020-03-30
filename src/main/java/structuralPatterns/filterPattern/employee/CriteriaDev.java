package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

import static structuralPatterns.filterPattern.employee.Role.*;

public class CriteriaDev implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream().filter(employee -> Dev.equals(employee.getRole())).collect(Collectors.toList());
    }
}
