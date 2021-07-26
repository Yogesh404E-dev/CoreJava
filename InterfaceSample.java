interface A{
    void Adisplay();
}
interface B{
    void Bdisplay();
}
class AB implements A,B{
    public void Adisplay(){
        System.out.println("From Adisplay method");
    }
    public void Bdisplay(){
        System.out.println("From Bdisplay method");
    }
}

class InterfaceSample
{
    static public void main(String arg[])
    {
            AB obj = new AB();
            obj.Adisplay();
            obj.Bdisplay();
    }
}