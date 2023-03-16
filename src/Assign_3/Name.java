package Assign_3;


import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Name extends User {
    public static void main(String[] args) throws IOException {
        ArrayList<User> Userlist = new ArrayList<>();
        String txt;
        FileWriter file = new FileWriter("/home/kritika/output.txt");
        BufferedWriter br = new BufferedWriter(file);
        Scanner sc = new Scanner(System.in);
        while (true) {
            User u = new User();
            Userlist.add(u);
            System.out.print("Enter First Name:");
            u.FirstName = sc.next();
            br.append(u.FirstName);
            br.append(" ");
            System.out.println("Enter Last Name:");
            u.LastName = sc.next();
            br.append(u.LastName);
            br.newLine();
            System.out.println("Enter age:");
            u.age = sc.next();
            br.append(u.age);
            br.newLine();
            System.out.println("Enter Number:");
            u.Number = sc.next();
            br.append(u.Number);
            br.newLine();
            br.newLine();
            System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
            txt = sc.next();

            if ("QUIT".equalsIgnoreCase(txt)) {
                break;
            }

        }
    }
}