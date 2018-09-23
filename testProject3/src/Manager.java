public class Manager extends Employee {

    public Manager(Employee newEmployee) {
        super(newEmployee.id, newEmployee.firstName, newEmployee.lastName, newEmployee.age, newEmployee.salary, newEmployee.gender);
    }
}