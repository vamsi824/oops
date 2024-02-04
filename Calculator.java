import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float x,y;
        System.out.print("Enter number 1: ");
        x=input.nextFloat();
        System.out.println("Enter number 2: ");
        y=input.nextFloat();
        int choice;
        System.out.println("1.Addition,2.Substraction,3.Multiplication,4.Division.");
        System.out.println("Enter any choice: ");
        choice=input.nextInt();
        if(choice==1){
            System.out.println(x+"+"+y+"="+(x+y));
            System.out.println("the output"+(x+y)+"is printed");
        }
        else if(choice==2)
        {
            System.out.println(x+"-"+y+"="+(x-y));
            System.out.println("the output"+(x-y)+"is printed");
        }
          else if(choice==3){
            System.out.println(x+"*"+y+"="+(x*y));
            System.out.println("the output"+(x*y)+"is printed");
        }
        else if(choice==4){
            System.out.println(x+"/"+y+"="+(x/y));
            System.out.println("the output"+(x/y)+"is printed");
        }
        else{
            System.out.println("you have entered wrong choice please check the above menu and continue!!");
        }
        input.close();
    }
}

