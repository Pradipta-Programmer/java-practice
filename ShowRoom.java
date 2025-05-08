import java.util.*;
class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amt;
    ShowRoom()
    {
        name=" ";
        mobno= 0;
        cost= 0.0;
        dis= 0.0;
        amt= 0.0;
    }
    void input()
    {
        Scanner in= new Scanner(System.in);
        name= in.nextLine();
        mobno= in.nextLong();
        cost= in.nextDouble();
    }
    void calculate()
    {
        if(cost<=10000)
        {
            dis= (5/100) * cost;
        }
        else if((cost>10000)||(cost<=20000))
        {
            dis= (10/100) * cost;
            System.out.println(dis);
        }
        else if((cost>20000)||(cost<=35000))
        {
            dis= (15/100) * cost;  
        }
        else if(cost>35000)
        {
            dis= (20/100) * cost;
        }
        System.out.println(dis);
        amt= cost-dis;
    }
    void display()
    {
        System.out.println("Customer name= "+name);
        System.out.println("Mobile number= "+mobno);
        System.out.println("Amount= "+amt);
    }
    public static void main()
    {
        ShowRoom ob= new ShowRoom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}