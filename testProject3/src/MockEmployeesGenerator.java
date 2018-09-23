import java.util.Random;

public class MockEmployeesGenerator {
    // method should generate mock employees.
    // data should be more-or-less relevant. Normal names, Acceptable salary, age.

    static String[] listOfMaleFirstNames =  {
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

    static String[] listOfFemaleFirstNames =  {
            "Emma"
            , "Olivia"
            , "Ava"
            , "Isabella"
            , "Sophia"
            , "Mia"
            , "Charlotte"
            , "Amelia"
            , "Evelyn"
            , "Abigail"
            , "Harper"
            , "Emily"
            , "Elizabeth"
            , "Avery"
            , "Sofia"
            , "Ella"
            , "Madison"
            , "Scarlett"
            , "Victoria"
            , "Aria"
    };

    static String[] listOfLastNames = {
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

    static char[] listOfGenders = {
              'F'
            , 'M'
    };


    static Employee[] generate(int size) {
        Employee[] randomEmployees = new Employee[size];
        Employee[] randomEmployeesWithPosition = new Employee[size];


        Random random = new Random();

        //переделать на 1 генератор
        //инициализировать все поля
        //в обьект присваивать поля (поле в поле)
        // Create people
        for (int i = 0; i < randomEmployees.length; i++) {

            char gender = listOfGenders[random.nextInt(2)];
            String firstName =  (gender == 'M') ? listOfMaleFirstNames[random.nextInt(20)] : listOfFemaleFirstNames[random.nextInt(20)];

            Employee newEmployee = new Employee(i+1, firstName, listOfLastNames[random.nextInt(20)], random.nextInt(40)+18, random.nextInt(2000)+1000, gender);
            randomEmployees[i]  = newEmployee;
        };

        // Assign positions
        for (int i = 0; i < randomEmployees.length; i++){
            if (i<2){
                randomEmployeesWithPosition[i] = new Manager(randomEmployees[i]);
            }
            else if (i<18) {
                randomEmployeesWithPosition[i] = new Developer(randomEmployees[i], random.nextInt(20));
            }
            else{
                randomEmployeesWithPosition[i] = new Cleaner(randomEmployees[i], random.nextInt(3)+1, random.nextInt(12)+10);
            }
        };
        return randomEmployeesWithPosition;
    }
}
