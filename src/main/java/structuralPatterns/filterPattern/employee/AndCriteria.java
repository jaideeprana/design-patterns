package structuralPatterns.filterPattern.employee;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return criteria.meetCriteria(anotherCriteria.meetCriteria(employees));
    }
}
