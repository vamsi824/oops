import java.util.Scanner;

public class Evenoddfun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value : ");
        int num;
        num=input.nextInt();
        evenorodd(num);
        input.close();
    }
    public static int evenorodd(int n)
    {
        if(n%2==0)
        {
            System.out.println("the number "+n+" is an even number");
        }
        else{
            System.out.println("the number "+n+" is an odd number");
        }
        return 0;
    }
}


Repository
