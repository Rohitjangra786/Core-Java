package UpcastingandDowncastingg.PolyMorohism;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class rohit {

    public static void rohi(){
        System.out.println("Hi");
        String path= "C:\\Users\\Rohit\\Desktop\\JAVA\\Exception\\rohit.txt";
        try {
            FileOutputStream f = new FileOutputStream(path);
        } catch (Exception FileNotFoundException) {
            System.out.println(FileNotFoundException.getMessage());
            // FileNotFoundException.printStackTrace(); we can trace the
        }
        
    }
    public static void main(String[] args){
        System.out.println("Hi Exception can occur");
        rohi();
    }
    // public static void rohi() throws FileNotFoundException{
    //     System.out.println("Hi");
        
    //     String path= "C:\\Users\\Rohit\\Desktop\\JAVA\\Exception\\rohit.txt";
    //     FileOutputStream f = new FileOutputStream(path);
    // }
    // public static void main(String[] args) throws FileNotFoundException{
    //     System.out.println("Hi Exception can occur");
    //     rohi();
    // }
}


