import java.util.*;
class Prog3
{
   public static void main()
   {
       Scanner in= new Scanner(System.in);
       System.out.println("Enter the 5 integers");
       int n[]= new int[5];
       int i, j, t=0;
       for(i=0; i<5; i++)
       {
           n[i]= in.nextInt();
       }
       for(i=0; i<5; i++)
       {
           for(j=0; j<4; j++)
           {
               if(n[j]>n[j+1])
               {
                   t= n[j];
                   n[j]= n[j+1];
                   n[j+1]= t;
               }
           }
       }
       for(i=0; i<5; i++)
       {
           System.out.println(n[i]);
       }
   }
}