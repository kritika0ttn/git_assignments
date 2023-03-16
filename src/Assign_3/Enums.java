package Assign_3;
public class Enums {
        public static void main(String[] args){
            System.out.println("Price of House");
            for(house h:house.values())
                System.out.println(h+"house"+h.getPrice());
        }
    }
    enum house{
        House1(20000),house2(300000),house3(400000),house4(500000);
        private int price;
        house(int pr){
            price=pr;
        }
        int getPrice()
        {
            return price;
        }
}
