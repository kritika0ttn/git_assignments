package Java_8b;

import java.util.*;
import java.io.*;
class main{
    public static class Employee {
        String Fullname;
        Long salary;
        String city;

        Employee(String fullname, Long salary, String city) {
            this.Fullname = fullname;
            this.salary = salary;
            this.city = city;
        }
    }
    public static List<Employee> create_emp(){
        return Arrays.asList(
                new Employee("kritika",30000L,"Delhi"),
                new Employee("gini",4000L,"Delhi"),
                new Employee("vijay",10000L,"Noida"),
                new Employee("jai",3500L,"Delhi"));
    }

    public static void main(String[] args) {
        List<Employee>emp1= create_emp();
        emp1.stream()
                .filter(e->e.salary<5000)
                .filter(e->e.city=="Delhi")
                .forEach(e-> System.out.println(e.Fullname.split(" ")[0]));
    }

}

