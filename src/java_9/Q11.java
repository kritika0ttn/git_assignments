package java_9;
public class Q11 {
    public static void main(String[] args)
    {
        record student(String name, int age, int id){
            static int counter=0;
            static void increase(){
                counter++;
            }
            student{
                increase();
            }
        };
        student sc=new student("Shivam",24,1);
        student st=new student("Tyagi",23,2);
        System.out.println(sc.equals(st));
        System.out.println("counter="+student.counter);
    }
}