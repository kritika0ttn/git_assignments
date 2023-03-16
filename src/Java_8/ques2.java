package Java_8;

interface  MyInterface{
    int methodRef(int x, int y);
}

public class ques2 {
    static int multi(int x, int y){
        return x*y;
    }

    int sum(int x, int y){
        return x+y;
    }

    int sub(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        MyInterface multi= ques2::multi;
        System.out.println("multiplication :"+multi.methodRef(4,6));
        MyInterface sum = new ques2()::sum;
        System.out.println("Addition :"+sum.methodRef(7,8));
        MyInterface sub = new ques2()::sub;
        System.out.println("Subtraction :"+sub.methodRef(9,5));
    }
}
