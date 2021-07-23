class P
{
    int a = 20;
    void dipaly(){
        System.out.println("From class P");
    }
}

class C extends P
{
    int b = 20;
    void show(){
        System.out.println("From class C");
    }
}

class D extends P
{
    int d = 20;
    void showd(){
        System.out.println("From class D");
    }
}

class HierarchyInheritance
{
    public static void main(String agr[]){
    
        C obj = new C();

        //accesing C class variables and method 
        obj.show();
        System.out.println("Value of b from C class = " + obj.b);
        //accessing parent class P variables and methods
        obj.dipaly();
        System.out.println("Value of a from P class = " + obj.a);

            D obj1 = new D(); 
        //accessing parent class D variables and methods using new object obj1
        obj1.showd();
        System.out.println("Value of d from D class = " + obj1.d);

    }
}



// o/p  ->  https://i.imgur.com/iE8P7tM.png