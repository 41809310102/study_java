package number;

import com.sun.jdi.IntegerValue;

public class Demo01 {

        public static void main (String []args)
        {
//            int a = 12;
//            int b = 20;
//            System.out.println(Math.max(a, b));

              Character b = 'a';
            System.out.println(Character.isLetter('7'));

            String str = "hujunjie";
////            a = 97; 26个
////            A = 65; B = 66
//            'a'-'z'
//             'A'-'Z'
            char a = '1';
            char A = '1';
            System.out.println((int)a);
            System.out.println((int)A);
            int c = (int)a;
            if(c<=123&&c>65){
                System.out.println("是一个字母");
            }else{
                System.out.println("NONONO");
            }
        }
}
