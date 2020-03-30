package structuralPatterns.filterPattern.employeeUsingPredicates;

public class Employee {
    private String name;
    private int yearsOfExperience;
    private Role role;
    private Gender gender;

    public Employee(String name, int yearsOfExperience, Role role, Gender gender) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.role = role;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Role getRole() {
        return role;
    }

    public Gender getGender() {
        return gender;
    }
}
