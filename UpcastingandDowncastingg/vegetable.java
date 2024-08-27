package UpcastingandDowncastingg;

public class vegetable {
    public static void main(String[] args) {
    
    String regionn = "India";
    System.out.println(regionn);

    blinkit bb= new blinkit();
    Fruit ff = new Fruit();
    blinkit bbb=(blinkit)ff;
    System.out.println(bbb);
    


    }
}
