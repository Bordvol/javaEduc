public class Cleaner extends Employee {
    int rate;
    int workedDays;

    public Cleaner(long newId, String newFirstName, String newLastName, int newAge, int newSalary, char newGender, int newRate, int newWorkedDays) {
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.age = newAge;
        this.salary = newSalary;
        this.gender = newGender;
        this.rate = newRate;
        this.workedDays = newWorkedDays;
    }

    public Cleaner(Employee newEmployee, int newRate, int newWorkedDays) {
        this.id = newEmployee.id;
        this.firstName = newEmployee.firstName;
        this.lastName = newEmployee.lastName;
        this.age = newEmployee.age;
        this.salary = newEmployee.salary;
        this.gender = newEmployee.gender;
        this.rate = newRate;
        this.workedDays = newWorkedDays;
    }
}
