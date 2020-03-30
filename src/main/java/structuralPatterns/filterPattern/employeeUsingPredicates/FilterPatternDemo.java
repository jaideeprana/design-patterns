package structuralPatterns.filterPattern.employeeUsingPredicates;

import java.util.Arrays;
import java.util.List;

import static structuralPatterns.filterPattern.employeeUsingPredicates.EmployeePredicates.hasExperienceMoreThan;
import static structuralPatterns.filterPattern.employeeUsingPredicates.EmployeePredicates.isFemale;
import static structuralPatterns.filterPattern.employeeUsingPredicates.EmployeePredicates.isMale;
import static structuralPatterns.filterPattern.employeeUsingPredicates.Gender.Female;
import static structuralPatterns.filterPattern.employeeUsingPredicates.Gender.Male;
import static structuralPatterns.filterPattern.employeeUsingPredicates.Role.Dev;
import static structuralPatterns.filterPattern.employeeUsingPredicates.Role.UI;

public class FilterPatternDemo {
    public static void main(String[] args) {
        Employee rockStarQA =
                new Employee("Albert", 10, Role.QA, Male);
        Employee rockStarDev =
                new Employee("Jaideep", 10, Dev, Male);
        Employee rockStarUI =
                new Employee("Dana", 5, UI, Female);
        Employee newBeeDev =
                new Employee("Jack", 1, Dev, Male);
        List<Employee> employeesInOffice = Arrays.asList(rockStarQA, rockStarUI, newBeeDev, rockStarDev);

        EmployeeFilter employeeFilter = new EmployeeFilter();

        List<Employee> employees = employeeFilter.filterEmployees(employeesInOffice, isMale);

        System.out.println("Male employees");
        prettyPrint(employees);

        System.out.println("\nMore than 5 year exp employees");
        employees = employeeFilter.filterEmployees(employeesInOffice, hasExperienceMoreThan(5));
        prettyPrint(employees);

        System.out.println("\nLess than 2 year experience and male employeees");
        employees = employeeFilter.filterEmployees(employeesInOffice,
                isMale.and(hasExperienceMoreThan(2).negate()));
        prettyPrint(employees);

        System.out.println("\nIs female or is less experienced");
        employees = employeeFilter.filterEmployees(employeesInOffice, isFemale.or(hasExperienceMoreThan(2).negate()));
        prettyPrint(employees);
    }

    private static void prettyPrint(List<Employee> employees) {
        employees.stream().forEach(employee -> System.out.println(employee.getName()));
    }
}
