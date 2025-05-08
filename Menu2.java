import java.util.*;
class Menu2
{
    int menu1(int c, String s)
    {
        int p= c/2;
        s= (Integer.toString(c%2))+ s;
        if(p==0)
        {
            s= s.trim();
            return (Integer.valueOf(s));
        }
        else
        {
            return(menu1(p, s));
        }
    }
    String menu2(String c, String s)
    {
        int l= c.length();
        int f=0;
        for(int i=l-1; i>=0; i--)
        {
            f= f+1;
            if((f==4)||(i==0))
            {
                String h= c.substring(i, l);
                c= c.substring(0, i);
                f= Integer.valueOf(h, 2);
                if(f== 10)
                {
                    s= "A"+ s;
                }
                else if(f== 11)
                {
                    s= "B"+ s;
                }
                else if(f== 12)
                {
                    s= "C"+ s;
                }
                else if(f== 13)
                {
                    s= "D"+ s;
                }
                else if(f== 14)
                {
                    s= "E"+ s;
                }
                else if(f== 15)
                {
                    s= "F"+ s;
                }
                else
                {
                    s= (Integer.toString(f))+ s;
                }
                break;
            }
        }
        if ((c=="0")||(c=="")) 
        {
            return s;
        }
        return (menu2(c, s));
    }
    int menu3(int c, String s)
    {
        String g= Integer.toString(c);
        int f= g.length()-1;
        int t= c/((int)Math.pow(10, f));
        int h= t*((int)Math.pow(8, f));
        if(s!=" ")
        {
            h= h+ (Integer.valueOf(s));
        }
        s= Integer.toString(h);
        s= s.trim();
        c= c%((int)Math.pow(10, f));
        if(c== 0)
        {
            return (Integer.valueOf(s));
        }
        return (menu3(c, s));
    }
    String menu4(int c, String s)
    {
        int p= c/16;
        int q= c%16;
        if(q== 10)
        {
            s= "A"+ s;
        }
        else if(q== 11)
        {
            s= "B"+ s;
        }
        else if(q== 12)
        {
            s= "C"+ s;
        }
        else if(q== 13)
        {
            s= "D"+ s;
        }
        else if(q== 14)
        {
            s= "E"+ s;
        }
        else if(q== 15)
        {
            s= "F"+ s;
        }
        else
        {
            s= (Integer.toString(q))+ s;
            s= s.trim();
        }
        if(p==0)
        {
            s= s.trim();
            return (s);
        }
        else
        {
            return(menu4(p, s));
        }
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("1.Do you want to convert a decimal to binary equivalent using recursion");
        System.out.println("2.Do you want to convert a binary to hexadecimal equivalent using recursion");
        System.out.println("3.Do you want to convert an octal to decimal equivalent using recursion");
        System.out.println("4.Do you want to convert a decimal to hexadecimal equivalent using recursion");
        System.out.println("Choose one option");
        int n= in.nextInt();
        Menu2 ob= new Menu2();
        switch(n)
        {
            case 1:
            System.out.println("Enter the number");
            int x= in.nextInt();
            int r= ob.menu1(x, " ");
            System.out.println(r);
            break;
            case 2:
            System.out.println("Enter the number");
            String y= in.next();
            String z= ob.menu2(y, " ");
            System.out.println(z);
            break;
            case 3:
            System.out.println("Enter the number");
            x= in.nextInt();
            r= ob.menu3(x, " ");
            System.out.println(r);
            break;
            case 4:
            System.out.println("Enter the number");
            x= in.nextInt();
            z= ob.menu4(x, " ");
            System.out.println(z);
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}