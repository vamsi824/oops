class Multiplication{
    public int multiplication(int a ,int b){
        int result1 = a*b;
        return result1;
    }
    public int multiplication(int a,int b,int c){
        int result2=a*b*c;
        return result2;
    }
}
class Overload{
    public static void main(String[] args)
    {
        Multiplication obj = new Multiplication();
        int result1=obj.multiplication(2,3);
        System.out.println("Product of two numbers: "+result1);
        int result2 =obj.multiplication(8,2,4);
        System.out.println("Product of three numbers : "+result2);
    }
}
