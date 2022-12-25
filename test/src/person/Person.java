package person;

import cals.Calcu;

public class Person{
     String name;
     String sex;
     String sfz;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    static void Sleep(){
        System.out.println("sleep");
    }

    static void eat(){
        System.out.println("eat");
    }

    public void work(){
        System.out.println("work");
    }

    public void useCalcu(){
        //创建一个计算器
//        Calcu a = new Calcu(1,2,3,4);
        //使用计算器中的某个方法
//        a.add();
//        a.jianFa();
//        a.chenFa();
//        a.cuFa();
    }
}
