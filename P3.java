class P3
{
     public static void main()
     {
         int i, j, k, t=2, p=3, r=2, a=6, l=1;
         for(i=1; i<=4; i++)
         {
             for(j=1; j<=i; j++)
             {
                 for(k=1; k<=p; k++)
                 {
                     System.out.print(" ");
                 }
                 System.out.print(t);
                 t= t-1;
             }
             System.out.println();
             t= t+r;
             r= r+1;
             p= p-1;
         }
         for(i=1; i<=3; i++)
         {
             for(j=3; j>=i; j--)
             {
                 for(k=1; k<=l; k++)
                 {
                     System.out.print(" ");
                 }
                 System.out.print(a);
             }
             System.out.println();
             a= a+1;
             l= l+1;
         }
     }
}