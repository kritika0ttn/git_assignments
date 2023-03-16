package assingment_intro;
public class Employee {
    String firstname;
    String lastname;
    int age;
    String designation;
    Employee(){
        String firstname="kritika";
        String lastname="pharswal";
        int age=22;
        String designation="trainee";
    }
    Employee(String a, String b, int c, String d){
        this.firstname=a;
        this.lastname=b;
        this.age=c;
        this.designation=d;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    // toString
    @Override
    public String toString()
    {
        return "Employee { " +
                "First Name - " + firstname + " | " +
                "Last Name - " + lastname + " | " +
                "Age - " + age + " | " +
                "Designation - " + designation + " }";
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee("kritika", "pharswal", 22, "Trainee");
        e1.setFirstname("Hema");
        e1.setLastname("patidar");
        e2.getDesignation();
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}







