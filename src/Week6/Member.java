package Week6;
public class Member {
    private int id;
    private String name;
    public Member(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

class Student extends Member{
    private String studentId;
    public Student(int id, String name, String studentId){
        super(id, name);
        this.studentId=studentId;
    }
    public double discount(){
        return 0.2;
    }
    public String getStudentId(){
        return studentId;
    }
}

