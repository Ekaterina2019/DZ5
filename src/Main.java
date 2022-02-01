public class Main{
    public static  void main (String args []) {

        Employee[] person = new Employee[5];
        person[0] = new Employee("Ivanov", "Engineer", "1@mail.ru", 892312312, 100, 27);
        person[1] = new Employee("Petrov", "Test", "1@mail.ru", 892312312, 100, 38);
        person[2] = new Employee("Smirnov", "Developer", "1@mail.ru", 892312312, 100, 21);
        person[3] = new Employee("Komarov", "Аnalyst", "1@mail.ru", 892312312, 120, 28);
        person[4] = new Employee("Volkov", "Program manager", "1@mail.ru", 892312312, 1380, 48);

        for (int i = 0; i < person.length; i++) {
            if (person[i].age > 40) {
                person[i].person();
            }
            }
            }


        }






