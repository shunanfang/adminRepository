package dark.matrix.random;


import java.sql.SQLOutput;
import java.util.UUID;

/**
 * User: Riley
 * Date: 2020/11/3
 * Description: 测试生成的随机数
 */
public class RandomTest {

   public static void main(String[] args){

       String randomStr = UUID.randomUUID().toString().replaceAll("-","").toString();
       System.out.println(randomStr);
   }
}
