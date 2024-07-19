public class Student {
    private String name;
    private int age;
    private String department;

    Student(String n, int a, String d) {
        name = n;
        age = a;
        department = d;

    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
    }
}
class Main1{
    public static void main(String[] args) {
        Student s1=new Student("khushi",20,"BCA");
        s1.display();
    }
}


