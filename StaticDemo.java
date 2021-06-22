class StaticDemo
{
    static int a= 5;

    static void dispaly(){
        System.out.println("I am from static method");
    }
    static{
        System.out.println("I am from static block");
    }
    public static void main(String arg[]){
        System.out.println("I am  static variable a =" +a);
        dispaly();
    }
}
//output Screen short https://i.imgur.com/tP3LJpd.png