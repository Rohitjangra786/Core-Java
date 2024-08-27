public class ConditionaOperator {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        

        System.out.println(a++);
        System.out.println(b--);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(++a + ++a);
        System.out.println(--a + --b + a++ + b++ + " java");

        System.out.println(a>b? "A is Bigger" : "B is Bigger");   //Bigger of both number

        System.out.println(a%2==0 ? "A is Even": "A is ODD");       // finding the number is Even and ODD using conditional operator.
    }
}
