public class BoxandUnbox {
    public static void main(String[] args)
    {
        //Boxing
        Integer x = new Integer(40);
        Integer y = new Integer(30);
        //UnBoxing
        int z=y;
        System.out.println("Boxed Value : "+x);
        System.out.println("UnBoxed Value : "+z);
    }
}
