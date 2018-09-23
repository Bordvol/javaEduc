public class Cleaner extends Employee {
    int rate;
    int workedDays;

    public Cleaner(Employee newEmployee, int newRate, int newWorkedDays) {
        super(newEmployee.id, newEmployee.firstName, newEmployee.lastName, newEmployee.age, newEmployee.salary, newEmployee.gender);
        this.rate = newRate;
        this.workedDays = newWorkedDays;
    }
}
