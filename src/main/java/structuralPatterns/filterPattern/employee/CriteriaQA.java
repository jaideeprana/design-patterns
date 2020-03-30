package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaQA implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream().filter(employee -> Role.QA.equals(employee)).collect(Collectors.toList());
    }
}
