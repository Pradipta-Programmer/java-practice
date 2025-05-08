import java.util.*;
class Split
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Sen");
        String s= in.nextLine();
        String A[]= s.split(" ");
        for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }
    }
}