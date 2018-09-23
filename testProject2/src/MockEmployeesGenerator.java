import java.util.Random;


//Хорсман, ООП, примитивы

//В генератор добавить должность

public class MockEmployeesGenerator {
    // method should generate mock employees.
    // data should be more-or-less relevant. Normal names, Acceptable salary, age.

    static Employee[] generate(int size) {
        Employee[] randomEmployees = new Employee[size];

        String[] listOfFirstNames =  {
                 "Bart"
                ,"Tommy"
                ,"Hipolito"
                ,"Rocky"
                ,"Lucien"
                ,"Randy"
                ,"Robin"
                ,"Forrest"
                ,"Otha"
                ,"Erik"
                ,"George"
                ,"Mack"
                ,"Preston"
                ,"Zackary"
                ,"Otis"
                ,"Ned"
                ,"Colby"
                ,"Jarod"
                ,"Al"
                ,"Harley"
        };

        String[] listOfLastNames = {
                  "Smith"
                , "Johnson"
                , "Williams"
                , "Jones"
                , "Brown"
                , "Davis"
                , "Miller"
                , "Wilson"
                , "Moore"
                , "Taylor"
                , "Anderson"
                , "Thomas"
                , "Jackson"
                , "White"
                , "Harris"
                , "Martin"
                , "Thompson"
                , "Garcia"
                , "Martinez"
                , "Robinson"
        };

        for (int i = 0; i < randomEmployees.length; i++) {
            Random random = new Random();
            Employee newEmployee = new Employee(i+1, listOfFirstNames[random.nextInt(19)], listOfLastNames[random.nextInt(19)], random.nextInt(40)+18, random.nextInt(2000)+1000, 'Y');
            randomEmployees[i]  = newEmployee;
        }
        return randomEmployees;
    }
}
