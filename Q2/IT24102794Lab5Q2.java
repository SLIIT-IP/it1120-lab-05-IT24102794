import java.util.Scanner;
public class IT24102794Lab5Q2
{
    public static void main(String[]args)
    {
    Scanner x = new Scanner(System.in);
    int number;

    System.out.print("Enter the number of new members introduced: ");
    number = x.nextInt();
     if(number >= 0)
     {
        switch(number)
        {
            case 0 : System.out.print("No prize");
            break;
            case 1 : System.out.print("Pen");
            break;
            case 2 : System.out.print("Umbrella");
            break;
            case 3 : System.out.print("Bag");
            break;
            case 4 : System.out.print("Travelling Chair");
            break;
            default: System.out.print("Prize is a headphone");
            break; }
     }
    else {
        System.out.print("Input must be a number 0 or greater");
    }
        x.close();
     }
}

   