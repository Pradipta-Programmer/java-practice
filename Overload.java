class Overload
{
    void series(int x, int n)
    {
        double s=0.0;
        for(int i=1; i<=n; i++)
        {
            s= s+ (Math.pow(x,i));
        }
        System.out.println(s+ " ");
    }
    void series(int p)
    {
        for(int i=1; i<=p; i++)
        {
            System.out.print((i*i*i)-1 +" ");
        }
    }
    void series()
    {
        double s= 0.0;
        for(int i=2; i<=10; i++)
        {
            s= s+ (1.0/i);
        }
        System.out.print(s+ " ");
    }
}