class Parent
{
    int a = 5;
    void display(){
            System.out.println("This is from parent class");
    }

}
class Child extends Parent
{
    int b = 10;
    void show(){
                System.out.println("This is from parent class");
        }
}

class SingleInheritance{
    public static void main(String agr[]){
        Child c = new Child(); //create child class object 
        // accessing  varible b using child class object (same class object) 
        System.out.println(" b from child = "+c.b);
        // accessing  method  show() using child class object (same class object) 
        c.show();
        
         // accessing  varible a using child class object (inherit from parent class and object child class) 
        System.out.println(" a from  parent = "+c.a);
         // accessing  method display() using child class object (inherit from parent class and object child class) 
        c.display();
    }
}

// o/p-> https://i.imgur.com/JFduedQ.png