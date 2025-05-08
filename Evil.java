import java.util.*;
class Evil
{
    int num;
    int bin;
    Scanner in= new Scanner(System.in);
    Evil()
    {
        num= 0;
        bin= 0;
    }
    void AcceptNum()
    {
        System.out.println("Enter the number");
        num= in.nextInt();
    }
    void bin(int x)
    {
        int t=0, rb=0, y=0, z=0, l=0;
        while(x!=0)
        {
            t= x%2;
            x= x/2;
            rb= rb*10+t;
            if(t==0)
            {
                z= z+1;
            }
        }
        while(rb!=0)
        {
            t= rb%10;
            l= l*10+t;
            rb= rb/10;
            if(t==0)
            {
                y= y+1;
            }
        }
        if(z==y)
        {
            bin= l;
            System.out.println(num+"= "+bin);
        }
        else
        {
            bin= l*(int)Math.pow(10, z-y);
            System.out.println(num+"= "+bin);
        }
    }
    void check()
    {
        int t=0, h=0;
        while(bin!=0)
        {
            t= bin%10;
            bin= bin/10;
            if(t==1)
            {
                h= h+1;
            }
        }
        if(h%2==0)
        {
            System.out.println(num+" is an Evil number");
        }
        else
        {
            System.out.println(num+" is not an Evil number");
        }
    }
    public static void main()
    {
        Evil ob= new Evil();
        ob.AcceptNum();
        ob.bin(ob.num);
        ob.check();
    }
}