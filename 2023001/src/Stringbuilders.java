public class Stringbuilders{

    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("真丝羊毛白色休闲西装外套女高级感小个子春秋新款2022设计感小众");
        System.out.println(sBuffer.length());
        sBuffer.replace(27,35,"...");
        System.out.println(sBuffer);
    }


}
