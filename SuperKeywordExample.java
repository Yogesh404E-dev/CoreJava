class P
{
    int a = 01;
    P(){
         System.out.println("I am from Parent construntor ");
    }
    void display()
    {
        System.out.println("I am from P class ");
    }
}
class C extends P 
{
   int a = 20;
   C(){
       System.out.println("I am from Child construntor ");
   }
    void display()
    {
        System.out.println("I am from C class ");
        System.out.println("a variable from C class "+a);
        // calling parent class variable using suer keyword
        System.out.println("a variable from P class "+super.a);
        // calling parent class method using suer keyword
        super.display();

    }

}


class SuperKeywordExample
{
    public static void main(String arg[]){
        C obj = new C();
        obj.display();
    }
}

// o/p --> https://i.imgur.com/xc49bY3.png
// o/p -->  with constructor https://i.imgur.com/mcB3RQY.png