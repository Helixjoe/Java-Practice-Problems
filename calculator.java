import java.util.*;
public class calculator {
    
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first operand");
        int a = inp.nextInt();
        System.out.println("Enter second operand");
        int b = inp.nextInt();
        System.out.println("Enter choice\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        int ch = inp.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case 2:
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case 3:
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case 4:
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
        }

    }
}
