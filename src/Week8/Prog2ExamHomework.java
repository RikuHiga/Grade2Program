package Week8;
import java.util.ArrayList;

class Student{
    String name;
    int math;
    int english;
    int japanese;

    Student(String name,int math,int english,int japanese){
        this.name=name;
        this.math=math;
        this.english=english;
        this.japanese=japanese;
    }
    float sumPoint(){
        return math+english+japanese;
    }
}
class Gakyu{
    String teacherName;
    ArrayList<Student> students;

    Gakyu(String teacherName){
        this.teacherName=teacherName;
        students=new ArrayList<>();
    }

    float japaneseAvg(){
        int sum=0;
        for(var student:students){
            sum+=student.japanese;
        }
        return sum/students.size();
    }
    float englishAvg(){
        int sum=0;
        for(var student:students){
            sum+=student.english;
        }
        return sum/students.size();
    }
    float mathAvg(){
        int sum=0;
        for(var student:students){
            sum+=student.math;
        }
        return sum/students.size();
    }

    float average(){
        int sum=0;
        int numSubject=3;
        for(var student:students){
            sum+=student.english+student.math+student.japanese;
        }
        return sum/(students.size()*numSubject);
    }
    void printStudent(){
        for(var student:students){
            System.out.println("名前"+student.name+",数学"+student.math+",英語"+student.english+",国語"+student.japanese);
        }
    }
}


public class Prog2ExamHomework {
    public static void main(String[] args){
        Gakyu gakyu1=new Gakyu("田中");
        gakyu1.students.add(new Student("佐藤",30,40,50));
        gakyu1.students.add(new Student("鈴木",40,50,60));
        gakyu1.students.add(new Student("高橋",50,60,70));

        Gakyu gakyu2=new Gakyu("伊藤");
        gakyu2.students.add(new Student("渡辺",60,70,80));
        gakyu2.students.add(new Student("山本",70,80,90));
        gakyu2.students.add(new Student("中村",80,90,100));

        gakyu1.printStudent();
        gakyu2.printStudent();
        System.out.println("数学平均"+gakyu1.mathAvg()+",英語平均"+ gakyu1.englishAvg()+"国語平均"+gakyu1.japaneseAvg()+"全体平均"+gakyu1.average());
        System.out.println("数学平均"+gakyu2.mathAvg()+",英語平均"+ gakyu2.englishAvg()+"国語平均"+gakyu2.japaneseAvg()+"全体平均"+gakyu2.average());
        System.out.println(gakyu1.students.get(0).name+"の合計点数は"+gakyu1.students.get(0).sumPoint());
    }
}
