import java.util.Scanner;
class student3{
    public 
        String collegeName="MVGR";
        int collegeCode=33;
        student3(){
            System.out.println("Collegename : "+collegeName+"\n Collegecode : "+collegeCode);
        }
        student3(String fullName, double semPerentage){
            System.out.println("Name : "+fullName+"\n Collegecode : "+semPerentage);
        }
        String fullName;
        double semPercentage;

}
public class student {
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student3 vamsi=new student3();
        System.out.print("Enter name");
        vamsi.fullName=op.next();
        System.out.print("Enter Sempercentage");
        vamsi.semPercentage=op.nextInt();
        op.close();
        student3 hi=new student3(vamsi.fullName,vamsi.semPercentage);

    }

}
