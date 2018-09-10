public class Manager extends Employee {

    public Manager(long newId, String newFirstName, String newLastName, int newAge, int newSalary, char newGender) {
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.age = newAge;
        this.salary = newSalary;
        this.gender = newGender;
    }

    public Manager(Employee newEmployee) {
        this.id = newEmployee.id;
        this.firstName = newEmployee.firstName;
        this.lastName = newEmployee.lastName;
        this.age = newEmployee.age;
        this.salary = newEmployee.salary;
        this.gender = newEmployee.gender;
    }
}