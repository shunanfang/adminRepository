package dark.matrix.string;

import java.io.UnsupportedEncodingException;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 字符串的转码
 */
public class StringTranscoding {
    public static void main(String[] args) {
        String s1 = "欲望满足的瞬间，即是偿还的时刻！";
        try {
            String s2 = new String(s1.getBytes("UTF-8"));
            System.out.println(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
