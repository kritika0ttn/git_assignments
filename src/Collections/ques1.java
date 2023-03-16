package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ques1 {
    public static  void main(String[]args){
        List<Double> num = Arrays.asList(34.1,32.0,8.4,78.0,9.8);
        float sum  = 0;
        Iterator<Double> iterator = num.iterator();
        while (iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
