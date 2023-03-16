package assingment_intro;
public class ques1 {
    static String FirstName= "Kritika";
    static String LastName = "Pharswal";
    static int  age_field=22;

    static {
        System.out.println(FirstName);
    }
     public static void Display(){
         System.out.println(LastName);
         System.out.println(age_field);
     }
    public static void main(String[] args){
        ques1 q= new ques1();
        q.Display();
    }
}
