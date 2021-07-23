class A{
    int a = 20;
    void display(){
              System.out.println("This is from A class");
    }

}
class B extends A {
    int b = 30;
    void dis(){
              System.out.println("This is from B class");
    }
}
class C extends B {
    int c = 25;
    void show(){
              System.out.println("This is from C class");
    }
}
class MultiLevelInheritance {
    public static void main(String agr[]){

        C obj = new C(); //create child class object 
        
        // accessing  varible a using C class object 
        System.out.println(" a from A class = "+obj.a);
        // accessing  method  display() using C class object 
        obj.display();
        
         // accessing  varible b using C class object 
        System.out.println(" b from  parent = "+obj.b);
         // accessing  method dis() using C class object 
            obj.display();

        // accessing  varible b using C class object 
        System.out.println(" c from  parent = "+obj.c);
         // accessing  method show() using C class object 
            obj.show();
    }
}


// o/p ->  https://i.imgur.com/bcYm87d.png