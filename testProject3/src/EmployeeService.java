import java.util.Random;

public class EmployeeService {
    Employee[] employees;

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    };

    public EmployeeService(Employee[] employees){
        this.employees = employees;
    };

    // Method Should print all employees
    void printEmployees(){
        for (int i = 0; i < this.employees.length; i++) {
            print(this.employees[i]);
        }
    }

    // Print an employee
    void print(Employee employee) {
        System.out.print("Employee, id = " + employee.id);
        System.out.print(", First name is " + employee.firstName);
        System.out.print(", Last name is " + employee.lastName);
        System.out.print(", age is " + employee.age);
        System.out.print(", salary is " + employee.salary);
        System.out.print(", position is " + employee.getClass().getName());
        System.out.print(", gender is " + employee.gender);

        if (employee instanceof Developer){
            System.out.println(", fixed bugs = " + ((Developer) employee).fixedBugs);
        }
        else if (employee instanceof Cleaner){
            System.out.print(", rate = " + ((Cleaner) employee).rate);
            System.out.println(", worked days = " + ((Cleaner) employee).workedDays);
        }
        else{
            System.out.println();
        }
    }

    // возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце
    double calculateSalaryAndBonus(){
        // Расчет итоговой зарплаты для Developer происходит по формуле:
        // (ставка + fixedBugs * коэффициент) * (randomBoolean ? 2 : 0)
        // Итоговой зарплатой Manager-а является его ставка:
        // Расчет итоговой зарплаты для Cleaner происходит по формуле:
        // ставка + rate * workedDays
        double result = 0;
        double salary  = 0;
        Random random = new Random();

        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] instanceof Developer){
                salary = (employees[i].salary + ((Developer) employees[i]).fixedBugs * 2) * (getRandomBoolean() ? 2 : 0);
            }
            else if (employees[i] instanceof Cleaner){
                salary = employees[i].salary + ((Cleaner) employees[i]).rate * ((Cleaner) employees[i]).workedDays;
            }
            else if (employees[i] instanceof Manager){
                salary = employees[i].salary;
            }
            else {
                salary = 0;
            };
            result = result + salary;
        };
        return result;
    };

    // возвращает сотрудника по заданному id
    Employee getById(long id){
        Employee result = new Employee();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == id) {
                result = employees[i];
            }
        }
        return result;
    };

    // возвращает сотрудников по заданному имени
    Employee[] getByName(String firstName) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].firstName.equals(firstName)){
                j++;
            }
        }

        Employee[] result = new Employee[j];

        j=0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].firstName.equals(firstName)){
                result[j] = employees[i];
                j++;
            }
        }
        return result;
    };

    // сортировка по имени
    Employee[] sortByName(){
        Employee interimEmployee = new Employee();
        Employee[] result = new Employee[employees.length];
        result = employees;

        for(int i = result.length-1; i > 0; i--){
            for(int j = 0 ; j < i ; j++){
                if( result[j].firstName.compareTo(result[j+1].firstName) < 0 ){
                    interimEmployee = result[j];
                    result[j] = result[j+1];
                    result[j+1]= interimEmployee;
                }
            }
        }
        return result;
    };

    // возвращают отсортированный массив с сотрудниками по критерию (Имя + ЗП)
    Employee[] sortByNameAndSalary()
    {
        Employee[] result = new Employee[employees.length];
        return result;
    };

    // находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
    Employee edit(Employee employee) {
        Employee result = new Employee();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == employee.id) {

                result.id = employees[i].id;
                result.firstName = employees[i].firstName;
                result.lastName = employees[i].lastName;
                result.age = employees[i].age;
                result.salary = employees[i].salary;
                result.gender = employees[i].gender;

                employees[i].firstName = employee.firstName;
                employees[i].lastName = employee.lastName;
                employees[i].age = employee.age;
                employees[i].salary = employee.salary;
                employees[i].gender = employee.gender;
            }
        }
        return result;
    };


}