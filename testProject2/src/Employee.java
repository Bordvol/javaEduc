public class Employee {
    long id;
    String firstName;
    String lastName;
    int age;
    int salary;
    char gender;

    Employee(long newId, String newFirstName, String newLastName, int newAge, int newSalary, char newGender){
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        age = newAge;
        salary = newSalary;
        gender = newGender;
    }

    Employee()
    {};
}
