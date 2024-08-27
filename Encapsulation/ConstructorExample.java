package Encapsulation;

class ConstructorExample {
        private int id=5;
        private String name;
        private int age;
        private String address;
        private String email;
        
        public ConstructorExample(){
            System.out.println(address);
            System.out.println("Default Constructor");
        }

        public ConstructorExample(int a){
            System.out.println(a);
            System.out.println("Default");
        }

        public static void main(String[] args){
            ConstructorExample obj=new ConstructorExample();
            ConstructorExample obj1=new ConstructorExample(5);
            
            
        }
        
}