public class Test {
    public static void main(String[] args) {
        Employee employee;
        // generate data
        Employee [] mockEmployees = MockEmployeesGenerator.generate(20);

        // create a new employee service object
        EmployeeService employeeService = new EmployeeService(mockEmployees);

        ///////////////// testing of methods
        System.out.println("============ testing of printEmployees method");
        employeeService.printEmployees();

        System.out.println();
        System.out.println("============ testing of calculateSalaryAndBonus method");
        System.out.println("Total for payment " + employeeService.calculateSalaryAndBonus());

        System.out.println();
        System.out.println("============ testing of getById method");
        employee = employeeService.getById(10);
        employeeService.print(employee);

        System.out.println();
        System.out.println("============ testing of getByName method");
        Employee [] employeesTransformed = employeeService.getByName("Tommy");
        EmployeeService employeeServiceTransformed = new EmployeeService(employeesTransformed);
        employeeServiceTransformed.printEmployees();

        System.out.println();
        System.out.println("============ testing of sortByName method");
        employeesTransformed = employeeService.sortByName();
        employeeServiceTransformed.employees = employeesTransformed;
        employeeServiceTransformed.printEmployees();

        //System.out.println();
        //System.out.println("============ testing of sortByNameAndSalary method");
        //employeesTransformed = employeeService.sortByNameAndSalary();
        //employeeServiceTransformed.employees = employeesTransformed;
        //employeeServiceTransformed.printEmployees();

        System.out.println();
        System.out.println("============ testing of edit method");
        Employee newEmployee = new Employee(10,  "Will", "Smith", 99, 1234, 'M');
        System.out.print("New employee: ");
        employeeService.print(newEmployee);
        Employee oldEmployee = employeeService.edit(newEmployee);
        System.out.print("Old employee: ");
        employeeService.print(oldEmployee);

    }
}
