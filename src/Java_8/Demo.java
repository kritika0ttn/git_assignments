package Java_8;

 class Demo implements DemoInterface{
     public static void main(String[] args) {
         DemoInterface dm=String::new;
         String str= dm.myMethod(new char[]{'k','r','i','t','i','k','a'});
         System.out.println(str);
     }
    @Override
     public String myMethod(char[] chars){
         return null;
    }
}
