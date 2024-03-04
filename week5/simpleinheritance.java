class college {
    String collegeName = "MVGR";
    int collegeCode = 33;
}

class student extends college {
    String name = "Vamsi";
    int roll = 561;
}

class SimpleInherit {
    public static void main(String[] args) {
        student student1 = new student();
        System.out.println("Student name: "+student1.name);
        System.out.println("Student roll num : "+student1.roll);
        System.out.println("Student college name : "+student1.collegeName);
    }
}
