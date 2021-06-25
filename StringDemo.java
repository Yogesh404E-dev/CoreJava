class StringDemo
{
    public static void main(String arg[]){
        String str = "Hello";
        String str2 = new String("  Yogesh  ");
        System.out.println(str);
        //use the concat method of string 
        String str1= str.concat(" Well come");
        //we apply concatnation but string object str dont change thats why string is immutable 
        System.out.println(str);
        //Now when you store that conctnet in new str1 oject the new memory is create for the str1 
        System.out.println(str1);
        //lenght function on string str
        System.out.println(str.length());
        //indexof method when we pass the string ites retun index of that string but when you ass the string that occure in multiple time the 
        // it return first time index 
        System.out.println(str.indexOf("l"));

        //charAt and pass indesx number it return the character on that index
        System.out.println("character at = "+ str.charAt(4));
        //toUperCase it convert the string to uer case 
        System.out.println("capital letters  = "+ str.toUpperCase());
        // compare to comapring two string when the two string is exactl same it return zero if two string character is diifernt the string is 
        // Whwn we pass the hello it differnt from Hello and it resturn unicode of captial H minus unicode of small h it -32
        System.out.println("comapre to  = "+ str.compareTo("Helo"));
        //trim is remove white spaces from bigning ane ending of word
        System.out.println("remove white spaces   = "+ str2.trim());
    }   
}

//output > https://i.imgur.com/qpT9Xby.png
