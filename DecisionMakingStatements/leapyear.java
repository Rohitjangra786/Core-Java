class leapyear {
    public static void main(String[] args) {
        int a;
        a= 1900;

        if (a%400==0|| (a%4==0 && a%100!=0)) {
            System.out.println("Leap year");
            
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    
}
