import java.util.Scanner;
//Import scanner util package with scanner class
class InputFunctions{
    public static void main(String[] args) 
 {
     //creating variables for string int float and double data-type
     String name;int a;float b;double c;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a  String =:");
     name = sc.next();//For String data type input from keyboard
     System.out.println("Enter a  Integer =:");
     a = sc.nextInt();//For Integer data type input from keyboard
     System.out.println("Enter a  Float =:");
     b = sc.nextFloat();//For Float data type input from keyboard
     System.out.println("Enter a  Double =:");
     c = sc.nextDouble();//For Double data type input from keyboard
    

 }

}