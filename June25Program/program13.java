package June25Program;
public class program13 {
    public static void main(String[] args) {
        char [] a= {'#','t','r','R','@','_','5','o','H','q'};
            int count1= 0; //uppercase
            int count2= 0; //lowercase
            int count3= 0; //special character
            int count4= 0; //digits

        for (int i = 0; i < a.length; i++) {
            if (122>=a[i] && a[i]>=97) {
                count1=count1+1;
                }
            }
            System.out.println("lowercase are : "+count1);
            

        for (int i = 0; i < a.length; i++) {
                if (90>=a[i] && a[i]>=65) {
                    count2=count2+1;
                    
                }
        } 
        System.out.println("Uppercase are : "+count2);
    
        for (int i = 0; i < a.length; i++) {
            if (57>=a[i] && a[i]>=48) {
                count3=count3+1;
                
            }}
            System.out.println("Digits are : "+count3);
       
            for (int i = 0; i < a.length; i++) {
                if ((a[i]>=31 && a[i]<=47) || (a[i]>=58 && a[i]<=64) || (a[i]>=91 && a[i]<=96) 
                || (a[i]>=123 && a[i]<=126) || (a[i]==127)) {
                   count4=count4+1;
                    
                }}
            System.out.println("Special Character are : "+count4);
    }
}
