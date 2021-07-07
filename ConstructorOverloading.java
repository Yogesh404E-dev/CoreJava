class A{
    A(){
        System.out.println("I m constructor 1");
    }
    A(int a){
        System.out.println("I m constorer 2 and a="+a);
    }
}

class ConstructorOverloading{
    public static void main(String agrs[]){
        A obj1 = new A();
        A obj2 = new A(10);
    }
}