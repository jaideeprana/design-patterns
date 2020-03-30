package structuralPatterns.filterPattern.employee;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaHasMoreThanFiveYearsExperience implements Criteria {

    public static final int FIVE_YEARS_OF_EXPERIENCE = 5;

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
       return employees.stream().filter(employee -> employee.getYearsOfExperience() >=
               FIVE_YEARS_OF_EXPERIENCE).collect(Collectors.toList());
    }
}
