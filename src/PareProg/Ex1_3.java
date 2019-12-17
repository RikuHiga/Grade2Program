package PareProg;

public class Ex1_3 {
    public static void main(String args[]){
        String str = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics.";
        str = str.replace(",","");
        String[] s = str.split(" ",0);
        String aaa = "";
        for(String a : s){
            aaa+=count(a);
        }
        System.out.println(aaa);
    }
    static int count(String str){
        int num = str.length();
        return num;
    }
}

