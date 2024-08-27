package June25Program;

public class program9 {
    public static void main(String[] args) {
        char [] a= {'#','v','6','r','@','_','5'};
    
        for (int i = 0; i < a.length; i++) {
            if (a[i]=='@' || a[i]=='!' || a[i]=='#' || a[i]=='$' || a[i]=='%' || a[i]=='^' || a[i]=='&' || a[i]=='*' 
            || a[i]=='_') {
                System.out.println(a[i]); 
                }
                
        }
        
    }
}
