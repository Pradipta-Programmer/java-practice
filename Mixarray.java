import java.util.*;
class Mixarray
{
    int arr[];
    int cap;
    static Scanner in= new Scanner(System.in);
    Mixarray(int mm)
    {
        cap= mm;
        arr= new int[cap];
    }
    void input()
    {
        System.out.println("Enter the elements");
        int i=0;
        for(i=0; i<cap; i++)
        {
            arr[i]= in.nextInt();
        }
    }
    Mixarray mix(Mixarray P, Mixarray Q)
    {
        int i=0, j;
        for(i=0; i<3; i++)
        {
            this.arr[i]= P.arr[i];
        }
        i= 2;
        for(j=0; j<3; j++)
        {
            i= i+1;
            this.arr[i]= Q.arr[j];
        }
        return this;
    }
    void display()
    {
        int i;
        System.out.print("Resultant array:- ");
        for(i=0; i<6; i++)
        {
            System.out.print(this.arr[i]+", ");
        }
    }
    public static void main()
    {
        System.out.println("Enter the capacity of array 1");
        int c= in.nextInt();
        Mixarray ob1= new Mixarray(c);
        ob1.input();
        System.out.println("Enter the capacity of array 2");
        c= in.nextInt();
        Mixarray ob2= new Mixarray(c);
        ob2.input();
        Mixarray ob3= new Mixarray(6);
        ob3.mix(ob1, ob2);
        ob3.display();
    }
}