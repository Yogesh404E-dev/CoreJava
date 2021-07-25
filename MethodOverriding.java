class P{
    void display()
    {
        System.out.println("I am from P class dispaly");
    }
}
class C extends P{
    void display()
    {
        // calling parent class method using suer keyword
        //super.display();
        System.out.println("I am from C class dispaly");
    }
}
class MethodOverriding
{
    public static void main(String arg[])
    {
         C obj = new C();
        obj.display();
    }
}

// o/p --> https://i.imgur.com/bJcyKnw.png https://i.imgur.com/ZyUgCh6.png