public class Developer extends Employee {
   int fixedBugs;

    public Developer(long newId, String newFirstName, String newLastName, int newAge, int newSalary, char newGender, int newFixedBugs) {
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.age = newAge;
        this.salary = newSalary;
        this.gender = newGender;
        this.fixedBugs = newFixedBugs;
    }

    public Developer(Employee newEmployee, int newFixedBugs) {
        this.id = newEmployee.id;
        this.firstName = newEmployee.firstName;
        this.lastName = newEmployee.lastName;
        this.age = newEmployee.age;
        this.salary = newEmployee.salary;
        this.gender = newEmployee.gender;
        this.fixedBugs = newFixedBugs;
    }
}