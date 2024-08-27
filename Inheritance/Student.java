package Inheritance;

public class Student {
    String name;
    int roll_no;
    long contact_n0;
    String gender;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jyoti";
        s1.roll_no=78;
        s1.contact_n0=1234567890L;
         System.out.println(s1.name);
         System.out.println(s1.roll_no);
         System.out.println(s1.gender);

         Student s2 = new Student();
         s2.name = "Rohan";
         s2.contact_n0=234524424;

         s2.roll_no=45;
         System.out.println(s2.contact_n0);

         System.out.println(s2.name);
         System.out.println(s2.roll_no);
         System.out.println(s2.contact_n0);
         System.out.println(s2.gender);

         s1.gender="female";


    }
}
