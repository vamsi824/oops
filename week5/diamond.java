class ClassA 
{ 
public 
    void aClass() 
    { 
        System.out.print("I am a ClassA"+"\n"); 
    } 
} 
class ClassB extends ClassA 
{ 
public 
    void bClass() 
    { 
        System.out.print("I am a ClassB"+"\n"); 
    } 
} 
class ClassC extends ClassA 
{ 
public 
    void cClass() 
    { 
        System.out.print("I am a ClassC"+"\n"); 
    }
} 
class DaimondProblem 
{ 
    public static void main(String[] args) 
    { 
        System.out.print("Diamond Problem"+"\n"); 
        ClassB class1=new ClassB(); 
        ClassC class2=new ClassC(); 
        class1.aClass(); 
        class1.bClass(); 
        class2.aClass(); 
        class2.cClass(); 
    } 
}

