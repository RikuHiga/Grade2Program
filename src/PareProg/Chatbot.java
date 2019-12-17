package PareProg;

public class Chatbot {
    private String name;
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }
    public Chatbot(String name){
        this.name = name;
        System.out.println("チャットボット名"+name+"を作成します。");
    }
    public void chat(){
    }
    public void greeting(){
        System.out.println("はじめまして"+name+"です、よろしくおねがいします");
    }
    public String getter(){
        return name;
    }
    public void setter(String name){
        if(name.equals("差別用語")){
            System.out.println("禁止されています");
        }else{
            this.name = name;
        }
    }
}



