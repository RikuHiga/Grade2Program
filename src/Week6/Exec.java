package Week6;

public class Exec {
    public static void main(String[] args){
        Student stuMember=new Student(118,"田中宏","A711");
        System.out.println(stuMember.getId()+"/"+//Studentのidはprivateなためgetメソッドを使わないとアクセスできない
                stuMember.getName()+"/"+
                stuMember.getStudentId());
    }
}

