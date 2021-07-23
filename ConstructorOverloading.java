class A{
    //default constructor 
    A(){
        System.out.println("I m constructor 1");
    }
    //parameterized constructor
    A(int a){
        System.out.println("I m constructor 2 and a="+a);
    }
}

class ConstructorOverloading{

    public static void main(String agrs[]){

        A obj1 = new A();//call default construcotr
        A obj2 = new A(10); //call parameterized constructor 
    }
}