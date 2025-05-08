import java.util.*;
class Object
{
    String name;
    Object()
    {
        name= "";
    }
    void accept()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name");
        name= in.nextLine();
    }
    String merge(Object A, Object B)
    {
        name= A.name + B.name;
        return name;
    }
    Object merge(Object A)
    {
        Object B= new Object();
        B.name= A.name + this.name;
        return B;
    }
    void display()
    {
        System.out.println("Merged Name:- "+name);
    }
    public static void main()
    {
        Object ob1= new Object();
        ob1.accept();
        Object ob2= new Object();
        ob2.accept();
        Object ob3= new Object();
        ob3.merge(ob1, ob2);
        System.out.println("This is ob3.merge(ob1, ob2)");
        ob3.display();
        Object ob4= ob2.merge(ob1);
        System.out.println("This is Object ob4= ob2.merge(ob1)");
        ob4.display();
    }
}