package background;

import Menu.Calsmenu;
import cals.Calcu;

import java.util.Scanner;


public class Game1{

    public static void main(String[] args) {
        Calsmenu calsmenu = new Calsmenu();
        Calcu calcu = new Calcu();
        while (true) {
            calsmenu.menuOne();
            Scanner sc = new Scanner(System.in);
            float x = 0.0f;
            float y = 0.0f;
            System.out.println("请输入要计算的两个数.........");
            System.out.println("请输入第一个数（X）.........");
            x = sc.nextFloat();
            System.out.println("请输入第二个数（Y）.........");
            y = sc.nextFloat();
            System.out.println("请在下面输入你的操作.........");
            int a = sc.nextInt();
            System.out.println("输入的值为:" + a);
            switch (a) {
                case 1:
                    //计算加法
                    calcu.add(x, y);
                    break;
                case 2:
                    //计算减法
                    calcu.jianFa(x, y);
                    break;
                case 3:
                    //计算乘法
                    calcu.chenFa(x, y);
                    break;
                case 4:
                    //计算除法
                    calcu.cuFa(x, y);
                    break;
                case 5:
                    //计算次方
                    calcu.N_chenfa(x,y);
                    break;
                default:
                    //报错
                    System.out.println("非法输入！！！！！！");
            }
        }
    }
}
