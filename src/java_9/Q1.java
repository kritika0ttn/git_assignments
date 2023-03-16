package java_9;

import java.util.Scanner;

interface Example_private_iterface{
    private static String revString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static  String toUpperRev(String str){
        String upStr = str.toUpperCase();
        return revString(upStr);
    }
    static String toLowerRev(String str){
        String lowRev = str.toLowerCase();
        return revString(lowRev);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string=");
        String str1=sc.nextLine();
        System.out.println(Example_private_iterface.toLowerRev(str1));
        System.out.println(Example_private_iterface.toUpperRev(str1));

    }

}
