public class Test {
    public static void main(String[] args) {
        Employee [] mockEmployees = MockEmployeesGenerator.generate(10);
        print(mockEmployees);
    }

    // Method Should print all employees
    static void print(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            print(employees[i]);
        }
    }

    static void print(Employee employee) {
        System.out.print("Employee, id = " + employee.id);
        System.out.print(", First name is " + employee.firstName);
        System.out.print(", Last name is " + employee.lastName);
        System.out.print(", age is " + employee.age);
        System.out.println(", salary is " + employee.salary);
    }
}
