public class BuzzNumber {
    public static void main(String[] args) {
        int n=48;
        int last_digit=0;
        last_digit=n%10;
        if(n%7==0 || last_digit==7){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Not Buzz");
        }
    }

}