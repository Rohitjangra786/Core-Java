package June25Program;
public class program4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,19};
        int count = 0;
        int length= arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count= count+1;
                }
        }
        System.out.println("Even Number in array : "+count);
        System.out.println("Odd number in array : " + (length-count));//get the even number

        System.out.println("Difference b/w even and odd is : " +((length-count)-count));
    }
        
    
}
