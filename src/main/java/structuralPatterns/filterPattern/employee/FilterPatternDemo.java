package structuralPatterns.filterPattern.employee;

import java.util.Arrays;
import java.util.List;

import static structuralPatterns.filterPattern.employee.Gender.Female;
import static structuralPatterns.filterPattern.employee.Gender.Male;
import static structuralPatterns.filterPattern.employee.Role.Dev;
import static structuralPatterns.filterPattern.employee.Role.QA;
import static structuralPatterns.filterPattern.employee.Role.UI;

public class FilterPatternDemo {
    public static void main(String[] args) {
        Employee rockStarQA = new Employee("Albert", 10, QA, Male);
        Employee rockStarDev = new Employee("Jaideep", 10, Dev, Male);
        Employee rockStarUI = new Employee("Dana", 5, UI, Female);
        Employee newBeeDev = new Employee("Jack", 1, Dev, Male);
        List<Employee> employeesInOffice = Arrays.asList(rockStarQA, rockStarUI, newBeeDev, rockStarDev);

        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaHasMoreThanFiveYearsExperience criteriaHasMoreThanFiveYearsExperience = new CriteriaHasMoreThanFiveYearsExperience();
        CriteriaQA criteriaQA = new CriteriaQA();
        CriteriaDev criteriaDev = new CriteriaDev();

        List<Employee> experiencedMaleDevs =
                criteriaDev.meetCriteria(criteriaMale.meetCriteria(criteriaHasMoreThanFiveYearsExperience.meetCriteria(employeesInOffice)));
        experiencedMaleDevs.stream().forEach(employee -> System.out.println("Experienced dev: " + employee.getName()));

        List<Employee> experiencedEmployees = criteriaHasMoreThanFiveYearsExperience.meetCriteria(employeesInOffice);
        experiencedEmployees.stream().forEach(employee -> System.out.println("Experienced people: " + employee.getName()));

        List<Employee> femaleEmployees = criteriaFemale.meetCriteria(employeesInOffice);
        femaleEmployees.stream().forEach(employee -> System.out.println("Female: " + employee.getName()));

        List<Employee> qaEmployees = criteriaQA.meetCriteria(employeesInOffice);
        qaEmployees.stream().forEach(employee -> System.out.println("QA : " + employee.getName()));

        OrCriteria maleOrFemaleCriteria = new OrCriteria(criteriaMale, criteriaFemale);
        List<Employee> allEmployees = maleOrFemaleCriteria.meetCriteria(employeesInOffice);
        allEmployees.stream().forEach(employee -> System.out.println("All employess" + employee.getName()));

        AndCriteria maleAndDev = new AndCriteria(criteriaDev, criteriaMale);
        List<Employee> employees = maleAndDev.meetCriteria(employeesInOffice);
        employees.stream().forEach(employee -> System.out.println("Male dev " + employee.getName()));
    }
}
