package java_A;
import java.io.*;
public class ques1 {
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int c= a/b;

        } catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("it will work anyway");
        }

    }
}
