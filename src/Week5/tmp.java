package Week5;

class Rect{
    double height,width,area;
    void area(){
        area=height*width;
    }
}

class Circle{
    double radius,area;
    void area(){
        area= radius*radius*Math.PI;
    }
}

class dentiu{
    int height,weight,charge,generate,attack,shield;
    void stat(){
        attack=charge*generate;
        shield=height*weight;
    }
}

class student{
    int height,weight,studyTime,gameTime,sleepTime,study,attack,eSports;

    student(int height,int weight,int studyTime,int gameTime,int sleepTime){
        this.height=height;
        this.weight=weight;
        this.studyTime=studyTime;
        this.gameTime=gameTime;
        this.sleepTime=sleepTime;
    }

    void stat(){
        study=studyTime*sleepTime-gameTime;
        attack=height*weight*sleepTime-studyTime-gameTime;
        eSports=gameTime*sleepTime;
    }
}



public class tmp {
    public static void main(String[] args){
        Circle a1=new Circle();
        a1.radius=1;
        a1.area();
        System.out.println(a1.area);
    }
}
