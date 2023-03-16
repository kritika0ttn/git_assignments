package assingment_intro;

import java.util.Scanner;

public class ques3 {

    public double Area_circle(int r){
        double area=3.14*r*r;
        return area;
    }
    public double Circumfrence(int r){
        double c=2*3.14*r;
        return c;
    }

    public static void main(String[] args ){
         ques3 q3= new ques3();
         System.out.println("****Menu****");
         System.out.println("1. Area of a circle");
         System.out.println("2. circumfrence of a circle");
         System.out.println("3. Exit");
        Scanner s= new Scanner(System.in);
        System.out.println("enter your choice : ");
        int choice=s.nextInt();
//        Scanner s= new Scanner(System.in);
        System.out.println("enter radius : ");
        int r=s.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println(q3.Area_circle(r));
                break;
            case 2:
                System.out.println( q3.Circumfrence(r));
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}
