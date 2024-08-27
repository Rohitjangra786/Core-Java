public class GlobalVariable {
    static int a=5;
    public static void main(String[] args) {
        float aa= (float)a; //conversion of the global variable into float data type we also can do woithout the conversion
        float b=12.1f; 
        float c = aa*b;// multiply both the data
        
        System.out.println(c);
    }
    
}
