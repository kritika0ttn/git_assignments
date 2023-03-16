package java_9;


sealed interface Snacks permits Biscuit,Chips{
   public int numberofpackets();
}
record Biscuit() implements Snacks {
    @Override
    public int numberofpackets() {
        return 5;
    }
}
record Chips() implements Snacks{
    @Override
    public int numberofpackets()
    {
        return 10;
    }
}
public class Q12{
    public static void main(String[] args){
        Chips sc=new Chips();
        System.out.println("NO. of chips packets: "+sc.numberofpackets());
        Biscuit st=new Biscuit();
        System.out.println("NO. of biscuit packets: "+st.numberofpackets());
    }
}
