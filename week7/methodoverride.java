class Parent{
    void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child");
    }
}
class main{
    public static void main(String[] args){
        Parent obj = new Parent();
        obj.display();
        Parent obj1 = new Child();
        obj1.display();
    }
}
