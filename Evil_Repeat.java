import java.util.*;
class Evil_Repeat
{
    int num, bin;
    static Scanner in= new Scanner(System.in);
    Evil_Repeat()
    {
        num= 0;
        bin= 0;
    }
    void acceptNum()
    {
        System.out.println("Enter the number");
        num= in.nextInt();
    }
    void rec_bin(int x)
    {
        int r= x%2;
        if(x==1)
        {
            bin= (bin*10)+ 1;
            return;
        }
        if(r==0)
        {
            bin= (bin*10)+ 0;
            rec_bin(x/2);
        }
        else
        {
            bin= (bin*10)+ 1;
            rec_bin(x/2);
        }
    }
    void check()
    {
        rec_bin(num);
        int e=0;
        while(bin!=0)
        {
            int t= bin%10;
            if(t==1)
            {
                e= e+1;
            }
            bin= bin/10;
        }
        if(e%2==0)
        {
            System.out.println(num+" is an Evil Number");
        }
        else
        {
            System.out.println(num+" is not an Evil Number");
        }
    }
    public static void main()
    {
        Evil_Repeat ob= new Evil_Repeat();
        ob.acceptNum();
        ob.check();
    }
}