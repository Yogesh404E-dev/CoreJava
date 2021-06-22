import java.io.*;  
//Import  Io package with all classes we use here BufferedReaderClass
class BufferedReaderClassExample{

public static void main(String[] args) 
 {
InputStreamReader  ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);

try {

     System.out.println("Enter a  String =:");
     String name = br.readLine();//For String data type input from keyboard
     System.out.println("Enter a  Integer =:");
     int a = Integer.parseInt(br.readLine());//For Integer data type input from keyboard
     System.out.println("Enter a  Float =:");
     float b = Float.parseFloat(br.readLine());//For Float data type input from keyboard
}catch (Exception e) {
        //handle your exception, probably with a message
        //showing a basic example
        System.out.println("Error while reading the data.");
    }
 }
}