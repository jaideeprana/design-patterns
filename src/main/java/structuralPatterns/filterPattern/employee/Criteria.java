package structuralPatterns.filterPattern.employee;

import java.util.List;

public interface Criteria {
    public List<Employee> meetCriteria(List<Employee> employees);
}
