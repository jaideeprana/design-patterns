package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaUIDev implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream().filter(employee -> Role.UI.equals(employee.getRole())).collect(Collectors.toList());
    }
}
