package structuralPatterns.filterPattern.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> filteredEmployees = new ArrayList<>();
        List<Employee> filteredCriteria = criteria.meetCriteria(employees);
        List<Employee> anotherFilteredCriteria = anotherCriteria.meetCriteria(employees);

        filteredEmployees.addAll(filteredCriteria);
        filteredEmployees.addAll(anotherFilteredCriteria);

        return filteredEmployees.stream().distinct().collect(Collectors.toList());
    }
}
