import java.util.Scanner;
public class IT24102794Lab5Q1
{
    public static void main(String[]args)
    {

    int num1,num2,num3,Largest,Smallest;
    Scanner input=new Scanner(System.in);

    System.out.print ("Enter the first integer");
    num1=input.nextInt();

    System.out.print ("Enter the second integer");
    num2=input.nextInt();

    System.out.print ("Enter the third integer");
    num3=input.nextInt();

        if (num1>num2 && num1>num3)
        { 
            Largest=num1;
        }
        else if (num2>num1 && num2>num3)
        {
            Largest=num2;
        }
        else 
        {
            Largest=num3;
        }

        if (num1<num2 && num1<num3)
        {
            Smallest=num1;
        }
        else if (num2<num1 && num2<num3)
        {
            Smallest=num2;
        }
        else 
        {
            Smallest=num3;
        }

        System.out.println ("User entered numbers are : "+num1+" "+num2+" "+num3);
        System.out.println ("The Smallest number is :" +Smallest);
        System.out.println ("The Largest number is :" +Largest);

        input.close();
    }



    
}