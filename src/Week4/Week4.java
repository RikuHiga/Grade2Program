package Week4;

import java.util.Arrays;
import java.util.Scanner;
public class Week4 {
    public static void main(String[] args){
        //P353　例題15.3
        double[] data=new double[5];
        Scanner in =new Scanner(System.in);
        for(int i=0;i<data.length;i++){
            System.out.println("値は?(double=>");
            String input=in.nextLine();
            data[i]=Double.parseDouble(input);
        }
        String list=Arrays.toString(data);
        System.out.println(list);
    }
}
