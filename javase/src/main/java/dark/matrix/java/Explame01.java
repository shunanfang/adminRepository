package dark.matrix.java;

/**
 * User: Riley
 * Date: 2020/11/26
 * Description: 测试try-catch 中return的问题
 */
public class Explame01 {

    public static void main(String[] args) {
        int i = 10;

       int a = result(i);
        System.out.println(a);

    }

    public static int result(int i){

        try {
            i = 11;
            return i; //先返回
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            i++;  //再执行
        }

        return i;
    }
}
