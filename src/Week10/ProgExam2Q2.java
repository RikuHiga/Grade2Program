package Week10;

class Player{
    String name="ああああ";
}
abstract class Skill{
    Player player=new Player();
    abstract void skill();
}
class Fighting extends Skill{
    @Override
    void skill(){
        System.out.println(player.name+"は攻撃した");
    }
}
class Magic extends Skill{
    @Override
    void skill(){
        System.out.println(player.name+"は魔法を放った");
    }
}
class Tool extends Skill{
    @Override
    void skill(){
        System.out.println(player.name+"はアイテムを使った");
    }
}

class ProgExam2Q2{
    static void action(Skill skill){
        skill.skill();
    }
    public static void main(String[] args){
        action(new Fighting());
        action((new Magic()));
        action((new Tool()));
    }
}
