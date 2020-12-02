package dark.matrix.string;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 字符串的反转
 */
public class StirngLnvert {

    public static String reverse(String orginStr){
        if(orginStr == null || orginStr.length() < 1) {
            return orginStr;
        }else{
            return reverse(orginStr.substring(1))+ orginStr.charAt(0);
        }
    }

    public static void main(String[] args){

        String str = "abcdefghijklmnopqrstuvwxyz";

        //获取的字符串是一个新的字符串，并不是改变了原来的字符串
        String s = reverse(str);

        System.out.println(s);
    }
}
