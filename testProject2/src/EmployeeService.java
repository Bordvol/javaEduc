public class EmployeeService {
    Employee[] employees;

    // To Rewrite
    Employee getById(int id) {
        return employees[id+1];
    }

    Employee[] findByFirstName(String firstName) {
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
    }

    // To Do
    Employee[] sortByFirstName() {
        Employee interimEmployee = new Employee();
        Employee[] result = new Employee[employees.length];
        result = employees;

        for (int i = 1; i < result.length; i++) {
            if (result[i].firstName.compareTo(result[i-1].firstName) < 0 ){
                result[i] = result[i];
        }
            else {
                interimEmployee = result[i];
                result[i] = result[i-1];
                result[i-1] = interimEmployee;
            }
        }
        return result;
    }
// to check
    void update(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].id == newEmployee.id ){
                employees[i] = newEmployee;
            }
        }
    }
// to do
    void delete(Employee newEmployee) {

    }

    void print() {
    }
}