import java.util.Scanner;
public class Helouser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any name : ");
        String user = input.nextLine();
        System.out.println("hello "+user);
        input.close();
    }
}

