package assingment_intro;

import java.util.*;

public class ques2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = "";

        while(true)
        {
            String s = sc.nextLine();
            if(s.equals("XDONE"))
            {
                break;
            }
            inputString += s + "\n";
        }
        System.out.println("text Entered : ");
        System.out.println(inputString);
    }

}