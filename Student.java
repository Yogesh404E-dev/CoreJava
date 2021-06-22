class Student{
   String name;
   int roll_no;
   Student(){
       name ="Rana";
       roll_no = 147;
   } 
   Student(String str, int n){
       name = str;
       roll_no = n;
   }
   public static void main(String agr[]){
       Student s1 = new Student();
       Student s2 = new Student("Rudra",148);
       System.out.println("Recodr from default object");
       System.out.println(s1.name);
       System.out.println(s1.roll_no);
       System.out.println("Recodr from parameterize object");
       System.out.println(s2.name);
       System.out.println(s2.roll_no);
   }

}