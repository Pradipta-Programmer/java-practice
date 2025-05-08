import java.util.*;
class PigLatin
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        s= s.toUpperCase();
        s= " " +s+" ";
        int i, j, k, m, n=0;
        int l= s.length();
        String e= " ";
        for(i=0; i<l-1; i++)
        {
            char c= s.charAt(i);
            if(c== ' ')
            {
                for(j=i+1; j<l; j++)
                {
                    char h= s.charAt(j);
                    if(h== ' ')
                    {
                        String p= s.substring(i, j);
                        p= p.trim();
                        int f= p.length();
                        for(k=0; k<f; k++)
                        {
                            c= p.charAt(k);
                            if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
                            {
                                if(k==0)
                                {
                                   e= e+ " "+ p+ "AY";
                                   break;
                                }
                                n= n+1;
                            }
                        }
                        if(n!=0)
                        {
                            n=0;
                            for(m=0; m<f; m++)
                            {
                                h= p.charAt(m);
                                if((h=='A')||(h=='E')||(h=='I')||(h=='O')||(h=='U'))
                                {
                                    p= p.substring(m, f)+ p.substring(0, m);
                                    p= p+ "AY";
                                    e= e+ " "+ p;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            if(k==0)
                            {
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("Final Answer:- "+e);
    }
}