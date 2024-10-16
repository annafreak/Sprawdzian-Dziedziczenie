
class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private String email;
    private boolean isLoggedIn;


    public Employee(String firstName, String lastName, String position, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.email = email;
        this.isLoggedIn = false;
    }


    public void login() {
        isLoggedIn = true;
        System.out.println(firstName + " " + lastName + " zalogował się do systemu.");
    }


    public void work() {
        if (isLoggedIn) {
            System.out.println(firstName + " " + lastName + " pracuje jako " + position + ".");
        } else {
            System.out.println(firstName + " " + lastName + " musi się najpierw zalogować.");
        }
    }


    public void logout() {
        isLoggedIn = false;
        System.out.println(firstName + " " + lastName + " zakończył pracę.");
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

class Manager extends Employee {

    private String department;
    private int numberOfSubordinates;


    public Manager(String firstName, String lastName, String position, int age, String email, String department, int numberOfSubordinates) {
        super(firstName, lastName, position, age, email);
        this.department = department;
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public void assignTask(Employee employee, String task) {
        System.out.println("Menedżer " + getFirstName() + " " + getLastName() + " przydzielił zadanie: \"" + task + "\" pracownikowi: " + employee.getFirstName() + " " + employee.getLastName() + ".");
    }


    public void reviewReports() {
        System.out.println("Menedżer " + getFirstName() + " " + getLastName() + " przegląda raporty działu: " + department + ".");
    }

    public void displayManagerData() {
        System.out.println("Menedżer: " + getFirstName() + " " + getLastName());
        System.out.println("Stanowisko: " + getPosition());
        System.out.println("Wiek: " + getAge());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Dział: " + department);
        System.out.println("Liczba podwładnych: " + numberOfSubordinates);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Ahmed", "Rogaczov", "Dyrektor", 35, "ahmed.r@example.com", "Sprzedaż", 10);


        manager.displayManagerData();
    }
}
