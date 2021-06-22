class VariableExample{
    static int c = 5;// static variable 
    int a=10; // instance variabele
    public static void main(String arg[]){
        int b =30;// local variable 
        System.out.println("value of local variable b:"+b);
        System.out.println("value of  static variable c:"+c);
        /*
        System.out.println("value of instance variable a:"+a);
        You got error like non-static variable a cannot be referenced from a static context
        need to create object of VariableExample class and using this access instance variable
        */
        VariableExample vobj = new VariableExample();
        System.out.println("value of instance variable a:"+vobj.a);
    }
}