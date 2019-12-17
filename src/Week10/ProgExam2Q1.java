package Week10;

abstract class Human{
    abstract void greet();
}

class Japanese extends Human{
    @Override
    void greet(){
        System.out.println("こんにちは");
    }
}

class Korean extends Human{
    @Override
    void greet(){
        System.out.println("안녕하세요");
    }
}

class Chinese extends Human{
    @Override
    void greet(){
        System.out.println("你好");
    }
}

class ProgExam2Q1{
    static void talk(Human human){
        human.greet();
    }

    public static void main(String[] args){
        talk(new Japanese());
        talk(new Korean());
        talk(new Chinese());
    }
}

