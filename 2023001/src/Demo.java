public class Demo {


    public static void main(String[] args) {
        String a = "285154359qq.com";

        isMail(a);
    }


    //用户登录
    public int loginUser(String username,String password){
        String username_succ = "hujunjie";
        String password_succ = "123456";

        if(username==username_succ&&password_succ==password){
            System.out.println("登录成功");
            return 1;
        }else{
            System.out.println("登录失败！！！请检测账号密码");
            return 0;
        }
    }


    //更改地址
    public static void loAcl(String address,boolean flag){
        String address_a = "xxxxxxx";
        if(flag){
            System.out.println("我的地址:"+address);
        }else{
            System.out.println("我的地址:"+address_a);
        }
    }

    //验证邮箱是否合法
    public static void isMail(String mail){
        char[] ar = mail.toCharArray();
        boolean ischeck = false;
        for(char s : ar ){
            if(s=='@'){
                System.out.println("合法");
                ischeck = true;
            }
        }
        if(!ischeck){
            System.out.println("不合法邮箱");
        }
    }

}
