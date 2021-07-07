class ThisDemoWithInstacevVariables
{
    int a = 10;
    void display(){
        int a = 40;
        System.out.println("this local a = "+a);//this call local variabe a which is 40 
        System.out.println("this is  instance a = "+this.a);//this call instance variable a which is 10 
    }
    public static void main(String agr[]){
        ThisDemoWithInstacevVariables obj = new ThisDemoWithInstacevVariables();
        obj.display();
    }
}

//o/p -> https://i.imgur.com/ki6kIih.png