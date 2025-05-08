import java.util.*;
class Employee
{
    long eno;
    String ename;
    int age;
    long basic;
    double net;
    void accept()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name, phone number, age, basic salary respectively");
        ename= in.nextLine();
        eno= in.nextLong();
        age= in.nextInt();
        basic= in.nextLong();
    }
    void calculate()
    {
        double hra= (18.5/100)*basic;
        double da= (17.45/100)*basic;
        double pf= (8.10/100)*basic;
        net= basic+ hra+ da- pf;
        if(age>50)
        {
            net+= 5000;
        }
    }
    void print()
    {
        System.out.print(eno+ "\t" +ename+ "\t" +age+ "\t" +basic+ "\t" +net);
    }
    void main()
    {
        Employee ob= new Employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}