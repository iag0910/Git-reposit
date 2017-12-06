/**
 * Java. Level 1. Lesson 5., HW5 Creation of Employee class
 *
 * @author Alexey G. Ivanov
 * @version dated Dec 06, 2017
 * @link https://github.com/iag0910
 */

public class Employee {

    private String title;
    private String position;
    private String e_mail;
    private String phone_number;
    private int salary;
    private int age;

    // Creation of the constructor with parameters;

    public Employee(String title, String position,
           String e_mail, String phone_number, 
           int salary, int age) {
    
    this.title = title;
    this.position = position;
    this.e_mail = e_mail;
    this.phone_number = phone_number;
    this.salary = salary;
    this.age = age;
    }

    // Creation of "getters";

    public String getTitle() {
        return title;
    }

    public String getPosition() {
        return position;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

class TestEmployee {

    public static void main(String[] args) {

    // Array of Employees initialization ;

    Employee[] arr_employee = new Employee[5];

    arr_employee[0] = new Employee("IVAN IVANOV",
                "SALES MANAGER", "I.I@abc.com",
                "+7-988-666-11-23", 30000, 22);
    arr_employee[1] = new Employee("PETR PRTROV",
                "SENIOR SALES MANAGER", "P.P@abc.com",
                "+7-988-666-23-23", 50000, 28);
    arr_employee[2] = new Employee("SIDOR SIDOROV",
                "COUNTRY MANAGER", "S.S@abc.com",
                "+7-985-774-12-55", 80000, 42);
    arr_employee[3] = new Employee("MAXIM MAXIMOV",
                "ACCOUNTANT", "M.M@abc.com",
                "+7-985-885-12-23", 80000, 45);
    arr_employee[4] = new Employee("URAL URALOV",
                "FIELD ENGINEER", "U.U@abc.com",
                "+7-916-450-19-91", 55000, 41);

    // Print for the list of Employees; (using condition "Age > 40 y.o."

        for (int i = 0; i < 5; i++)
            if (arr_employee[i].getAge()> 40)
                System.out.println("Title:" + arr_employee[i].getTitle() +
                    " Position:" + arr_employee[i].getPosition() +
                    " E-mail:" + arr_employee[i].getE_mail() +
                    " Phone number:" + arr_employee[i].getPhone_number() +
                    " Salary:" + arr_employee[i].getSalary() +
                    " Age:" + arr_employee[i].getAge());

    }

}
