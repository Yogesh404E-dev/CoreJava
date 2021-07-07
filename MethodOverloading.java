class A{
    void display(){
        System.out.println("From display no paramter");
    }
    void display(int a){
        System.out.println("From display  paramter a = " +a);
    }
}
class MethodOverloading
{
    public static void main(String agrs[])
    {
        A obj = new A();
        obj.display();//method no parameter 
        obj.display(20);//method with one paramter 
    }   
}
//output 
//https://i.imgur.com/Yo400jP.png