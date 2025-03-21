class Course{
    private String name;
    private int duration;
    public Course (String name, int duration){
        this.name=name;
        this.duration=duration;
    }
    public String toString(){
        return this.name+" , "+this.duration;
    }   
}
class Student {
    private int id;
    private String name,qualification;
    private Course course;
    public Student(int id, String name,String qualification,Course course){
        this.id=id;
        this.name=name;
        this.qualification=qualification;
        this.course=course;
    }
    public String toString(){
        return this.id+" , "+ this.name+" , "+ this.qualification+" , "+ this.course;
    }
}

public class Main {
    public static void main(String[] args) {
        Course course =new Course("Java Full Stack",12);
        Student student = new Student(101,"Rishi","B.tech", course);
        System.out.println(student);
    }
    
}
