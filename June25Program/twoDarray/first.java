
package June25Program.twoDarray;

public class first {
    public static void main(String[] args) {
       int  a [][]= {{4},{6,7},{5,9,8}};
            //System.out.println(a[0][1]);
            //for (int i = 0; i < a.length; i++) {
                for (int [] j : a) {
                    for (int k : j) {

                        if (k%2==0) {
                            System.out.println("Even Number in the 2D-Array :"+k);
                        }
                        
                        
                    }
                    
                }
            
           
       
    }
}
