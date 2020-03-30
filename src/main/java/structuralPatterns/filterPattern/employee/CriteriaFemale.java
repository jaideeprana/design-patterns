package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

import static structuralPatterns.filterPattern.employee.Gender.Female;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream().filter(employee -> Female.equals(employee.getGender())).collect(Collectors.toList());
    }
}
