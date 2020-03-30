package structuralPatterns.filterPattern.employeeUsingPredicates;


import java.util.function.Predicate;

public class EmployeePredicates {
    public static Predicate<Employee> isMale = employee -> Gender.Male.equals(employee.getGender());

    public static Predicate<Employee> isFemale = employee -> Gender.Female.equals(employee.getGender());

    public static Predicate<Employee> isDev = employee -> Role.Dev.equals(employee.getRole());

    public static Predicate<Employee> isQA = employee -> Role.QA.equals(employee.getRole());

    public static Predicate<Employee> isUIDev = employee -> Role.UI.equals(employee.getRole());

    public static Predicate<Employee> hasExperienceMoreThan(Integer experience){
        return p -> p.getYearsOfExperience() >= experience;
    }
}
