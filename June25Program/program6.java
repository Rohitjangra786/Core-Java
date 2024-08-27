package June25Program;
public class program6 {
    public static void main(String[] args) {
        int []a={24,34,5,13};
        int count=0;
        
        for(int i=0;i<a.length;i++){
            if (a[i]==1 || a[i]==0) {
                count=count+1;
                System.out.println("Element at index "+ count );
            }
            
            
        }
}}
