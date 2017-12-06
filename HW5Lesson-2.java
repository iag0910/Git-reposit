/**
 * Java. Level 1. Lesson 5., HW5 Creation of Employee class extended version (with "getters"/"setters")
 *
 * @author Alexey G. Ivanov
 * @version dated Dec 06, 2017
 * @link https://github.com/iag0910
 */

    // Some conditions were changed using the whole string fields !!


public class Employee {

    private String title;
    private String position;
    private String e_mail;
    private String phone_number;
    private String salary;      // This field was changed;
    private String age;         // and this one was changed;

    // Creation of the constructor with parameters;

    public Employee(){
    }
    
    public Employee(String title, String position, String e_mail,
                    String phone_number, String salary, String age) {

        this.title = title;
        this.position = position;
        this.e_mail = e_mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
        public void setTitle(String title){
            this.title=title;
        }
        public void setPosition(String position){
            this.position=position;
        }
        public void setE_mail(String e_mail){
            this.e_mail=e_mail;
        }
        public void setPhone_number(String phone_number){
            this.phone_number=phone_number;
        }
        public void setSalary(String salary){
            this.salary=salary;
        }
        public void setAge(String age){
            this.age=age;
        }

    // Creation of "getters";

        public String getTitle() {
            return title;
        }
        public String getPosition(){
            return position;
        }
        public String getE_mail() {
            return e_mail;
        }
        public String getPhone_number() {
            return phone_number;
        }
        public String getSalary() {
            return salary;
        }
        public String getAge() {
            return age;
        }
}

class TestEmployee {

    public static void main(String[] args) {

    // the start of the constructor

    Employee start_empl = new Employee("<Name and surname>", "<The positiom in the company?",
                                     "<If e-mail is used>",
                                     "< If mobile cell id used>",
                                     "<Employee' salary>","<Employee' age>" );

        System.out.println("Start up loading:(this information was sent from constructor)");
        System.out.println(" Title: "+start_empl.getTitle());
        System.out.println(" Position: "+ start_empl.getPosition());
        System.out.println(" Used E-mail: " +  start_empl.getE_mail());
        System.out.println(" Used mobile number: "+ start_empl.getPhone_number());
        System.out.println(" Salary: " + start_empl.getSalary());
        System.out.println(" Age: "+ start_empl.getAge());

    // Arrays of Employees' information initialization ;
    // All the information of Employees was splitted for 6 arrays;

        String [] arr_title={" IVAN IVANOV "," PETR PRTROV "," SIDOR SIDOROV "," MAXIM MAXIMOV ",
                            " URAL URALOV " };
        String []  arr_position ={" SALES MANAGER "," SENIOR SALES MANAGER "," COUNTRY MANAGER ",
                                 " ACCOUNTANT "," FIELD ENGINEER " };
        String []  arr_email={" I.I@abc.com "," P.P@abc.com "," S.S@abc.com "," M.M@abc.com ",
                             " U.U@abc.com " }  ;
        String[]   arr_phone={" +7-988-666-11-23 ", " +7-988-666-23-23 "," +7-985-774-12-55 ",
                              " +7-985-885-12-23 "," +7-916-450-19-91 "};
        String [] arr_salary={"30000","50000","80000","80000","55000"};

        String[] arr_age={" 22 "," 28 "," 42 "," 45 "," 41 "};

    // The array for "collecting" of splitted datas;

        String [] arr_summ= new String[5];

    // The array for experiments with "setters"/"getters";

        Employee fill_empl= new Employee();

    // The array for experiments with

        System.out.println();
            for (int i=0;i<5;i++){

     // "Collecting" of employees information;

               arr_summ[i]= arr_title[i]+arr_position[i]+arr_email[i]+arr_phone[i]+arr_salary[i]+arr_age[i];
               System.out.println();
               System.out.println(arr_summ[i]);

    // Experiments with "getters"/"setters"

               fill_empl.setTitle(arr_title[i]);
               System.out.println(" Title: "+ fill_empl.getTitle());

               fill_empl.setPosition(arr_position[i]);
               System.out.println(" Position: "+ fill_empl.getPosition());

               fill_empl.setE_mail(arr_email[i]);
               System.out.println(" Used E-mail: " +  fill_empl.getE_mail());

               fill_empl.setPhone_number(arr_phone[i]);
               System.out.println(" Used mobile number: "+ fill_empl.getPhone_number());

               fill_empl.setSalary(arr_salary[i]);
               System.out.println(" Salary: " + fill_empl.getSalary());

               fill_empl.setAge(arr_age[i]);
               System.out.println(" Age: "+ fill_empl.getAge());
        }
    }
}