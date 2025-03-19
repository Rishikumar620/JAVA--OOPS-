public class Code {
    public static void main(String[] args) {
        Student s1 = new Student("Rishi", "B-tech",112500);
        System.out.println(s1);
    }
}
class Student {
    private String Name,Course;
    private double fee;
    public Student(String Name , String Course ,double fee ){
        this.Name= Name;
        this.Course = Course;
        this.fee=fee;
    }
    public String toString(){
        return this.Name +" , "+this.Course+" , "+this.fee;
    }

}