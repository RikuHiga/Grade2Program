package PareProg;

public class Main {
    public static void main(String[] agrs){
        Chatbot bot1 =new Chatbot();
        Chatbot bot2 = new Chatbot("abc");
        System.out.println("main method runs");
        bot1.greeting();
        bot2.greeting();
        //bot2.name="def";
        bot2.setter("差別用語");
        bot2.greeting();
        bot2.setter("安全");
        bot2.greeting();
    }
}


