package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

import static structuralPatterns.filterPattern.employee.Gender.*;

public class CriteriaMale implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream().filter(employee -> Male.equals(employee.getGender())).collect(Collectors.toList());
    }
}
