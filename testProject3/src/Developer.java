public class Developer extends Employee {
   int fixedBugs;

    public Developer(Employee newEmployee, int newFixedBugs) {
        super(newEmployee.id, newEmployee.firstName, newEmployee.lastName, newEmployee.age, newEmployee.salary, newEmployee.gender);
        this.fixedBugs = newFixedBugs;
    }
}