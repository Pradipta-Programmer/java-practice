import java.util.*;
class Library
{
    String name;
    String author;
    double p;
    Library(String n, String a, double d)
    {
        name= n;
        author= a;
        p= d;
    }
    void show()
    {
        System.out.println(name+" is the name of book");
        System.out.println(author+" is the author");
        System.out.println(p+" is the price");
    }
}
public class Compute extends Library
{
    int d;
    double f;
    Compute(String name, String author, double p, int de)
    {
        super(name, author, p);
        d= de;
    }
    void fine()
    {
        if(d<=7)
        {
            f=0;
        }
        else
        {
            if((d>=8)&&(d<=12))
            {
                f= (d-7)*(2.00);
            }
            else if((d>=13)&&(d<=17))
            {
                f= (d-7)*(3.00);
            }
            if(d>17)
            {
                f= (d-7)*(5.00);
            }
        }
    }
    void show()
    {
        super.show();
        System.out.println("Number of days:- "+d);
        System.out.println("Fine:- "+f);
        System.out.println("Total amount:- "+((0.02*p*d)+f));
    }
}